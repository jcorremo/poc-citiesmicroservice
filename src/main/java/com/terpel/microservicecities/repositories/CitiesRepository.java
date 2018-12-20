package com.terpel.microservicecities.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.terpel.microservicecities.model.Cities;

public interface CitiesRepository extends MongoRepository<Cities, String>{
	
	Cities findBynombre(String nombre);
	
}
