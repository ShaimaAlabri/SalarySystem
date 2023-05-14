package com.example.Salary.System.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@Setter
@Data

public class Manager extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Integer id;

    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @OneToOne(cascade = CascadeType.ALL)
    Employee employee;

    @JoinColumn(name = "employee_id", referencedColumnName = "id")
    @OneToMany(cascade = CascadeType.ALL)
    List<Employee> team;

    String department;

    String teamName;


}
