package com.example.homework03.model;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Entity

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder

public class Student extends User  {
    private LocalDate birthDate;
    private String gender;

    @ManyToMany
    private List<Course> courses = new ArrayList<>();



}
