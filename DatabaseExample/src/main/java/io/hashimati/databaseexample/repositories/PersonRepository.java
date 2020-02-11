package io.hashimati.databaseexample.repositories;

import java.util.List;
import java.util.Optional;

import io.hashimati.databaseexample.domains.Person;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.annotation.Join.Type;
import io.micronaut.data.repository.CrudRepository;

/**
 * PersonRepository
 * /
 */

 @Repository

public interface PersonRepository extends CrudRepository<Person, Long> {
    @Join(value ="addresses",type = Type.FETCH)
    @Join(value="contacts", type=Type.FETCH)
    public List<Person> findByName(String name);
   
    @Join(value ="addresses",type = Type.FETCH)
    @Join(value="contacts", type=Type.FETCH)
    public Optional<Person> findById(long i);
   
    @Join(value ="addresses",type = Type.FETCH)
    @Join(value="contacts", type=Type.FETCH)
    public List<Person> findAll(); 
}