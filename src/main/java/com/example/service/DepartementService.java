package com.example.service;

import com.example.repository.DepartementRepository;

public interface DepartementService {
    String returnDepartementName();
    void setDepartementRepository(DepartementRepository departementRepository);
}
