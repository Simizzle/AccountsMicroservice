package com.simonmorgan.Accounts.service.impl;

import com.simonmorgan.Accounts.constants.AccountsConstants;
import com.simonmorgan.Accounts.dto.CustomerDto;
import com.simonmorgan.Accounts.entity.Accounts;
import com.simonmorgan.Accounts.entity.Customer;
import com.simonmorgan.Accounts.mapper.CustomerMapper;
import com.simonmorgan.Accounts.repository.AccountsRepository;
import com.simonmorgan.Accounts.repository.CustomerRepository;
import com.simonmorgan.Accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Random;

@Service
@AllArgsConstructor
public class AccountsServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {
        Customer customer = CustomerMapper.mapToCustomer(customerDto, new Customer());
        Customer savedCustomer = customerRepository.save(customer);
        accountsRepository.save(createNewAccount(savedCustomer));
    }

    /**
     * @param customer - Customer Object
     * @return the new account details
     */
    private Accounts createNewAccount(Customer customer) {
        Accounts newAccount = new Accounts();
        newAccount.setCustomerId(customer.getCustomerId());
        long randomAccNumber = 1000000000L + new Random().nextInt(900000000);

        newAccount.setAccountNumber(randomAccNumber);
        newAccount.setAccountType(AccountsConstants.SAVINGS);
        newAccount.setBranchAddress(AccountsConstants.ADDRESS);
        return newAccount;
    }
}
