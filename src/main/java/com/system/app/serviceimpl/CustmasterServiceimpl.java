package com.system.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.CustMaster;
import com.system.app.repository.CustmasterRepository;
import com.system.app.service.CustmasterService;
@Service
public class CustmasterServiceimpl implements CustmasterService{
	
	@Autowired
	private CustmasterRepository custmasterRepository;

	@Override
	public CustMaster addCustmaster(CustMaster custmaster) {
		custmasterRepository.save(custmaster);
		return custmaster;
	}

	@Override
	public CustMaster updateCustmaster(CustMaster custmaster, int C_ID) {
		CustMaster existingcustm=custmasterRepository.findById(C_ID).orElseThrow(()-> new ResourceNotfoundException("CustMaster","Id", C_ID));
		existingcustm.setCust_Name(custmaster.getCust_Name());
		existingcustm.setPAN_No(custmaster.getPAN_No());
		existingcustm.setGender(custmaster.getGender());
		existingcustm.setCity(custmaster.getCity());
		existingcustm.setAddress(custmaster.getAddress());
		existingcustm.setMobileNo(custmaster.getMobileNo());
		existingcustm.setWork_phone(custmaster.getWork_phone());
		existingcustm.setDob(custmaster.getDob());
		existingcustm.setStatus(custmaster.getStatus());
		
		custmasterRepository.save(existingcustm);
		return existingcustm;
	}

	@Override
	public void deleteCustmaster(int C_ID) {
		custmasterRepository.findById(C_ID).orElseThrow(()-> new ResourceNotfoundException("CustMaster","Id", C_ID));		
		custmasterRepository.deleteById(C_ID);
		
	}

}
