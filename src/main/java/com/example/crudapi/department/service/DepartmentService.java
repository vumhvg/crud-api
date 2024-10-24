package com.example.crudapi.department.service;

import com.example.crudapi.entity.Department;

import java.util.List;

public interface DepartmentService {

    List<Department> findAll();

    Department findById(int theDepartmentId);

    Department save(Department theDepartmentId);

    void deleteById(int theDepartmentId);

}