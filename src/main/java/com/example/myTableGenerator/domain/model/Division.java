package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="DivisionUser")
public class Division extends Emp{

    @Column(name = "section_name", nullable = false, length = 50)
    private String sectionName;

    @Column(name = "manager", nullable = false, length = 50)
    private String manager;
}
