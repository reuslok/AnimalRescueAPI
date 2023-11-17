package com.animal.rescue.animalrescueservices.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name = "sponsor")
public
class Sponsor {

		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Integer id;
		
		@ManyToOne(fetch=FetchType.LAZY)
		@JoinColumn(name="animalId")
		private AnimalEntity animal;
}
