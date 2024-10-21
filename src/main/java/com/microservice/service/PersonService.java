package com.microservice.service;

import com.microservice.model.Person;
import com.microservice.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person createPerson(Person person){
        return personRepository.save(person);
    }

    public List<Person> getAllPerson(){
        return personRepository.findAll();
    }

}
