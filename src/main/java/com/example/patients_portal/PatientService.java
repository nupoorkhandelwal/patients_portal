package com.example.patients_portal;


import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface PatientService {
    public void getPatient();
    public List<Patient> getAllPatients();
    public void addPatient(PatientViewFetchRequest patientViewFetchRequest);
    public void removePatient(PatientViewFetchRequest patientViewFetchRequest);
    //public UserCalorieTrackingResponse viewCalorie(CalorieViewTrackingRequest trackCalorieRequest);

//    public List<Food> getFoods();
//    public List<Food> getFoods(Integer caloriesMin, Integer caloriesMax);
//    public Boolean addFood(Food food);
//    public Boolean removeFood(Long foodId);
}

