package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@MappedSuperclass
@Data
public class RequestActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_activity_id")
    private Integer requestActivityId;

    @Column(name = "request_activity_date")
    private LocalDate requestActivityDate;

    @Column(name = "request_type_id")
    private Integer requestTypeId;

    @ManyToOne
    @JoinColumn(name="request_id")
    private Request request;
}
