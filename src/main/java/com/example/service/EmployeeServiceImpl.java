package com.example.service;

import com.example.repository.EmployeeRepository;

public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository employeeRepository){
        this.employeeRepository=employeeRepository;
    }

    public String returnEmployeeName(){
        return employeeRepository.returnEmployeeName();
    }
}
