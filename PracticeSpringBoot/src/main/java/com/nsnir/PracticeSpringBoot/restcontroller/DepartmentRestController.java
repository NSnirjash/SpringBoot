package com.nsnir.PracticeSpringBoot.restcontroller;

import com.nsnir.PracticeSpringBoot.entity.Department;
import com.nsnir.PracticeSpringBoot.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/dep/api")
public class DepartmentRestController {

    @Autowired
    private DepartmentService departmentService;

    @GetMapping("/view")
    public List<Department> getAllDepartments() {
        return departmentService.getAllDepartments();
    }

    @PostMapping("/save")
    public void saveDepartment(@RequestBody Department department) {
        departmentService.saveDepartment(department);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteDepartment(@PathVariable ("id") int id) {
        departmentService.deleteDepartmentById(id);
    }

    @PutMapping("/update/{id}")
    public void updateDepartment(@RequestBody Department department, @PathVariable ("id") int id) {
        departmentService.updateDepartments(department, id);
    }

}
