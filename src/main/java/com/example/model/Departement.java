package com.example.model;

public class Departement {
    private long id;
    private String name="testName";

    public Departement(){

    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
