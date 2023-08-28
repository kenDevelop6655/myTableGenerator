package com.example.myTableGenerator.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="SecondApprove")
public class SecondApprove extends RequestActivity{

    @Column(name = "second_approver_id")
    private Integer secondApproverId;

}
