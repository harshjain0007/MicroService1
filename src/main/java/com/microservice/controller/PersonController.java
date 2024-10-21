package com.microservice.controller;

import com.microservice.model.Person;
import com.microservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {

    @Autowired
    private PersonService personService;

    @GetMapping()
    public List<Person> getAllPerson(){
        return personService.getAllPerson();
    }
    @PostMapping("/add")
    public Person createPerson(Person person){
        return personService.createPerson(person);
    }
}
