package com.example.patients_portal.repository;

import com.example.patients_portal.domain.Patient;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends CrudRepository<Patient, Long> {
    Patient findById(int Id);
    Boolean deleteById(int Id);
    //List<Patient> findByIdAndName(int Id, String name);

}
