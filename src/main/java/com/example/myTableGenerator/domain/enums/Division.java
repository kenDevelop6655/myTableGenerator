package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Division {
    EGYOSYSTEM1("1", "営業システム第1課"),
    EGYOSYSTEM2("2", "営業システム第2課"),
    EGYOSYSTEM3("3", "営業システム第3課"),
    EGYOSYSTEM4("4", "営業システム第4課"),
    EGYOSYSTEM5("5", "営業システム第5課");

    private final String value;
    private final String label;
}
