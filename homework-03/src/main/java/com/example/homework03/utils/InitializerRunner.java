package com.example.homework03.utils;


import com.example.homework03.model.Course;
import com.example.homework03.repository.CourseDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;


public class InitializerRunner implements CommandLineRunner {

    private static final Logger logger = LoggerFactory.getLogger(InitializerRunner.class);

    @Autowired
    CourseDAO courseDAO;

    @Override
    public void run(String... args) throws Exception {
        courseDAO.deleteAll();
        courseDAO.save(Course.builder().courseCode("10").courseName("c#").courseCredit(5).build());
        courseDAO.save(Course.builder().courseCode("11").courseName("Python").courseCredit(6).build());
        courseDAO.save(Course.builder().courseCode("12").courseName("JAVA").courseCredit(15).build());

        courseDAO.findAll().forEach(course -> logger.info("{}", course));

    }
}
