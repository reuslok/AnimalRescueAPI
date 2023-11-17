package com.animal.rescue.animalrescueservices.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.ReportingPolicy;
import org.mapstruct.factory.Mappers;

import com.animal.rescue.animalrescueservices.domain.AnimalRequest;
import com.animal.rescue.animalrescueservices.domain.AnimalResponse;
import com.animal.rescue.animalrescueservices.entity.AnimalEntity;

@Mapper(componentModel = "spring")
public interface AnimalMapper {
	public AnimalMapper INSTANCE = Mappers.getMapper( AnimalMapper.class );
AnimalResponse animalEntityToAnimalResponse(AnimalEntity animalEntity);

AnimalEntity animalResquestToAnimalEntity(AnimalRequest animalRequest);
}
