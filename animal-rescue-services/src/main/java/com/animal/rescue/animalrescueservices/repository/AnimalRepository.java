package com.animal.rescue.animalrescueservices.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.animal.rescue.animalrescueservices.entity.AnimalEntity;
@Repository
public interface AnimalRepository extends JpaRepository<AnimalEntity, Long> {
	
}
