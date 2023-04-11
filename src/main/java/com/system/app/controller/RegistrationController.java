package com.system.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.system.app.model.Registration;
import com.system.app.service.RegistrationService;

@RestController
@RequestMapping(value = "/api/registration")
public class RegistrationController 
{
	
	@Autowired
	private RegistrationService registrationService;
	
	//add new registration in database
	@PostMapping
	public Registration addRegistration(@RequestBody Registration registration) 
	{
		Registration registration2=registrationService.addRegistration(registration);
		return registration2;
	}
	

	//get registration by id
	@GetMapping(value= "{id}")
	public Registration getRegistration(@PathVariable Integer id) {
		Registration registration = registrationService.getRegistrationById(id);
		return registration;
		
	}
	
	//get all registrations from database
	@GetMapping(value="/getallregist")
	public List<Registration> getAllRegistration(){
		
		return registrationService.getAllRegistrations();
		}
	
	//update registration from databse
	@PutMapping(value="{id}")
	public ResponseEntity<Registration> updateRegistration(@PathVariable("id") int Rid,@RequestBody Registration registration) 
	{
		
		return new ResponseEntity<Registration>(registrationService.updateRegistration(registration, Rid),HttpStatus.OK);
		
	}
	
	//delete registration from databa
	@DeleteMapping(value= "{id}")
	public ResponseEntity<String> deleteRegistration(@PathVariable("id") int Rid)
	{
		registrationService.deleteRegistration(Rid);
		
		return new ResponseEntity<String>("registration deleted successfully", HttpStatus.OK);
	}
		
}
	
	
	