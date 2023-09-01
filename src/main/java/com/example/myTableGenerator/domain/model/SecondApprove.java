package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="SecondApprove")
public class SecondApprove{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_second_approve_id")
    private Integer requestSecondApproveId;

    @ManyToOne
    @JoinColumn(name="request_id")
    private Request request;

    @Column(name = "request_second_approve_date")
    private Date requestSecondApproveDate;

    @Column(name = "second_approve_user_id")
    private Integer secondApproveUserId;

}
