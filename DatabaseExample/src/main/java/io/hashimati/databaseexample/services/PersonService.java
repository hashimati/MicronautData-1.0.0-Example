package io.hashimati.databaseexample.services;

import java.util.List;

import javax.inject.Inject;
import javax.inject.Singleton;
import javax.transaction.Transactional;

import io.hashimati.databaseexample.domains.Address;
import io.hashimati.databaseexample.domains.Contacts;
import io.hashimati.databaseexample.domains.Person;
import io.hashimati.databaseexample.repositories.AddressRepository;
import io.hashimati.databaseexample.repositories.ContactsRepository;
import io.hashimati.databaseexample.repositories.PersonRepository;

/**
 * PersonService
 */
@Singleton
@Transactional
public class PersonService {

    @Inject
    private PersonRepository personRepository; 

    @Inject 
    private ContactsRepository contactsRepository; 
    
    @Inject
    private AddressRepository addressRepository; 

    public Person addPerson()
    {
        Person person = new Person(); 
        person.setName("Ahmed");
        person.setAge(0);


        Address myAddress = new Address(); 
        myAddress.setCountry("Saudi Arabia");
        myAddress.setCity("Saihat");
        myAddress.setPerson(person);
        person.getAddresses().add(addressRepository.save(myAddress)); 


      Person result = personRepository.save(person); 
        Contacts contacts = new Contacts(); 
        

        contacts.setEmail("Helloworld@gmail.com");
        contacts.setTelephone("0123123123");
        contacts.setPerson(result);

        person.setContacts(contactsRepository.save(contacts));

      // person.setContacts( contactsRepository.save(contacts));
        


        return result; 
        

    }

    public List<Person> getAll()
    {
      return personRepository.findAll();
    }

    public String deleteAll()
    {
      addressRepository.deleteAll();
      contactsRepository.deleteAll();
      personRepository.deleteAll();

      return "done";  
    }
    
}