package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum EquipType {

    DISPLAY("1", "ディスプレイ"),
    MOUSE("2", "マウス"),
    AUDIO("3", "オーディオ"),
    KEYBOARD("4", "キーボード"),
    OTHER("5", "その他");

    private final String value;
    private final String label;
}
