package com.example.homework03.service;

import com.example.homework03.model.PermanentInstructor;
import com.example.homework03.repository.PermamentInstructorDAO;
import dev.patika.homework2.model.PermanentInstructor;
import dev.patika.homework2.repository.PermamentInstructorDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class PermamentInstructorService implements BaseService<PermanentInstructor> {

    private PermamentInstructorDAO permamentInstructorDAO;

    @Autowired
    public PermamentInstructorService(PermamentInstructorDAO permamentInstructorDAO) {
        this.permamentInstructorDAO = permamentInstructorDAO;
    }

    @Override
    @Transactional
    public List<PermanentInstructor> findAll() {

        List<PermanentInstructor> perList = new ArrayList<>();
        Iterable<PermanentInstructor> employeeIter = permamentInstructorDAO.findAll();
        employeeIter.iterator().forEachRemaining(perList::add);
        return perList;    }

    @Override
    public PermanentInstructor findById(int id) {

        return (PermanentInstructor) permamentInstructorDAO.findById(id).get();


    }

    @Override
    public PermanentInstructor save(PermanentInstructor object) {
        return (PermanentInstructor) permamentInstructorDAO.save(object);
    }

    @Override
    public void deleteById(int id) {
        permamentInstructorDAO.deleteById(id);
    }

    @Override
    public PermanentInstructor updateOnDatabase(PermanentInstructor object) {
        return (PermanentInstructor) permamentInstructorDAO.save(object);
    }
}

