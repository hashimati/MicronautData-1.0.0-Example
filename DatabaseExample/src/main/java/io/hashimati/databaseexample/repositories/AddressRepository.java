package io.hashimati.databaseexample.repositories;

import io.hashimati.databaseexample.domains.Address;
import io.micronaut.data.annotation.Join;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.CrudRepository;

/**
 * ContactsRepository
 */
@Repository
public interface AddressRepository extends CrudRepository<Address, Long> {

    
}