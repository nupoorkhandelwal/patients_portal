package com.example.patients_portal;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Data
@Table(name ="patient")
public class Patient  implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

    @Column(name = "city")
    private String city;

    @Column(name = "dob")
    private int dob;

    public int getId() {
        return id;
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

    public int getDob() {
        return dob;
    }

    public void setDob(int Dob) {
        this.dob = dob;
    }

    @Override
    public String toString() {
        return "Patient [id=" + id + ", name=" + name + ", surname=" + surname + ", city=" + city
                + ", dob=" + dob + "]";
    }

}
