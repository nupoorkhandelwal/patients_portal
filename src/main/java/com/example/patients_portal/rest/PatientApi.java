package com.example.patients_portal.rest;

import com.example.patients_portal.domain.Patient;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.util.List;

@RestController
@RequestMapping(value = "/patients", produces = "application/hal+json")
public interface PatientApi {

    @GetMapping(value = "/patients",consumes = {MediaType.ALL_VALUE},
            produces= {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Return all Patients", notes="This is a public API", response= List.class)
    ResponseEntity getPatients();


    @GetMapping(value = "/patients/{id}",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ApiOperation(value="Return Patient for given Id", notes="This is a public API", response= Patient.class)
    ResponseEntity getPatient(@PathVariable("id") int patientId);


    @PostMapping(value = "/patients",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity addPatient(@RequestBody Patient patient);

    @DeleteMapping(value = "/patients/{id}",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
    @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity deletePatient(@PathVariable("id") int patientId);

}
