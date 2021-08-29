package com.example.homework03.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CourseDAO<Course> extends CrudRepository<Course,Integer> {

}
