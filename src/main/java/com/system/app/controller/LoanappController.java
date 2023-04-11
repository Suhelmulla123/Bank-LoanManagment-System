package com.system.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.app.model.LoanApp;
import com.system.app.service.LoanappService;

@RestController
@RequestMapping(value="/loanapp")
public class LoanappController {
	
	@Autowired
	private LoanappService loanappService;
	
	//add loan application
	@PostMapping
	public LoanApp addLoanapp(@RequestBody LoanApp loanapp) 
	{
		LoanApp loanapp2= loanappService.addLoanapp(loanapp);
		return loanapp2;
		
	}
	
	//update loan application
	@PutMapping(value="{Id}")
	public ResponseEntity<LoanApp> updateLoanapp(@PathVariable("Id")int App_id,@RequestBody LoanApp loanapp)
	{
		return new ResponseEntity<LoanApp>(loanappService.updateLoanapp(loanapp, App_id),HttpStatus.OK);
		
	}
	
	//delete Loan application
	@DeleteMapping(value="{Id}")
	public ResponseEntity<String> deleteLoanapp(@PathVariable("Id") int App_id)
	{
		loanappService.deleteLoanapp(App_id);
		return new ResponseEntity<String>("Loan Application deleted successfully",HttpStatus.OK);
		
	}

}
