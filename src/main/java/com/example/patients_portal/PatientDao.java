package com.example.patients_portal;

import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao {
    List<Patient> getPatients();
    Patient getPatient(int PatientId);
    Boolean addPatient(Patient patient);
   // Boolean deletePatient(int PatientId);
}
