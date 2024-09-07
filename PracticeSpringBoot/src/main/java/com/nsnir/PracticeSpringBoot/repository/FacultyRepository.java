package com.nsnir.PracticeSpringBoot.repository;


import com.nsnir.PracticeSpringBoot.entity.Faculty;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FacultyRepository extends JpaRepository<Faculty, Integer> {
}
