package com.example.homework03.service;

import com.example.homework03.model.VisitingResearcher;
import com.example.homework03.repository.VisitingResearcherDAO;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
public class VisitingResearcherService implements BaseService<VisitingResearcher> {

    private VisitingResearcherDAO visitingResearcherDAO;

    public VisitingResearcherService(VisitingResearcherDAO visitingResearcherDAO) {
        this.visitingResearcherDAO = visitingResearcherDAO;
    }

    @Override
    public List<VisitingResearcher> findAll() {

        List<VisitingResearcher> visList = new ArrayList<>();
        Iterable<VisitingResearcher> employeeIter = visitingResearcherDAO.findAll();
        employeeIter.iterator().forEachRemaining(visList::add);
        return visList;
    }

    @Override
    @Transactional(readOnly = true)
    public VisitingResearcher findById(int id) {
        return (VisitingResearcher) visitingResearcherDAO.findById(id).get();
    }

    @Override
    @Transactional
    public VisitingResearcher save(VisitingResearcher object) {
        return (VisitingResearcher) visitingResearcherDAO.save(object);
    }

    @Override
    @Transactional
    public void deleteById(int id) {
        visitingResearcherDAO.deleteById(id);
    }

    @Override
    @Transactional
    public VisitingResearcher updateOnDatabase(VisitingResearcher object) {
        return (VisitingResearcher) visitingResearcherDAO.save(object);
    }
}
