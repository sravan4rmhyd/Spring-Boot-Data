package org.example.controller;

import java.util.List;

import org.example.model.Person;
import org.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonController {
	@Autowired
	private PersonRepository personRepository;
	@RequestMapping(value="/persons",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Person> getAllPerson(){
		return personRepository.findAll();
	}
}