package io.hashimati.databaseexample.controllers;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import io.hashimati.databaseexample.domains.Address;
import io.hashimati.databaseexample.domains.Contacts;
import io.hashimati.databaseexample.domains.Person;
import io.hashimati.databaseexample.repositories.AddressRepository;
import io.hashimati.databaseexample.repositories.ContactsRepository;
import io.hashimati.databaseexample.repositories.PersonRepository;
import io.hashimati.databaseexample.services.PersonService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

/**
 * PersonResource
 */

@Controller
public class PersonResource {

    @Inject
    private PersonService personService;
    @Get("/add")
    public Person addPerson()
    {
       
        return personService.addPerson(); 
        

    }

    @Get("/all")
    public List<Person> getAll()
    {
      return personService.getAll();
    }

    @Get("/deleteAll")
    public String deleteAll()
    {
      return personService.deleteAll();  
    }
    
}