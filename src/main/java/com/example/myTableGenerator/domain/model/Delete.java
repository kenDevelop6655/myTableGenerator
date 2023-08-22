package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Delete {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "delete_id")
    private Integer deleteId;

//    @Column(name = "equip_id", nullable = false)
//    private Integer equipId;

    @Column(name = "delete_date", nullable = false)
    private Date deleteDate;

    @Column(name = "delete_emp_id", nullable = false)
    private Integer deleteEmpId;

    @Column(name = "note", nullable = false, length = 200)
    private String note;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;

}
