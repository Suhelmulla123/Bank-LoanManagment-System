package com.system.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.LoanApp;
import com.system.app.repository.LoanappRepository;
import com.system.app.service.LoanappService;
@Service
public class LoanappServiceimpl implements LoanappService {
	
	@Autowired
	private LoanappRepository loanappRepository;

	@Override
	public LoanApp addLoanapp(LoanApp loanapp) {
		loanappRepository.save(loanapp);
		return loanapp;
	}

	@Override
	public LoanApp updateLoanapp(LoanApp loanapp, int App_id) {
		LoanApp existingapp = loanappRepository.findById(App_id).orElseThrow(()-> new ResourceNotfoundException("LoanApp", "Id", App_id));
		
		existingapp.setLoan_Type(loanapp.getLoan_Type());
		existingapp.setLoan_Amount(loanapp.getLoan_Amount());
		existingapp.setCust_Name(loanapp.getCust_Name());
		existingapp.setAddress(loanapp.getAddress());
		existingapp.setAge(loanapp.getAge());
		existingapp.setMonthly_Income(loanapp.getMonthly_Income());
		existingapp.setMobileNo(loanapp.getMobileNo());
		existingapp.setWorkPhone(loanapp.getWorkPhone());
		existingapp.setEmailID(loanapp.getEmailID());
		
		loanappRepository.save(existingapp);
		return existingapp;
	}

	@Override
	public void deleteLoanapp(int App_id) {
		loanappRepository.findById(App_id).orElseThrow(()-> new ResourceNotfoundException("LoanApp","Id", App_id));
		loanappRepository.deleteById(App_id);
	}

}
