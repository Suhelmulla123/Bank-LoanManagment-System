package com.system.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.app.model.LoanMaster;
import com.system.app.service.LoanmasterService;

@RestController
@RequestMapping(value="/loanmaster")
public class LoanmasterController {
	
	@Autowired
	private LoanmasterService loanmasterService;
	
	//add loan master
	@PostMapping
	public LoanMaster addLoanmaster(@RequestBody LoanMaster loanmaster) 
	{
		LoanMaster loanmaster2=loanmasterService.addLoanmaster(loanmaster);
		return loanmaster2;
		
	}
	
	//delete loan master
	@DeleteMapping(value="{Id}")
	public ResponseEntity<String> deleteLoanmaster(@PathVariable("Id") int Loan_ID)
	{
		loanmasterService.deleteLoanmaster(Loan_ID);
		
		return new ResponseEntity<String>("Loan master deleted Successfully", HttpStatus.OK);
		
	}
	

}
