package com.example.homework03.model;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class PermanentInstructor extends User {
    private double fixedSalary;
    private String phoneNumber;

    @OneToMany(mappedBy = "permanentInstructor")
    @JsonIgnore
    private List<Course> courses = new ArrayList<>();



}
