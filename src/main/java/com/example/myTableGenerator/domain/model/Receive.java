package com.example.myTableGenerator.domain.model;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name="Receive")
public class Receive{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "request_receive_id")
    private Integer requestReceiveId;

    @ManyToOne
    @JoinColumn(name="request_id")
    private Request request;

    @Column(name = "request_receive_date")
    private Date requestReceiveDate;

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
