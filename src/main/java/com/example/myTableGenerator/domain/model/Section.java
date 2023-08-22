package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="SectionUser")
public class Section extends Emp{


    @Column(name = "section_id", nullable = false, length = 50)
    private Integer sectionId;

    @Column(name = "manager", nullable = false, length = 50)
    private Integer manager;
}
