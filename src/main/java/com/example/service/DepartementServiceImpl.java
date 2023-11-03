package com.example.service;

import com.example.repository.DepartementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*
@Service(value="departementService")
*/
public class DepartementServiceImpl implements DepartementService {
    private DepartementRepository departementRepository;

    //@Autowired
   /* public DepartementServiceImpl(DepartementRepository departementRepository){
        this.departementRepository=departementRepository;
    }*/

    public DepartementServiceImpl(){};

    //@Autowired
    public void setDepartementRepository(DepartementRepository departementRepository){
        this.departementRepository=departementRepository;
    }

    public String returnDepartementName(){
        return departementRepository.returnDepartementName();
    }
}
