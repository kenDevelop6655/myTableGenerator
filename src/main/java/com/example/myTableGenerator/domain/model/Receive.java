package com.example.myTableGenerator.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="Receive")
public class Receive extends RequestActivity{

    @Column(name = "equip_name", nullable = false, length = 50)
    private String equipName;

    @Column(name = "equip_type_id", nullable = false)
    private Integer equipTypeId;

    @Column(name = "register_id", nullable = false)
    private Integer registerId;

    @Column(name = "reason", nullable = false, length = 200)
    private String reason;

    @Column(name = "note", nullable = false, length = 200)
    private String note;


}
