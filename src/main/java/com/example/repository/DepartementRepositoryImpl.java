package com.example.repository;

import com.example.model.Departement;
import org.springframework.stereotype.Repository;

/*
@Repository
*/
public class DepartementRepositoryImpl implements DepartementRepository {
    public String returnDepartementName(){
        Departement departement=new Departement();
        return departement.getName();
    }
}
