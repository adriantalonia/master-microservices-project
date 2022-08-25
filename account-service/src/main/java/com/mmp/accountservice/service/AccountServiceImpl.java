package com.mmp.accountservice.service;

import com.mmp.accountservice.exception.ResourceNotFoundException;
import com.mmp.accountservice.model.entity.Account;
import com.mmp.accountservice.repository.AccountRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
public class AccountServiceImpl implements AccountService {

    private final AccountRepository accountRepository;

    @Override
    public Account findByCustomerId(int id) {
        return accountRepository.findByCustomerId(id).orElseThrow(() -> {
            log.info("Account not found by CustomerId: %s", id);
            return new ResourceNotFoundException(String.format("Account not found by CustomerId: %s", id));
        });
    }
}
