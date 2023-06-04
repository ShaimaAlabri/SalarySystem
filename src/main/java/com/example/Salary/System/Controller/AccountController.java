package com.example.Salary.System.Controller;
import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.RequstObjects.GetAccountRequstObject;
import com.example.Salary.System.ResponseObjects.GetAccountResponse;
import com.example.Salary.System.ResponseObjects.GetEmployeeResponse;
import com.example.Salary.System.Service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Date;
import java.util.List;

@RestController
public class AccountController {

        @Autowired
        AccountService accountService;

        @GetMapping("account/create")
        public void saveAccount (@RequestParam String name, @RequestParam String bankName) {

            GetAccountRequstObject obj = new GetAccountRequstObject();
            obj.setBankName(bankName);
            accountService.createAccount(obj);
        }

        @GetMapping("account/get")
        public List<Account> getAccount () {
            return accountService.getAccount();
        }
//update

        //Path Variable
        @RequestMapping("account/get/{accountId}")
        public GetAccountResponse createAccount (@PathVariable Long accountId) {
            return accountService.getAccountById(accountId);
        }




    public void createAccount(Long accountRequestObject){
        Account account=new Account();

        account.setBankName(accountRequestObject.getBabkname());
        account.setAccountNumber(accountRequestObject.getAccountNumber());

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
