package com.example.patients_portal.dao;

import com.example.patients_portal.domain.Patient;
import com.example.patients_portal.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class PatientDaoImpl implements PatientDao {

    @Autowired
    private PatientRepository patientRepository;

    @Override
    public List<Patient> getPatients() {
        List<Patient> list = new ArrayList<>();
        patientRepository.findAll().forEach(e -> list.add(e));
        return list;
    }

    @Override
    public Patient getPatient(int PatientId) {
        Patient patient = patientRepository.findById(PatientId);
        return patient;

    }

    @Override
    public Boolean addPatient(Patient patient) {
        List<Patient> list = patientRepository.findByIdAndName(patient.getId(), patient.getName());
        if (list.size() > 0) {
            return false;
        } else {
            patientRepository.save(patient);
            return true;
        }
    }

    @Override
    public Boolean deletePatient(int patientId) {
        return patientRepository.deleteById(patientId);
    }
}
