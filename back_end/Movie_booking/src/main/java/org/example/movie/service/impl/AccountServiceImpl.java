//package org.example.movie.service.impl;
//
//import org.example.movie.enums.Role;
//import org.example.movie.repository.AccountRepository;
//import org.example.movie.entity.Account;
//import org.example.movie.mapper.AccountMapper;
//import org.example.movie.model.request.AccountCreateRequest;
//import org.example.movie.model.request.AccountUpdateRequest;
//import org.example.movie.model.response.AccountResponse;
//import org.example.movie.service.AccountService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.core.context.SecurityContextHolder;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.stereotype.Service;
//
//import java.util.List;
//
//@Service
//public class AccountServiceImpl implements AccountService {
//
//    @Autowired
//    private AccountRepository accountRepositorys;
//
//    @Autowired
//    private AccountMapper accountMapper;
//
//    @Override
//    public Account createAccount(AccountCreateRequest request) {
//
//        if(accountRepositorys.existsByFullName(request.getFullName()))
//            throw  new RuntimeException("full name already exists");
//
//        Account account = accountMapper.toAccount(request);
//
//        PasswordEncoder passwordEncoder = new BCryptPasswordEncoder(10);
//        account.setPassword(passwordEncoder.encode(request.getPassword()));
//        account.setRole(String.valueOf(Role.USER));
//        return accountRepositorys.save(account);
//
//    }
//
//    @Override
//    public List<Account> getAllAccounts() {
//        return accountRepositorys.findAll();
//    }
//
//    @Override
//    public AccountResponse getAccountById(String id) {
//        return accountMapper.toAccountResponse(accountRepositorys.findById(id).orElseThrow(()
//                -> new RuntimeException("user not found")));
//    }
//
//    @Override
//    public void deleteAccountById(String id) {
//        accountRepositorys.deleteById(id);
//    }
//
//    @Override
//    public Account updateAccount(AccountUpdateRequest request, String id) {
//        Account account = accountRepositorys.findById(id).orElseThrow(() -> new RuntimeException("user not found"));
//
//       accountMapper.updateAccount(account,request);
//
//        return accountRepositorys.save(account);
//    }
//
//    @Override
//    public AccountResponse getMyInfo() {
//        var context = SecurityContextHolder.getContext();
//        String username = context.getAuthentication().getName();
//
//        Account account =  accountRepositorys.findByFullName(username).orElseThrow(() -> new RuntimeException("user not found"));
//        return accountMapper.toAccountResponse(account);
//    }
//
//}
