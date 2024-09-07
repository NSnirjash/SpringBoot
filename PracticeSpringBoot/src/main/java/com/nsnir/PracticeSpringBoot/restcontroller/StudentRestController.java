package com.nsnir.PracticeSpringBoot.restcontroller;


import com.nsnir.PracticeSpringBoot.entity.Student;
import com.nsnir.PracticeSpringBoot.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student/api")
public class StudentRestController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/view")
    private List<Student> getAllStudents() {
        return studentService.getAllStudents();
    }

    @PostMapping("save")
    public void saveStudent(@RequestBody Student student) {
        studentService.saveStudent(student);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteStudent(@PathVariable int id) {
        studentService.deleteStudentById(id);
    }

    @PutMapping("/update/{id}")
    public void updateStudent(@PathVariable int id, @RequestBody Student student) {
        studentService.updateStudent(student, id);
    }


}
