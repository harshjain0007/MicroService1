package com.microservice.controller;

import com.microservice.model.Person;
import com.microservice.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
    public Person savePerson(@RequestBody Person person){
        return personService.createPerson(person);
    }

    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id){
        personService.deleteById(id);
    }

    @PutMapping("/update/{id}")
    public ResponseEntity<Person> updatePerson(@PathVariable Long id,@RequestBody Person person){
        return  ResponseEntity.ok( personService.update(id, person));

    }


}
