package com.example.patients_portal.service;


import com.example.patients_portal.domain.Patient;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatientService {
     Patient getPatient(int Id);
     List<Patient> getAllPatients();
     Boolean addPatient(Patient patient);
     Boolean removePatient(int Id);

}

