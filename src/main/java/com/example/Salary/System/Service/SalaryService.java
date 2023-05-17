package com.example.Salary.System.Service;
import com.example.Salary.System.Models.Salary;
import com.example.Salary.System.Repository.SalaryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SalaryService {
    @Autowired
    SalaryRepository salaryRepository;
    public void saveSalary(Salary salary){
        salaryRepository.save(salary);
    }
    public List<Salary> getSalary(){
        return salaryRepository.findAll();

    }
}
