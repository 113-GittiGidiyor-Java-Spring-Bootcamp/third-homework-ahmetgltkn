package com.example.homework03.service;

import com.example.homework03.model.Student;
import com.example.homework03.repository.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService implements BaseService<Student> {

     private StudentDAO studentStudentDAO;

     @Autowired
    public StudentService( StudentDAO studentStudentDAO) {
        this.studentStudentDAO = studentStudentDAO;
    }

    @Override
    public List<Student> findAll() {

        List<Student> stuList = new ArrayList<>();
        Iterable<Student> studentIter = studentStudentDAO.findAll();
        studentIter.iterator().forEachRemaining(stuList::add);
        return stuList;
    }

    @Override
    public Student findById(int id) {
        return (Student) studentStudentDAO.findById(id).get();
    }

    @Override
    @Transactional
    public Student save(Student student) {
         return (Student) studentStudentDAO.save(student);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
         studentStudentDAO.deleteById(id);
    }

    @Override
    public Student updateOnDatabase(Student student) {

         return (Student) studentStudentDAO.save(student);
    }
}
