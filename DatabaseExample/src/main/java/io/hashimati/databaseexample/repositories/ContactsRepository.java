package io.hashimati.databaseexample.repositories;

import java.util.UUID;

import io.hashimati.databaseexample.domains.Contacts;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * ContactsRepository
 */
@Repository
public interface ContactsRepository extends CrudRepository<Contacts, Long> {

    
}