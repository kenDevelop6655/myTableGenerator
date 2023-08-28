package com.example.myTableGenerator.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="FirstApprove")
public class FirstApprove extends RequestActivity{

    @Column(name = "first_approver_id")
    private Integer firstApproverId;
}
