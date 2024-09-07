package com.nsnir.PracticeSpringBoot.service;

import com.nsnir.PracticeSpringBoot.entity.Department;
import com.nsnir.PracticeSpringBoot.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }
    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).get();
    }

    public void saveDepartment(Department department) {
        departmentRepository.save(department);
    }

    public void deleteDepartmentById(int id) {
        departmentRepository.deleteById(id);
    }

    public void updateDepartments(Department department, int id) {
        departmentRepository.save(department);
    }
}
