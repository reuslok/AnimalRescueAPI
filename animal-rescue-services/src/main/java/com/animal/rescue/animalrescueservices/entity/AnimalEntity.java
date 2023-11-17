package com.animal.rescue.animalrescueservices.entity;

import com.animal.rescue.animalrescueservices.enums.Species;
import com.animal.rescue.animalrescueservices.enums.Status;

import java.time.LocalDateTime;
import java.util.List;

import com.animal.rescue.animalrescueservices.enums.Gender;
import com.animal.rescue.animalrescueservices.enums.Health;
import com.animal.rescue.animalrescueservices.enums.Locations;
import com.animal.rescue.animalrescueservices.enums.Size;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "animal")
public class AnimalEntity {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
    @Column(name= "Specie",nullable = false)
    @Enumerated(EnumType.STRING)
    private Species Species;
    
    @Column(name= "gender",nullable = false)
    @Enumerated(EnumType.STRING)
    private Gender gender;
      
    @Column(name= "breed",nullable = false)
    private String breed;
    
    @Column(name= "size",nullable = false)
    @Enumerated(EnumType.STRING)
    private Size size;
    
    @Column(name= "weight",nullable = true)
    private float weight;
    
    @Column(name= "description",nullable = false,length = 3000)
    private String description;
    
    @Column(name= "date_of_birth",nullable = false)
    private LocalDateTime dateOfBirth;
    
    @Column(name= "date_of_arrival",nullable = false)
    private LocalDateTime dateOfArrival;
    
    @Column(name= "name",nullable = false)
    private String name;
    
    @Column(name= "chipnumber",nullable = true, unique =true)
    private Long chipId;

    @Column(name= "location",nullable = false)
    @Enumerated(EnumType.STRING)
    private Locations locations;
    
    @Column(name= "status",nullable = false)
    @Enumerated(EnumType.STRING)
    private Status status;
    
    @Column(name= "health",nullable = false)
    @Enumerated(EnumType.STRING)
    private Health health;
    
    @OneToMany(mappedBy = "animal")
    @Column(name= "sponsors")
    private List<Sponsor> sponsors;
}
