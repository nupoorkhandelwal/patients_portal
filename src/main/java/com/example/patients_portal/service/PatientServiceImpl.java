package com.example.patients_portal.service;


import com.example.patients_portal.dao.PatientDao;
import com.example.patients_portal.domain.Patient;
import com.example.patients_portal.utils.PatientUtils;
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
    public Patient getPatient(int patientId) {
      return this.patientDao.getPatient(patientId);
    }

    @Override
    public List<Patient> getAllPatients( ) {
        List<Patient> patients = this.patientDao.getPatients();
        return patientUtils.mapList(patients, Patient.class);
    }

    @Override
    public Boolean addPatient(Patient patient){
       return this.patientDao.addPatient(this.patientUtils.map(patient, Patient.class));
    }

    @Override
    public Boolean removePatient(int patientId) {
        return this.patientDao.deletePatient(patientId);
   }

}
