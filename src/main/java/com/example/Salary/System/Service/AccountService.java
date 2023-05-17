package com.example.Salary.System.Service;
import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public void saveAccount(Account account) {
        accountRepository.save(account);
    }
    public List<Account> getAccount(){
        return accountRepository.findAll();
    }


}
