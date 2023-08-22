package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data
public class Edit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "edit_id")
    private Integer editId;

//    @Column(name = "equip_id", nullable = false)
//    private Integer equipId;

    @Column(name = "equip_manage_code", nullable = false, length=50)
    private String equipManageCode;

    @Column(name = "equip_name", nullable = false, length = 50)
    private String equipName;

    @Column(name = "equip_type_id", nullable = false)
    private Integer equipTypeId;

    @Column(name = "owner_id", nullable = false)
    private Integer ownerId;

    @Column(name = "purchase_date", nullable = false)
    private Date purchaseDate;

    @Column(name = "location", nullable = false, length = 50)
    private String location;

    @Column(name = "note", nullable = false, length = 200)
    private String note;

    @Column(name = "edit_date", nullable = false)
    private Date editDate;

    @Column(name = "edit_emp_id", nullable = false)
    private Integer editEmpId;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;
}

