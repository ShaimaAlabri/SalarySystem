package com.example.Salary.System.Repository;

import com.example.Salary.System.Models.Employee;
import com.example.Salary.System.Models.Manager;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long>{
    @Query("SELECT * FROM Employee WHERE department=:nameOfDepartment")
    Manager getEmployeeByDepartment(@Param("nameOfDepartment") String department);
}
