package com.nsnir.PracticeSpringBoot.service;


import com.nsnir.PracticeSpringBoot.entity.Faculty;
import com.nsnir.PracticeSpringBoot.repository.FacultyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FacultyService {

    @Autowired
    private FacultyRepository facultyRepository;

    public List<Faculty> getAllFaculty() {
        return facultyRepository.findAll();
    }

    public Faculty findById(int id) {
        return facultyRepository.findById(id).get();
    }

    public void saveFaculty(Faculty faculty) {
        facultyRepository.save(faculty);
    }

    public void deleteFaculty(int id) {
        facultyRepository.deleteById(id);
    }

    public void updateFaculty(Faculty faculty, int id) {
        facultyRepository.save(faculty);
    }
}
