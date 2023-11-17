package com.animal.rescue.animalrescueservices.serviceImpl;

import java.time.LocalDateTime;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import com.animal.rescue.animalrescueservices.domain.AnimalResponse;
import com.animal.rescue.animalrescueservices.entity.AnimalEntity;
import com.animal.rescue.animalrescueservices.enums.Gender;
import com.animal.rescue.animalrescueservices.enums.Health;
import com.animal.rescue.animalrescueservices.enums.Locations;
import com.animal.rescue.animalrescueservices.enums.Size;
import com.animal.rescue.animalrescueservices.enums.Species;
import com.animal.rescue.animalrescueservices.enums.Status;
import com.animal.rescue.animalrescueservices.mapper.AnimalMapper;
import com.animal.rescue.animalrescueservices.repository.AnimalRepository;
import com.animal.rescue.animalrescueservices.service.AnimalService;

@Service
public class AnimalServiceImpl implements AnimalService {

	@Autowired
	AnimalRepository animalRepository;
	
	@Autowired
	AnimalMapper animalMapper;
	
	@Override
	public void createAnimal() {
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
		try {
			animalRepository.save(animal);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public AnimalResponse findAnimal(Long id) {
		Optional<AnimalEntity> animalOpt = animalRepository.findById(id);
		AnimalResponse animalResponse=new AnimalResponse();
		if(animalOpt.isPresent()) {
			animalResponse = animalMapper.INSTANCE.animalEntityToAnimalResponse(animalOpt.get());
			return  animalResponse;
		}
		return animalResponse;
	}

//		animalResponse.setBreed("chiuaua");
//		LocalDateTime rightNow = LocalDateTime.now();
//		animalResponse.setDateOfArrival(rightNow);
//		animalResponse.setDateOfBirth(rightNow);
//		animalResponse.setDescription("some description");
//		animalResponse.setGender(Gender.MALE);
//		animalResponse.setHealth(Health.HEALTY);
//		animalResponse.setLocations(Locations.SHELTER);
//		animalResponse.setName("chiubaka");
//		animalResponse.setSize(Size.MINI);
//		animalResponse.setSpecies(Species.DOG);
//		animalResponse.setStatus(Status.ALIVE);
//		animalResponse.setWeight(0.9f);
//		return animalResponse;
//	}
}
