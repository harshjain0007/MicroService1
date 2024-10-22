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

    public void deleteById(Long id) {
        personRepository.deleteById(id);
    }

    public Person update(Long id,Person person){
        Person person1= personRepository.getUserById(id).get();
        if(person1 != null){
            person1.setName(person.getName());
            person1.setCity(person.getCity());
            return personRepository.save(person1);
        }else {
            return personRepository.save(person);
        }

    }

}
