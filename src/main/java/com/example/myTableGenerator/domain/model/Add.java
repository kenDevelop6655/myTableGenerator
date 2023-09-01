package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Add {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "add_id")
    private Integer addId;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;

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

    @Column(name = "add_date")
    private Date add_date;

    @Column(name = "add_user_id")
    private Integer add_user_id;
}
