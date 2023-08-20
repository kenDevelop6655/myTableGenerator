package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Group {

    SECTION("1", "課"),
    DIVISION("2", "部");

    private final String value;
    private final String label;
}
