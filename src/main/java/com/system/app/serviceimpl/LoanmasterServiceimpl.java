package com.system.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.LoanMaster;
import com.system.app.repository.LoanmasterRepository;
import com.system.app.service.LoanmasterService;

@Service
public class LoanmasterServiceimpl implements LoanmasterService{
	
	@Autowired
	private LoanmasterRepository loanmasterRepository;

	@Override
	public LoanMaster addLoanmaster(LoanMaster loanmaster) {
		loanmasterRepository.save(loanmaster);
		return loanmaster;
	}

	

	@Override
	public void deleteLoanmaster(int Loan_ID) {
		loanmasterRepository.findById(Loan_ID).orElseThrow(()-> new ResourceNotfoundException("LoanMaster", "Id", Loan_ID));
		loanmasterRepository.deleteById(Loan_ID);
	}

}
