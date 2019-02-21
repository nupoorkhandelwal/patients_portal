package com.example.patients_portal.rest;

import com.example.patients_portal.domain.Patient;
import com.example.patients_portal.domain.PatientViewFetchRequest;
import com.example.patients_portal.service.PatientService;
import io.swagger.annotations.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@Component
public class PatientApiImpl implements PatientApi {

    @Autowired
    private PatientService patientService;

    @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
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

}
