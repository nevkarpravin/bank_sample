package com.bank.main.service;

import com.bank.main.model.Account;

public interface AccountService {
        String createAccount();
        boolean deleteAccount();
        Account getAccount();
}
