package org.example.movie.service.impl;

import com.nimbusds.jose.*;
import com.nimbusds.jose.crypto.MACSigner;
import com.nimbusds.jose.crypto.MACVerifier;
import com.nimbusds.jwt.JWTClaimsSet;
import com.nimbusds.jwt.SignedJWT;
import lombok.experimental.NonFinal;
import org.example.movie.entity.Account;
import org.example.movie.model.request.IntrospectRequest;
import org.example.movie.model.response.AuthenticationResqonse;
import org.example.movie.model.response.IntrospectResponse;
import org.example.movie.repository.AccountRepository;
import org.example.movie.model.request.AuthenticationRequest;
import org.example.movie.service.AuthenticationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.Date;

@Service
public class ActhenticationServiceImpl implements AuthenticationService {

    @Autowired
    private AccountRepository accountRepositorys;

    @NonFinal
    protected static final String SIGNER_KEY =
            "w6xLrEVN6M6BKz1TVvJpMGvSt3bikhTMt0mt7WlhBytVPp/x67whMH6Mtzd6amft";
    @Override
    public AuthenticationResqonse authenticate(AuthenticationRequest request) {
        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
        var account = accountRepositorys.findByFullName(request.getFullName()).orElseThrow(()
        -> new RuntimeException("user not existed"));

        boolean authenticated =  passwordEncoder.matches(request.getPassword(), account.getPassword());

        if (!authenticated)
            throw new RuntimeException("Unauthenticated account");

        var token = generateToken(account);
        return AuthenticationResqonse.builder()
                .token(token)
                .authenticated(true)
                .build();
    }

    @Override
    public IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException {
        var token = request.getToken();

        JWSVerifier verifier = new MACVerifier(SIGNER_KEY.getBytes());

        SignedJWT signedJWT = SignedJWT.parse(token);

        Date expiration = signedJWT.getJWTClaimsSet().getExpirationTime();

        var verified = signedJWT.verify(verifier);

        return IntrospectResponse.builder()
                .valid(  verified && expiration.after(new Date()) )
                .build();
    }

    public String generateToken(Account account) {
        JWSHeader jwsHeader = new JWSHeader(JWSAlgorithm.HS512);
        JWTClaimsSet jwtClaimsSet = new JWTClaimsSet.Builder()
                .subject(account.getFullName())
                .issuer("devteria.com")
                .issueTime(new Date())
                .expirationTime(new Date(
                        Instant.now().plus(1, ChronoUnit.HOURS).toEpochMilli()
                ))
                .claim("scope",account.getRole())
                .build();

        Payload payload = new Payload(jwtClaimsSet.toJSONObject());
        JWSObject jwsObject = new JWSObject(jwsHeader,payload);

        try {
            jwsObject.sign(new MACSigner(SIGNER_KEY.getBytes()));
            return jwsObject.serialize();
        } catch (JOSEException e) {
            throw new RuntimeException(e);
        }
    }
}
