package com.example.Salary.System.Controller;
import com.example.Salary.System.Models.Account;
import com.example.Salary.System.Models.Salary;
import com.example.Salary.System.Service.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.List;

@RestController
public class SalaryController {
    @Autowired
    SalaryService salaryService;
    @RequestMapping("salary/create")
    public void saveSalary () {
        createSalary();
    }
    @RequestMapping("salary/get")
    public List<Salary> getSalary(){
        return salaryService.getSalary();
    }
    public void createSalary(){
        Salary salary=new Salary();
        salary.setAllowances(5.00);
        salary.setAmount(650.0);
        salary.setBonus(10.0);
        salary.setHealthCareContribution(0.00);
        salary.setOverTimeAmount(5.0);
        salary.setCreatedDate(new Date());
        salary.setIsActive(true);
    }

}
