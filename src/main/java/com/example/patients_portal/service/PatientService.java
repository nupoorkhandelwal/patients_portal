package com.example.patients_portal.service;


import com.example.patients_portal.domain.Patient;
import com.example.patients_portal.domain.PatientViewFetchRequest;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatientService {
    public void getPatient(PatientViewFetchRequest patientViewFetchRequest);
    public List<Patient> getAllPatients();
    public void addPatient(PatientViewFetchRequest patientViewFetchRequest);
    public void removePatient(PatientViewFetchRequest patientViewFetchRequest);

}

