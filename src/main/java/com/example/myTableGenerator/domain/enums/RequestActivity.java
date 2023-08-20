package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum RequestActivity {
    CANCEL("1", "キャンセル"),
    RECEIVE("2", "受付済み"),
    FIRSTAPPROVE("3", "第1承認"),
    SECCONDAPPROVE("4", "第2承認");

    private final String value;
    private final String label;
}
