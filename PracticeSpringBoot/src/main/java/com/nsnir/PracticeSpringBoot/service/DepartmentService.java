package com.nsnir.PracticeSpringBoot.service;

import com.nsnir.PracticeSpringBoot.entity.Department;
import com.nsnir.PracticeSpringBoot.entity.Faculty;
import com.nsnir.PracticeSpringBoot.repository.DepartmentRepository;
import com.nsnir.PracticeSpringBoot.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    private DepartmentRepository departmentRepository;

    @Autowired
    private FacultyRepository facultyRepository;

    public List<Department> getAllDepartments() {
        return departmentRepository.findAll();
    }

    public Department getDepartmentById(int id) {
        return departmentRepository.findById(id).get();

    }

    //    public void saveDepartment(Department department) {
//        departmentRepository.save(department);
//
//    }
    public void saveDepartment(Department m) {
        Faculty faculty = facultyRepository.findById(m.getFaculty().getId())
                .orElseThrow(
                        () -> new RuntimeException("User not found " + m.getFaculty().getId())
                );
        m.setFaculty(faculty);
        departmentRepository.save(m);
    }


    public void deleteDepartmentById(int id) {
        departmentRepository.deleteById(id);
    }

    public void updateDepartments(Department department, int id) {
        departmentRepository.save(department);
    }
}
