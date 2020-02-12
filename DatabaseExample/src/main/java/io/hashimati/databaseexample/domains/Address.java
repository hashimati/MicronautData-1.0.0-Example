package io.hashimati.databaseexample.domains;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.core.annotation.Introspected;
import lombok.*; 
/**
 * Address
 */

@Entity
@Data
@EqualsAndHashCode
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @EqualsAndHashCode.Exclude private long id; 

    private String country, city, street, building, description; 


    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JoinColumn(name = "person_id", nullable = true)  
    @JsonIgnore
    private Person person; 
    
}