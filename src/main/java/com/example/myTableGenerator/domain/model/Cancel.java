package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

@Entity
@Table(name="Cancel")
public class Cancel extends RequestActivity{
    @Column(name = "cancel_emp_id")
    private Integer cancelEmpId;

    @Column(name = "note", length =200)
    private String note;
}
