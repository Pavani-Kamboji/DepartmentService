package com.example.microServices.service;

import com.example.microServices.entity.Department;

import java.util.List;

public interface DepartmentService {
    List<Department> getAllDepartments();
    Department getDepartmentById(Long id);
    Department saveDepartment(Department newDepartment);
}
