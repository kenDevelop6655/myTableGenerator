package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="Division")
public class Division {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "division_id")
    private Integer sectionId;

    @Column(name = "division_name", nullable = false, length = 50)
    private String divisionName;

    @Column(name = "manager", nullable = false, length = 50)
    private String manager;

    @Column(name = "group_id", nullable = false)
    private Integer groupId;
}
