package com.example.homework03.controller;

import com.example.homework03.model.VisitingResearcher;
import com.example.homework03.service.VisitingResearcherService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class VisitingResearcherController {

    private VisitingResearcherService visitingResearcherService;

    public VisitingResearcherController(VisitingResearcherService visitingResearcherService) {
        this.visitingResearcherService = visitingResearcherService;
    }


    @GetMapping("/visitings")
    public ResponseEntity<List<VisitingResearcher>> findAll(){
        return new ResponseEntity<>(visitingResearcherService.findAll(), HttpStatus.OK);
    }

    @PostMapping("/visitings/{id}")
    public VisitingResearcher findById(@PathVariable int id){

        return visitingResearcherService.findById(id);
    }


    @PostMapping("/visitings")
    public VisitingResearcher save(@RequestBody VisitingResearcher visitingResearcher){
        return visitingResearcherService.save(visitingResearcher);
    }


    @DeleteMapping(value = "/visitings/{id}")
    public void deleteVisitingResearcherById(@PathVariable int id){
        visitingResearcherService.deleteById(id);
    }


    @PutMapping("/visitings")
    public VisitingResearcher updateOnDatabase(@RequestBody  VisitingResearcher visitingResearcher){
        return visitingResearcherService.updateOnDatabase(visitingResearcher);
    }

}
