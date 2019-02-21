package com.example.patients_portal.domain;

import lombok.Data;
import lombok.experimental.Accessors;

import java.util.ArrayList;
import java.util.List;

@Data
@Accessors(chain=true)
public class PatientViewFetchResponse {
    private List<Patient> patientList = new ArrayList<Patient>();

    public void addPatient(Patient patient) {
        this.patientList.add(patient);
    }
}
