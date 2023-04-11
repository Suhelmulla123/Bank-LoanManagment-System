package com.system.app.service;

import com.system.app.model.LoanApp;

public interface LoanappService {
	
	public LoanApp addLoanapp(LoanApp loanapp);
	public LoanApp updateLoanapp(LoanApp loanapp,int App_id);
	public void deleteLoanapp(int App_id);

}
