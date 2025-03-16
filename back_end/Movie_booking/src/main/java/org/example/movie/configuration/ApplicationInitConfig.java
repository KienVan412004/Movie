//package org.example.movie.configuration;
//
//import lombok.RequiredArgsConstructor;
//import lombok.extern.slf4j.Slf4j;
//import org.example.movie.entity.Account;
//import org.example.movie.enums.Role;
//import org.example.movie.repository.AccountRepository;
//import org.springframework.boot.ApplicationRunner;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
//@Configuration
//@RequiredArgsConstructor
//@Slf4j
//public class ApplicationInitConfig {
//
//    @Bean
//    ApplicationRunner applicationRunner(AccountRepository accountRepository){
//
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
//        return args -> {
//            if(accountRepository.findByFullName("admin").isEmpty()){
//                Account account = Account.builder()
//                        .fullName("admin")
//                        .password(passwordEncoder.encode("admin"))
//                        .role(String.valueOf(Role.ADMIN))
//                        .build();
//
//                 accountRepository.save(account);
//                 log.warn("admin user has been created with default password : admin , please change it");
//            }
//        };
//    }
//
//}
