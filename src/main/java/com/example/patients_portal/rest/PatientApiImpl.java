package com.example.patients_portal.rest;

import com.example.patients_portal.domain.Patient;
import com.example.patients_portal.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class PatientApiImpl implements PatientApi {

   @Autowired
    private PatientService patientService;

    @Override
    public ResponseEntity getPatients() {
        List<Patient> patients = this.patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }

    @Override
    public ResponseEntity getPatient(int patientId) {
        Patient patient = this.patientService.getPatient(patientId);
        return new ResponseEntity(patient,HttpStatus.NO_CONTENT );
    }

    @Override
    public ResponseEntity addPatient(Patient patient) {
       Boolean result=  this.patientService.addPatient(patient);
        return new ResponseEntity(result, HttpStatus.CREATED);

    }

    @Override
    public ResponseEntity deletePatient(int patientId) {
        Boolean result = this.patientService.removePatient(patientId);
            return new ResponseEntity(result, (result) ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND);
    }
}
