package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@MappedSuperclass
@Data
public class RequestActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_activity_id", nullable = false)
    private Integer requestActivityId;

    @Column(name = "request_id", nullable = false)
    private Integer requestId;

    @Column(name = "request_activity_date", nullable = false)
    private Date requestActivityDate;

    @Column(name = "request_type_id", nullable = false)
    private Integer requestTypeId;
}
