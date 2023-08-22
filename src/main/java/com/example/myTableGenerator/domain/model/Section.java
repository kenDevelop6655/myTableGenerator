package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="SectionUser")
public class Section extends Emp{


    @Column(name = "group_id", nullable = false)
    private Integer groupId;

    @Column(name = "section_name", nullable = false, length = 50)
    private Integer sectionName;

    @Column(name = "manager", nullable = false, length = 50)
    private Integer manager;
}
