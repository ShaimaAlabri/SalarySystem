package com.example.Salary.System.Service;
import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Repository.AccountRepository;
import com.example.Salary.System.ResponseObjects.GetAccountResponse;
import com.example.Salary.System.ResponseObjects.GetEmployeeResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;

    public void saveAccount(Account account) {
        accountRepository.save(account);
    }

    public List<Account> getAccount() {
        return accountRepository.findAll();
    }

    public GetAccountResponse getAccountById(Long accountId) {
        Optional<Account> optionalAccount = accountRepository.findById(accountId);
        if (!optionalAccount.isEmpty()) {
            Account account = optionalAccount.get();
            GetAccountResponse accountResponse = new GetAccountResponse(account.getBankName(), account.getAccountNumber());
            return accountResponse;
        }

        return null;

    }
}