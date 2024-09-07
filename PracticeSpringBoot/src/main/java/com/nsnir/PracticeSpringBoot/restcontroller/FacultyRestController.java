package com.nsnir.PracticeSpringBoot.restcontroller;


import com.nsnir.PracticeSpringBoot.entity.Faculty;
import com.nsnir.PracticeSpringBoot.repository.FacultyRepository;
import com.nsnir.PracticeSpringBoot.service.FacultyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/faculty/api")
public class FacultyRestController {

    @Autowired
    private FacultyService facultyService;


    @GetMapping("/view")
    public List<Faculty> getAllFaculty(){
        return facultyService.getAllFaculty();
    }

    @PostMapping("/save")
    public void saveFaculty(@RequestBody Faculty faculty){
        facultyService.saveFaculty(faculty);
    }

    @PutMapping("/update")
    public void updateFaculty(@PathVariable ("id") int id, @RequestBody Faculty faculty){
        facultyService.updateFaculty(faculty, id);
    }

    @DeleteMapping("/delete")
    public void deleteFaculty(@PathVariable int  id){
        facultyService.deleteFaculty(id);
    }

}
