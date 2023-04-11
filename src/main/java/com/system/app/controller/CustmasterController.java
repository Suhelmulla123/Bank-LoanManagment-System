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

import com.system.app.model.CustMaster;

import com.system.app.service.CustmasterService;

@RestController
@RequestMapping(value="/custmaster")
public class CustmasterController {
	
	@Autowired
	private CustmasterService custmasterSerivice;

	@PostMapping
	public CustMaster addCustmaster(@RequestBody CustMaster custmaster) 
	{
		CustMaster custmaster2= custmasterSerivice.addCustmaster(custmaster);
		return custmaster2;
	}
	@PutMapping(value="{Id}")
	public ResponseEntity<CustMaster> updateCustmaster(@PathVariable("Id") int C_ID, @RequestBody CustMaster custmaster)
	{
		return new ResponseEntity<CustMaster>(custmasterSerivice.updateCustmaster(custmaster, C_ID),HttpStatus.OK);
		
	}
	@DeleteMapping(value= "{Id}")
	public ResponseEntity<String> deleteCustmaster(@PathVariable ("Id") int C_ID)
	{	
		custmasterSerivice.deleteCustmaster(C_ID);
		return new ResponseEntity<String>("Customer master deleted successfully", HttpStatus.OK);
	}

}
