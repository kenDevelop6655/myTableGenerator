package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

@MappedSuperclass
@Data
public class Emp {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emp_id")
    private Integer empId;

    @Column(name = "user_name", length = 50)
    private String empName;

    @Column(name = "password",  length = 50)
    private String password;

    @Column(name = "email",  length = 50)
    private String email;

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "group_id")
    private Integer groupId;
}
