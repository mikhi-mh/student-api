package com.example.studentapi.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigInteger;
import java.util.Date;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer rollNumber;
    private String firstName;
    private String lastName;
    private String middleName;
    private String emailId;
    private String gender;
    private Date birthDate;
    private Double percentage;
    private BigInteger mobileNumber;
}
