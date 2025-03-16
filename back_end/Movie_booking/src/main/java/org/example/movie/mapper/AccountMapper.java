package org.example.movie.mapper;

import org.example.movie.entity.Account;
import org.example.movie.model.request.AccountCreateRequest;
import org.example.movie.model.request.AccountUpdateRequest;
import org.example.movie.model.response.AccountResponse;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface AccountMapper {

    Account toAccount(AccountCreateRequest request);

    AccountResponse toAccountResponse(Account account);

    void updateAccount(@MappingTarget Account account , AccountUpdateRequest request);
}
