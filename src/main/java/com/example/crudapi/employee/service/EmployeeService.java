package com.example.crudapi.employee.service;

import com.example.crudapi.entity.Employee;

import java.util.List;

public interface EmployeeService {

    List<Employee> findAll();

    Employee findById(int theEmployeeId);

    Employee save(Employee theEmployeeId);

    void deleteById(int theEmployeeId);

}
