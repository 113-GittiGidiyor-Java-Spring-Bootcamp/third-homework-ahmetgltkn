package com.example.homework03.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentDAO<Student> extends CrudRepository<Student,Integer> {
    @Query("select s.Gender from Student s Group by s.Gender")
    List<Student> getStudentsWithGroupByGender();
}
