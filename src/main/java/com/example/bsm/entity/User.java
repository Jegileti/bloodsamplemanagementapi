package com.example.bsm.entity;
import com.example.bsm.enam.BloodGroup;
import com.example.bsm.enam.Gender;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Entity
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userId;
    private String username;
    private String email;
    private String password;
    private String phoneNumber;


    private BloodGroup bloodGroup;

    private LocalDate lastDonatedAt;
    private int age;

    private Gender gender;

    private String availableCity;
    private boolean verified;


}



