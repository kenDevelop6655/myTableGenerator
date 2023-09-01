package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;
import java.util.Date;


@Entity
@Data
public class Equip {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "equip_id")
    private Integer equipId;

    @Column(name = "equip_manage_code",length=50)
    private String equipManageCode;

    @Column(name = "equip_name",  length = 50)
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
}
