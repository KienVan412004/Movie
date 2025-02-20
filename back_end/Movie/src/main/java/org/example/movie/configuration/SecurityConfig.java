package org.example.movie.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.oauth2.jose.jws.MacAlgorithm;
import org.springframework.security.oauth2.jwt.JwtDecoder;
import org.springframework.security.oauth2.jwt.NimbusJwtDecoder;
import org.springframework.security.web.SecurityFilterChain;

import javax.crypto.spec.SecretKeySpec;

@Configuration
@EnableWebSecurity
@EnableMethodSecurity
public class SecurityConfig {

    public final String[] PUBLIC_ENDPOINTS =  {"api/account/create",
            "api/auth/token","api/auth/introspect"
    };

    protected static final String SIGNER_KEY =
            "w6xLrEVN6M6BKz1TVvJpMGvSt3bikhTMt0mt7WlhBytVPp/x67whMH6Mtzd6amft";

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
            http.authorizeHttpRequests(request ->
                    request.requestMatchers(HttpMethod.POST,PUBLIC_ENDPOINTS).permitAll()
                            .requestMatchers(HttpMethod.GET,"api/account/")
                            .hasAuthority("SCOPE_ADMIN")
                    .anyRequest().authenticated());
            http.oauth2ResourceServer( oauth2 ->
                    oauth2.jwt(jwtConfigurer -> jwtConfigurer.decoder(jwtDecoder()))
            );

            http.csrf(AbstractHttpConfigurer ::disable);
        return http.build();

    }

    @Bean
    public JwtDecoder jwtDecoder() {

        SecretKeySpec secretKeySpec = new SecretKeySpec(SIGNER_KEY.getBytes(), "HS512");
        return   NimbusJwtDecoder
                .withSecretKey(secretKeySpec)
                .macAlgorithm(MacAlgorithm.HS512)
                .build();
    }

}