package com.example.patients_portal.domain;

import lombok.Data;

@Data
public class PatientFetchRequest extends PatientViewFetchRequest {
    private int id;
    private String name;
}
