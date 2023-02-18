package org.example.seminar3.cw2;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@AllArgsConstructor
@Data
public class Students {
    private String surName;
    private Integer numberGroup;
    private Integer sizeGrant;
    private List<Integer> estimates;
}
