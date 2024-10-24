package com.example.crudapi.entity;

import jakarta.persistence.*;

@Entity
@Table(name="employee")
public class Employee {

    // define fields
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int employee_id;

    private String employee_name;

    private String employee_phone;

    private String employee_email;

    private String employee_address;

    private int department_id;

    private String employee_role;

    // define constructors
    public Employee() {

    }

    public Employee(String employee_name, String employee_phone, String employee_email,
                    String employee_address, int department_id, String employee_role) {
        this.employee_name = employee_name;
        this.employee_phone = employee_phone;
        this.employee_email = employee_email;
        this.employee_address = employee_address;
        this.department_id = department_id;
        this.employee_role = employee_role;
    }

    // define getters/setters

    public int getEmployee_id() {
        return employee_id;
    }

    public void setEmployee_id(int employee_id) {
        this.employee_id = employee_id;
    }

    public String getEmployee_name() {
        return employee_name;
    }

    public void setEmployee_name(String employee_name) {
        this.employee_name = employee_name;
    }

    public String getEmployee_phone() {
        return employee_phone;
    }

    public void setEmployee_phone(String employee_phone) {
        this.employee_phone = employee_phone;
    }

    public String getEmployee_email() {
        return employee_email;
    }

    public void setEmployee_email(String employee_email) {
        this.employee_email = employee_email;
    }

    public String getEmployee_address() {
        return employee_address;
    }

    public void setEmployee_address(String employee_address) {
        this.employee_address = employee_address;
    }

    public int getDepartment_id() {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }

    public String getEmployee_role() {
        return employee_role;
    }

    public void setEmployee_role(String employee_role) {
        this.employee_role = employee_role;
    }

    // define toString() method
    @Override
    public String toString() {
        return "Employee{" +
                "employee_id=" + employee_id +
                ", employee_name='" + employee_name + '\'' +
                ", employee_phone='" + employee_phone + '\'' +
                ", employee_email='" + employee_email + '\'' +
                ", employee_address='" + employee_address + '\'' +
                ", department_id=" + department_id +
                ", employee_role='" + employee_role + '\'' +
                '}';
    }
}
