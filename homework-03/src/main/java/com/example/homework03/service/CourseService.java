package com.example.homework03.service;

import com.example.homework03.model.Course;
import com.example.homework03.repository.CourseDAO;
import dev.patika.homework2.model.Course;
import dev.patika.homework2.repository.CourseDAO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor

public class CourseService implements BaseService<Course>{

    private final CourseDAO courseDAO;


    @Override
    public List<Course> findAll() {

        List<Course> courseList = new ArrayList<>();
        Iterable<Course> employeeIter = courseDAO.findAll();
        employeeIter.iterator().forEachRemaining(courseList::add);
        return courseList;
    }

    @Override
    @Transactional(readOnly = true)
    public Course findById(int id) {

        return (Course) courseDAO.findById(id).get();
    }

    @Override
    @Transactional
    public Course save(Course course) {

        return (Course) courseDAO.save(course);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        courseDAO.deleteById(id);
    }

    @Override
    @Transactional
    public Course updateOnDatabase(Course course) {

        return (Course) courseDAO.save(course);
    }
}
