package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Cancel{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_cancel_id")
    private Integer requestCancelId;

    @ManyToOne
    @JoinColumn(name="request_id")
    private Request request;

    @Column(name = "request_cancel_date")
    private Date requestCancelDate;

    @Column(name = "cancel_emp_id")
    private Integer cancelEmpId;

    @Column(name = "note", length =200)
    private String note;
}
