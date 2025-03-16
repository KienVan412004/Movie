//package org.example.movie.controller;
//
//import com.nimbusds.jose.JOSEException;
//import lombok.Builder;
//import lombok.RequiredArgsConstructor;
//import org.example.movie.model.ApiResponse;
//import org.example.movie.model.request.AuthenticationRequest;
//import org.example.movie.model.request.IntrospectRequest;
//import org.example.movie.model.response.AuthenticationResqonse;
//import org.example.movie.model.response.IntrospectResponse;
//import org.example.movie.service.AuthenticationService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//import java.text.ParseException;
//
//@RestController
//@RequestMapping("/api/auth/")
//@Builder
//public class AuthenticationController {
//    @Autowired
//    private AuthenticationService authenticationService;
//
//    @PostMapping("token")
//    public ApiResponse<AuthenticationResqonse>authenticate(@RequestBody AuthenticationRequest request) {
//
//    var result = authenticationService.authenticate(request);
//
//    return ApiResponse.<AuthenticationResqonse>builder()
//            .result(result)
//            .build();
//    }
//
//    @PostMapping("introspect")
//    public ApiResponse<IntrospectResponse>authenticate(@RequestBody IntrospectRequest request) throws ParseException, JOSEException {
//
//        var result = authenticationService.introspect(request);
//
//        return ApiResponse.<IntrospectResponse>builder()
//                .result(result)
//                .build();
//    }
//
//
//}
