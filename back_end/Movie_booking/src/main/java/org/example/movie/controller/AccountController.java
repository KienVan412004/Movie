//package org.example.movie.controller;
//
//import jakarta.validation.Valid;
//import lombok.extern.slf4j.Slf4j;
//import org.example.movie.entity.Account;
//import org.example.movie.model.ApiResponse;
//import org.example.movie.model.request.AccountCreateRequest;
//import org.example.movie.model.request.AccountUpdateRequest;
//import org.example.movie.model.response.AccountResponse;
//import org.example.movie.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.web.bind.annotation.*;
//
//import java.util.List;
//
//@RestController
//@RequestMapping("/api/account/")
//@Slf4j
//public class AccountController {
//
//    @Autowired
//    private AccountService accountService;
//
//    @PostMapping("create")
//    public ApiResponse<Account> addAccount(@RequestBody @Valid AccountCreateRequest request) {
//        ApiResponse<Account> apiResponse = new ApiResponse<>();
//
//        apiResponse.setResult(accountService.createAccount(request));
//
//       return apiResponse;
//    }
//
//    @GetMapping("")
//    public ApiResponse<List<Account>> getAllAccounts() {
//
//        var authentication = SecurityContextHolder.getContext().getAuthentication();
//        log.info("Username: " + authentication.getName());
//        log.info("role: " + authentication.getAuthorities());
//
//        ApiResponse<List<Account>> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(accountService.getAllAccounts());
//        return apiResponse;
//    }
//
//    @GetMapping("{userId}")
//    public ApiResponse<AccountResponse> getAccount(@PathVariable String userId) {
//        ApiResponse<AccountResponse> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(accountService.getAccountById(userId));
//        return  apiResponse;
//    }
//    @GetMapping("myInfo")
//    public ApiResponse<AccountResponse> getMyInfo() {
//        ApiResponse<AccountResponse> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(accountService.getMyInfo());
//        return  apiResponse;
//    }
//
//    @PutMapping("update/{userId}")
//    public  ApiResponse<Account> updateAccount(@PathVariable String userId, @RequestBody AccountUpdateRequest request) {
//        ApiResponse<Account> apiResponse = new ApiResponse<>();
//        apiResponse.setResult(accountService.updateAccount(request,userId));
//        return apiResponse;
//    }
//
//    @DeleteMapping("delete/{userId}")
//    public void deleteAccount(@PathVariable String userId) {
//        accountService.deleteAccountById(userId);
//    }
//
//}
