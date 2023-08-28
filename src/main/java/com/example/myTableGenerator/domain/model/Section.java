package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="Section")
public class Section {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "section_id")
    private Integer sectionId;

    @Column(name = "section_name", length = 50)
    private Integer sectionName;

    @Column(name = "manager", nullable = false, length = 50)
    private String manager;

    @Column(name = "group_id", nullable = false)
    private Integer groupId;

}
