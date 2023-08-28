package com.example.myTableGenerator.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Receive")
public class Receive extends RequestActivity{

    @Column(name = "equip_name", length = 50)
    private String equipName;

    @Column(name = "equip_type_id")
    private Integer equipTypeId;

    @Column(name = "register_id")
    private Integer registerId;

    @Column(name = "reason",  length = 200)
    private String reason;

    @Column(name = "note",  length = 200)
    private String note;


}
