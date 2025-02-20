package org.example.movie.service;

import org.example.movie.entity.Account;
import org.example.movie.model.request.AccountCreateRequest;
import org.example.movie.model.request.AccountUpdateRequest;
import org.example.movie.model.response.AccountResponse;

import java.util.List;

public interface AccountService {

    Account createAccount(AccountCreateRequest request);

    List<Account> getAllAccounts();

    AccountResponse getAccountById(String id);

    void deleteAccountById(String id);

    Account updateAccount(AccountUpdateRequest request, String id);

    AccountResponse getMyInfo ();
}
