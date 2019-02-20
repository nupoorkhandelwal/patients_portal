package com.example.patients_portal;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public  class PatientServiceImpl implements PatientService {

    @Autowired
    private PatientUtils patientUtils;
    @Autowired
    private PatientDao patientDao;

    @Override
    public void getPatient() {

    }

    @Override
    public List<Patient> getAllPatients( ) {
        List<Patient> patients = this.patientDao.getPatients();
        return patientUtils.mapList(patients, Patient.class);
    }

    @Override
    public void addPatient(PatientViewFetchRequest patientViewFetchRequest){
        Patient patient = this.patientUtils.map(patientViewFetchRequest, Patient.class);
        this.patientDao.addPatient(patient);
    }

    @Override
    public void removePatient(PatientViewFetchRequest patientViewFetchRequest) {
        Patient patient = this.patientUtils.map(patientViewFetchRequest, Patient.class);
        this.patientDao.addPatient(patient);
   }
}
