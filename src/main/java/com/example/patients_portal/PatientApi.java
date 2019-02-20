package com.example.patients_portal;

import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

//import io.swagger.annotations.ApiOperation;
//import io.swagger.annotations.ApiResponse;
//import io.swagger.annotations.ApiResponses;

@RestController
public interface PatientApi {

    @PostMapping(value = "/public/patient",
            produces= {MediaType.APPLICATION_JSON_VALUE}, consumes = {MediaType.APPLICATION_JSON_VALUE})
//   @ApiOperation(value="Return all Activities of the user. It also can return Activities of the user on a specific date.", notes="This is a public API", response=List.class)
//   @ApiResponse(code = HttpServletResponse.SC_OK, message = "Success")
    ResponseEntity addPatient(@RequestBody PatientViewFetchRequest patientViewFetchRequest);


    ResponseEntity getPatients();

//    @GetMapping("patient/{id}")
//    public ResponseEntity<Patient> getPatientById(int Id) {
//
//        Patient patient = patientService.getPatientById(Id);
//        return new ResponseEntity<>(patient, HttpStatus.OK);
//
//    }

//    @PostMapping
//    @PutMapping

//    @DeleteMapping("patient/{id}")
//    public ResponseEntity<String> deletePatient(@PathVariable("id")int Id){
//
//        try {
//            patientService.deletePatient(Id);
//        } catch (Exception e) {
//            return new ResponseEntity<>("Fail to delete!", HttpStatus.EXPECTATION_FAILED);
//        }
//        return ResponseEntity.ok().build();
//
//    }

}
