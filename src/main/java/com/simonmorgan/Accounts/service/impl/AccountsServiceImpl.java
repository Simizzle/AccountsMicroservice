package com.simonmorgan.Accounts.service.impl;

import com.simonmorgan.Accounts.dto.CustomerDto;
import com.simonmorgan.Accounts.repository.AccountsRepository;
import com.simonmorgan.Accounts.repository.CustomerRepository;
import com.simonmorgan.Accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
