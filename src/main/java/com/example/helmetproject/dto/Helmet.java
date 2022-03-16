package com.example.helmetproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class Helmet {

    private String helmetId;
    private String helmetModelName;
    private LocalDate helmetMakeDate;
    private LocalDate helmetBuyDate;
}