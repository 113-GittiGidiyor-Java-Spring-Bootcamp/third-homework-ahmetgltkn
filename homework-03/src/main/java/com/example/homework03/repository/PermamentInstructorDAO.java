package com.example.homework03.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PermamentInstructorDAO<PermanentInstructor> extends CrudRepository<PermanentInstructor,Integer> {


}
