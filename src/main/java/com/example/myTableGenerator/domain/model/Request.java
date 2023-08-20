package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Entity
@Data
@Table(name = "Request")
public class Request {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_id", nullable = false)
    private Integer requestId;

    @Column(name = "request_status", nullable = false, length = 50)
    private String requestStatusId;

    @OneToMany
    @JoinColumn(name="request_id")
    private List<RequestActivity> members = new ArrayList<>();

}
