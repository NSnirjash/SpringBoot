package com.nsnir.PracticeSpringBoot.service;


import com.nsnir.PracticeSpringBoot.entity.Department;
import com.nsnir.PracticeSpringBoot.entity.Faculty;
import com.nsnir.PracticeSpringBoot.entity.Student;
import com.nsnir.PracticeSpringBoot.repository.DepartmentRepository;
import com.nsnir.PracticeSpringBoot.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private DepartmentRepository departmentRepository;

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student getStudentById(int id) {
        return studentRepository.findById(id).get();
    }

//    public void saveStudent(Student student) {
//        studentRepository.save(student);
//    }
public void saveStudent(Student s) {
    Department department = departmentRepository.findById(s.getDepartment().getId())
            .orElseThrow(
                    () -> new RuntimeException("User not found " + s.getDepartment().getId())
            );
    s.setDepartment(department);
    studentRepository.save(s);
}

    public void deleteStudentById(int id) {
        studentRepository.deleteById(id);
    }

    public void updateStudent(Student student, int id) {
        studentRepository.save(student);
    }
}
