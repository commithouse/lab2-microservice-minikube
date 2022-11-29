package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/professor")
@RestController
public class ProfessorControler {

    @Autowired
    ProfessorRepository repository;

    @GetMapping
    public List<ProfessorEntity> getProfessor(){
        return repository.findAll();
    }

    @PostMapping(consumes = "application/json;charset=UTF-8")
    public ProfessorEntity criar(@RequestBody ProfessorEntity prof){
        repository.save(prof);
        return prof;
    }
}
