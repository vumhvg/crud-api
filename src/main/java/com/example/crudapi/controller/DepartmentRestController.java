package com.example.crudapi.controller;

import com.example.crudapi.entity.Department;
import com.example.crudapi.department.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DepartmentRestController {

    private DepartmentService departmentService;

    @Autowired
    public DepartmentRestController(DepartmentService theDepartmentService) {
        departmentService = theDepartmentService;
    }

    // expose "/departments" and return a list of employees
    @GetMapping("/departments")
    public List<Department> findAll() {
        return departmentService.findAll();
    }

    // add mapping for GET /employees/{employeeId}
    @GetMapping("/departments/{departmentId}")
    public Department getDepartment(@PathVariable int departmentId) {

        Department theDepartment = departmentService.findById(departmentId);

        if (theDepartment == null) {
            throw new RuntimeException("Department id not found - " + departmentId);
        }

        return theDepartment;
    }

    // add mapping for POST /employees - add new employee
    @PostMapping("/departments")
    public Department addDepartment(@RequestBody Department theDepartment) {

        // also just in case they pass an id in JSON ... set id to 0
        // this is to force a save of new item ... instead of update

        theDepartment.setDepartment_id(0);

        Department dbDepartment = departmentService.save(theDepartment);

        return dbDepartment;
    }

    // add mapping for PUT /departments - update existing employee
    @PutMapping("/departments")
    public Department updateDepartment(@RequestBody Department theDepartment) {

        Department dbDepartment = departmentService.save(theDepartment);

        return dbDepartment;
    }

    // add mapping for DELETE /employees/{employeeId} - delete employee
    @DeleteMapping("/departments/{departmentId}")
    public String deleteDepartment(@PathVariable int departmentId) {

        Department tempDepartment = departmentService.findById(departmentId);

        // throw exception if null

        if (tempDepartment == null) {
            throw new RuntimeException("Department id not found - " + departmentId);
        }

        departmentService.deleteById(departmentId);

        return "Deleted department id - " + departmentId;
    }

}
