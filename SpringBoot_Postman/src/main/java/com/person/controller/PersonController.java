package com.person.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.person.model.Person;
import com.person.services.PersonService;

@RestController
@RequestMapping("/person")
public class PersonController {

	@Autowired
	PersonService personService;

	@PostMapping("/newperson")
	public void addPerson(@RequestBody Person person) {
		personService.insert(person); // Insert data service class
		System.out.println("Saving person information");
	}

}
