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

    @Column(name = "equip_manage_code",  length=50)
    private String equipManageCode;

    @Column(name = "equip_name", length = 50)
    private String equipName;

    @Column(name = "equip_type_id")
    private Integer equipTypeId;

    @Column(name = "owner_id")
    private Integer ownerId;

    @Column(name = "purchase_date")
    private Date purchaseDate;

    @Column(name = "location", length = 50)
    private String location;

    @Column(name = "note", length = 200)
    private String note;

    @Column(name = "edit_date")
    private Date editDate;

    @Column(name = "edit_emp_id")
    private Integer editEmpId;

    @ManyToOne
    @JoinColumn(name="equip_id")
    private Equip equip;
}

