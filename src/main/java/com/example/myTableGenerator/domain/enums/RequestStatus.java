package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RequestStatus {
    CANCELED("1", "キャンセル済み"),
    RECEIVED("2", "受付済み"),
    FIRSTAPPROVED("3", "第1承認済み"),
    SECCONDAPPROVED("4", "承認済み");

    private final String value;
    private final String label;
}
