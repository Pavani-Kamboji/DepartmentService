package com.example.microServices.service.impl;

import com.example.microServices.entity.Department;
import com.example.microServices.repository.DepartmentRepository;
import com.example.microServices.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Override
    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    @Override
    public Department getDepartmentById(Long id) {
        return departmentRepository.findById(id).get();
    }

    @Override
    public Department saveDepartment(Department newDepartment) {
        return departmentRepository.save(newDepartment);
    }
}
