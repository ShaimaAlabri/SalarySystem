package com.example.Salary.System.RequstObjects;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class GetEmployeeRequestObject {
    String name;
    String department;
    String gender;
}
