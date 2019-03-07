package com.example.patients_portal.domain;

import javax.persistence.Id;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "patients")
public class Patient  implements Serializable {
   // private static final long serialVersionUID = 1L;
//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "id")
//    private int id;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name ="pateintid")
    private int patientId;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "city")
    private String city;

    @Column(name = "dob")
    private Date dob;

//    public int getId() {
//        return id;
//    }


    public int getPatientId() {
        return patientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Date getDob() {
        return dob;
    }

    public void setDob(Date Dob) {
        this.dob = Dob;
    }

    @Override
    public String toString() {
        return "Patient [id=" + patientId + ", name=" + name + ", surname=" + surname + ", city=" + city
                + ", dob=" + dob + "]";
    }

}
