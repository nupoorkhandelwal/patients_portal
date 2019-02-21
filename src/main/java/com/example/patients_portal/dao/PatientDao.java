package com.example.patients_portal.dao;

import com.example.patients_portal.domain.Patient;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PatientDao {
    List<Patient> getPatients();
    Patient getPatient(int PatientId);
    Boolean addPatient(Patient patient);
    Boolean deletePatient(int PatientId);
}
