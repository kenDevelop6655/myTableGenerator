package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="FirstApprove")
public class FirstApprove{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_first_approve_id")
    private Integer requestFirstApproveId;

    @ManyToOne
    @JoinColumn(name="request_id")
    private Request request;

    @Column(name = "request_first_approve_date")
    private Date requestFirstApproveDate;

    @Column(name = "first_approve_user_id")
    private Integer firstApproveUserId;
}
