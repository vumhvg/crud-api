package com.example.crudapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "department")
public class Department {
    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name= "department_id")
    private int department_id;

    @Column(name = "department_name")
    private String department_name;

    // define constructors
    public Department(){

    }

    public Department(String department_name) {
        this.department_name = department_name;
    }

    // define getters/setters
    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getDepartment_name() {
        return department_name;
    }

    public void setDepartment_name(String department_name) {
        this.department_name = department_name;
    }

    // define toString() method
    @Override
    public String toString() {
        return "Department{" +
                "department_id=" + department_id +
                ", department_name='" + department_name + '\'' +
                '}';
    }
}
