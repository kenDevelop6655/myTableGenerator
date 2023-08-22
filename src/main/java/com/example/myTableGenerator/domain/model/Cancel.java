package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cancel")
public class Cancel extends RequestActivity{
    @Column(name = "cancel_emp_id", nullable = false)
    private Integer cancelEmpId;

    @Column(name = "note", nullable = false, length =200)
    private String note;
}
