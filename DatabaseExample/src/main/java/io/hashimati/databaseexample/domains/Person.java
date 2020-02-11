package io.hashimati.databaseexample.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.swing.GroupLayout.Alignment;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;

import io.micronaut.core.annotation.Introspected;
import io.micronaut.data.annotation.Id;
import lombok.*; 

/**
 * Person
 */

@Entity
@Data
@ToString
@EqualsAndHashCode
@Introspected
public class Person {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @EqualsAndHashCode.Exclude private long id; 

    private String name; 
    private int age; 


    @OneToOne(mappedBy = "person", cascade = CascadeType.ALL,orphanRemoval = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private Contacts contacts ; 
    

    @OneToMany(mappedBy = "person", cascade = CascadeType.ALL, orphanRemoval = true)
    @OnDelete(action = OnDeleteAction.CASCADE)
    private List<Address> addresses = new ArrayList<Address>(); 
    
}