package com.example.homework03.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface VisitingResearcherDAO<VisitingResearcher> extends CrudRepository<VisitingResearcher,Integer> {

    List<VisitingResearcher> findFirst3ByHourlySalaryGreaterThan();
    List<VisitingResearcher> findFirst3ByHourlySalaryOrderByHourlySalaryDesc();
}
