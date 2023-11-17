package com.animal.rescue.animalrescueservices.domain;

import java.time.LocalDateTime;
import java.util.List;

import com.animal.rescue.animalrescueservices.entity.AnimalEntity;
import com.animal.rescue.animalrescueservices.entity.Sponsor;
import com.animal.rescue.animalrescueservices.enums.Gender;
import com.animal.rescue.animalrescueservices.enums.Health;
import com.animal.rescue.animalrescueservices.enums.Locations;
import com.animal.rescue.animalrescueservices.enums.Size;
import com.animal.rescue.animalrescueservices.enums.Species;
import com.animal.rescue.animalrescueservices.enums.Status;

import lombok.Data;

@Data
public class AnimalResponse {
	    private Species Species;
	    
	    private Gender gender;
	      
	    private String breed;
	    
	    private Size size;
	    
	    private float weight;
	    
	    private String description;
	    
	    private LocalDateTime dateOfBirth;
	    
	    private LocalDateTime dateOfArrival;
	    
	    private String name;
	    
	    private Long chipId;

	    private Locations locations;
	    
	    private Status status;
	    
	    private Health health;
	    
	    private List<Sponsor> sponsors;
}
