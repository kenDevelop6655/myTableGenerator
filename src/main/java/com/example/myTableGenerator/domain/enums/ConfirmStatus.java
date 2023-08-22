package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ConfirmStatus {
    UNCONFIRM("1", "未実施"),
    CONFIRMED("2", "実施済み"),
    OTHER("3", "その他");

    private final String value;
    private final String label;
}
