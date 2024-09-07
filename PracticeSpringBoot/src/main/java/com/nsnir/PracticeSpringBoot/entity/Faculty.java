package com.nsnir.PracticeSpringBoot.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;

@Entity
@Table(name = "faculties")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(length = 50, nullable = false, unique = true)
    private String name;

    @Column(nullable = false)
    private int totalSeat;

//    @JoinColumn(name = "depId")
//    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    private Department departments;
}
