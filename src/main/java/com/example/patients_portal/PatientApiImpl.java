package com.example.patients_portal;

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
    public ResponseEntity addPatient(PatientViewFetchRequest patientViewFetchRequest) {
        this.patientService.addPatient(patientViewFetchRequest);
        return new ResponseEntity("Success", HttpStatus.OK);

    }

    @Override
    public ResponseEntity getPatients() {
        List<Patient> patients = this.patientService.getAllPatients();
        return new ResponseEntity<>(patients, HttpStatus.OK);
    }


//    @RequestMapping(value = "/public/patient/", method = RequestMethod.GET)
//    public ResponseEntity<List<Patient>> listAllUsers() {
//        List<Patient> users = patientService.getAllPatients();
//        if (users.isEmpty()) {
//            return new ResponseEntity(HttpStatus.NO_CONTENT);
//        }
//        return new ResponseEntity<>(users, HttpStatus.OK);
//    }
}
