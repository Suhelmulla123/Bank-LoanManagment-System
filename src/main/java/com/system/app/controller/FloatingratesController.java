package com.system.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.app.model.FloatingRates;
import com.system.app.service.FloatingrateService;

@RestController
@RequestMapping(value="/floatingrates")
public class FloatingratesController {
	@Autowired
	private FloatingrateService floatingrateService;
	
	
	//add floating rates loan type
	@PostMapping
	public FloatingRates addFloatingrates(@RequestBody FloatingRates floatingrates) 
	{
		FloatingRates floatingrates2= floatingrateService.addFloatingrates(floatingrates);
		return floatingrates2;
		
	}
	@PutMapping(value="{Id}")
	public ResponseEntity<FloatingRates> updateFloatingrates(@PathVariable("Id") int No, @RequestBody FloatingRates floatingrates) 
	{
		
		return new ResponseEntity<FloatingRates>(floatingrateService.updtaeFloatingrates(floatingrates, No), HttpStatus.OK);
		
	}
	
	
	@DeleteMapping(value="{Id}")
	public ResponseEntity<String> deleteFloatingrates(@PathVariable("Id") int No)
	{
		floatingrateService.deleteFloatingrates(No);
		return new ResponseEntity<String>("floating rate loan type deleted succefully",HttpStatus.OK);
		
	}

}
