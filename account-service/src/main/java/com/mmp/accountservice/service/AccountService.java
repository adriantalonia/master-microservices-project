package com.mmp.accountservice.service;

import com.mmp.accountservice.model.entity.Account;

import java.util.UUID;

public interface AccountService {
    Account findByCustomerId(int id);
}
