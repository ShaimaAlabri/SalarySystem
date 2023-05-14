package com.example.Salary.System.Controller;
import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class EmployeeController {
    @Autowired
    EmployeeService employeeService;

    @RequestMapping("employee/create")
    public void saveEmployee () {
        createEmployee();
    }

    public void createEmployee() {

        Employee employee = new Employee();
        employee.setName("Abdullah");
        employee.setGender("Male");
        employee.setSalary(650.0);
        employee.setDepartment("IT");
        employee.setCompanyName("TechM");
        employee.setCreatedDate(new Date());
        employee.setIsActive(true);
        employeeService.saveEmployee(employee);
    }

}
