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

    @Column(name="equip_id")
    private int equipId;

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

    @Column(name = "add_date")
    private Date add_date;

    @Column(name = "add_user_id")
    private Integer add_user_id;
}
