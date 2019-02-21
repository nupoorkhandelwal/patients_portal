package com.example.patients_portal.rest;

import com.example.patients_portal.domain.PatientViewFetchRequest;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import java.util.List;


@RestController
public interface PatientApi {


    @GetMapping(value = "/public/patient",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Return all Patients", notes="This is a public API", response= List.class)
    ResponseEntity getPatients();



    @PostMapping(value = "/public/patient",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity addPatient(@RequestBody PatientViewFetchRequest patientViewFetchRequest);



}
