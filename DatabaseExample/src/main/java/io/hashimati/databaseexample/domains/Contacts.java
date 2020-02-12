package io.hashimati.databaseexample.domains;

import java.util.UUID;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.micronaut.core.annotation.Introspected;
import lombok.*; 
/**
 * Contacts
 */
@Entity
@Data
@EqualsAndHashCode
public class Contacts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude private long id; 

    private String telephone; 
    private String email; 

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "person_id", nullable = true)
    @JsonIgnore
    private Person person; 


    
}