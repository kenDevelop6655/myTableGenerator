package com.example.myTableGenerator.domain.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Section {
    DENSOL1("1", "電力ソリューション第1部"),
    DENSOL2("2", "電力ソリューション第2部");

    private final String value;
    private final String label;
}
