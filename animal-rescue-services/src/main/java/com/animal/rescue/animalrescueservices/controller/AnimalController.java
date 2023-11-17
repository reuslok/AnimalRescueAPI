package com.animal.rescue.animalrescueservices.controller;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.animal.rescue.animalrescueservices.domain.AnimalResponse;
import com.animal.rescue.animalrescueservices.entity.AnimalEntity;
import com.animal.rescue.animalrescueservices.enums.Gender;
import com.animal.rescue.animalrescueservices.enums.Health;
import com.animal.rescue.animalrescueservices.enums.Locations;
import com.animal.rescue.animalrescueservices.enums.Size;
import com.animal.rescue.animalrescueservices.enums.Species;
import com.animal.rescue.animalrescueservices.enums.Status;
import com.animal.rescue.animalrescueservices.repository.AnimalRepository;
import com.animal.rescue.animalrescueservices.service.AnimalService;

@RestController
@RequestMapping("/animals")
public class AnimalController {
	@Autowired
	AnimalRepository animalRepository;
	
	@Autowired
	AnimalService animalService;
	

	  
	  @GetMapping(value="/{id}", produces = "application/json")
	  public @ResponseBody ResponseEntity getAnimal(@PathVariable Long id) {
		  AnimalEntity animal = new AnimalEntity();
			animal.setBreed("chiuaua");
			LocalDateTime rightNow = LocalDateTime.now();
			animal.setDateOfArrival(rightNow);
			animal.setDateOfBirth(rightNow);
			animal.setDescription("some description");
			animal.setGender(Gender.MALE);
			animal.setHealth(Health.HEALTY);
			animal.setLocations(Locations.SHELTER);
			animal.setName("chiubaka");
			animal.setSize(Size.MINI);
			animal.setSpecies(Species.DOG);
			animal.setStatus(Status.ALIVE);
			animal.setWeight(0.9f);
			AnimalResponse animalResponse = animalService.findAnimal(id);
	        return ResponseEntity.status(HttpStatus.OK).body(animalResponse);
	        
	    }
}
