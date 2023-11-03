package com.example.repository;

import com.example.model.Employee;

public class EmployeeRepositoryImpl implements EmployeeRepository {
    public String returnEmployeeName(){
        Employee employee=new Employee();
        return employee.getName();
    }
}
