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

import com.system.app.model.FixedRates;
import com.system.app.service.FixedratesService;

@RestController
@RequestMapping(value="/fixedrates")
public class FixedratesController {
	
	@Autowired
	private FixedratesService fixedrateService;
	
	@PostMapping
	public FixedRates addFixedrates(@RequestBody FixedRates fixedrates) 
	{
		FixedRates fixedrates2= fixedrateService.addFixedratesloan(fixedrates);
		return fixedrates2;
	}
	@PutMapping(value="{Id}")
	public ResponseEntity<FixedRates> updateFixedrates(@PathVariable("Id") int No, @RequestBody FixedRates fixedrates)
	{
		return new ResponseEntity<FixedRates>(fixedrateService.updateFixedrates(fixedrates, No),HttpStatus.OK);
		
	}
	@DeleteMapping(value= "{Id}")
	public ResponseEntity<String> deleteFixedrates(@PathVariable ("Id") int No)
	{	
		fixedrateService.deleteFixedrates(No);
		return new ResponseEntity<String>("Loan type deleted successfully", HttpStatus.OK);
	}

}
