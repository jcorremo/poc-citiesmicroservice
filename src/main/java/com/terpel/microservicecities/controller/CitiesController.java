package com.terpel.microservicecities.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.terpel.microservicecities.model.Cities;
import com.terpel.microservicecities.repositories.CitiesRepository;

@RestController
@RequestMapping("/cities")
public class CitiesController {
	
	 @Autowired
	 private CitiesRepository repository;
	
	 @RequestMapping(value = "/{nombre}", method = RequestMethod.GET)
	 public Cities getPetById(@PathVariable("name") String nombre) {
	   return repository.findBynombre(nombre);
	 }
	 
}	
