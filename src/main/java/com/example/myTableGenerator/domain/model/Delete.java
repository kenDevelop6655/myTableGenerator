package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;


@Entity
@Data
public class Delete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delete_id")
    private Integer deleteId;

    @Column(name = "delete_date")
    private LocalDate deleteDate;

    @Column(name = "delete_emp_id")
    private Integer deleteEmpId;

    @Column(name = "note",length = 200)
    private String note;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;

}
