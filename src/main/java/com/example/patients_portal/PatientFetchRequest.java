package com.example.patients_portal;

import lombok.Data;

@Data
public class PatientFetchRequest extends PatientViewFetchRequest {
    private int id;
    private String name;
}
