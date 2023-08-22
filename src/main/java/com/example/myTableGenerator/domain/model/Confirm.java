package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Confirm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "confirm_id")
    private Integer confirmId;

    @Column(name = "execute_date", nullable = false)
    private Date executeDate;

    @Column(name = "executer_id", nullable = false)
    private Integer executerId;

    @Column(name = "confirm_status_id", nullable = false)
    private Integer confirmStatusId;

    @Column(name = "note", nullable = false, length = 200)
    private String note;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;
}
