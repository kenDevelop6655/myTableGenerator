package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="DivisionUser")
public class Division extends Emp{

    @Column(name = "division_id", nullable = false, length = 50)
    private String divisionId;

    @Column(name = "manager", nullable = false, length = 50)
    private String manager;
}
