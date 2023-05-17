package com.example.Salary.System.Controller;
import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Service.AccountService;
import com.example.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {
    @Autowired
    AccountService accountService;

    @RequestMapping("account/create")
    public void saveAccount () {
        createAccount();
    }
    @RequestMapping("account/get")
    public List<Account> getAccount(){
        return accountService.getAccount();
    }
    public void createAccount(){
        Account account=new Account();
        account.setAccountType("Personal");
        account.setAccountNumber("1234567891234");
        account.setAccountHolderName("Abdullah");
        account.setBankName("Bank Muscat");
        account.setBankBranch("Alkhwir");
        account.setBranchCode(112);
        account.setSwiftCode("A451");
        account.setCreatedDate(new Date());
        account.setIsActive(true);
        accountService.saveAccount(account);
    }
}
