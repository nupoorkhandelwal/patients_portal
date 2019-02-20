package com.example.patients_portal;

import org.springframework.data.annotation.Id;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface PatientRepository extends CrudRepository<Patient, Id> {
    Patient findById(int Id);
//    List<Patient> findDistinctByCity(String city);
    List<Patient> findByIdAndName(int Id, String name);
//    Boolean deletePatient(int Id);
}
