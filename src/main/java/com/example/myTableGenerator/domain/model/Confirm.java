package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Confirm {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "confirm_id")
    private Integer confirmId;

    @Column(name = "execute_date")
    private LocalDate executeDate;

    @Column(name = "executer_id")
    private Integer executerId;

    @Column(name = "confirm_status_id")
    private Integer confirmStatusId;

    @Column(name = "note", length = 200)
    private String note;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;
}
