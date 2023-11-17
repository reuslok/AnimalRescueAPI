package com.animal.rescue.animalrescueservices.service;

import com.animal.rescue.animalrescueservices.domain.AnimalResponse;

public interface AnimalService {
	public void createAnimal();

	public AnimalResponse findAnimal(Long id);
}
