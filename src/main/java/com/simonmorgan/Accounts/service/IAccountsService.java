package com.simonmorgan.Accounts.service;

import com.simonmorgan.Accounts.dto.CustomerDto;

public interface IAccountsService {

    void createAccount(CustomerDto customerDto);
}
