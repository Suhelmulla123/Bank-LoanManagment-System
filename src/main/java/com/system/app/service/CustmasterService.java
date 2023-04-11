package com.system.app.service;

import com.system.app.model.CustMaster;

public interface CustmasterService {
	
	public CustMaster addCustmaster(CustMaster custmaster);
	public CustMaster updateCustmaster(CustMaster custmaster,int C_ID);
	public void deleteCustmaster(int C_ID);

}
