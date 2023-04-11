package com.system.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.FixedRates;
import com.system.app.repository.FixedratesRepository;
import com.system.app.service.FixedratesService;
@Service
public class FixedRatesimpl implements FixedratesService {
	@Autowired
	private FixedratesRepository fixedrateRepository;
	
	//add fixed rates loan types

	@Override
	public FixedRates addFixedratesloan(FixedRates fixedrates) {
		fixedrateRepository.save(fixedrates);
		return fixedrates;
	}
	
	
	// update fixed rates loan types

	@Override
	public FixedRates updateFixedrates(FixedRates fixedrates, int No) {
		FixedRates existingrates= fixedrateRepository.findById(No).orElseThrow(()-> new ResourceNotfoundException("FixedRates", "Id", No));
		
		existingrates.setLoan_Type(fixedrates.getLoan_Type());
		existingrates.setDuration(fixedrates.getDuration());
		existingrates.setRate(fixedrates.getRate());
		
		fixedrateRepository.save(existingrates);
		return existingrates;
	}

	@Override
	public void deleteFixedrates(int No) {
		fixedrateRepository.findById(No).orElseThrow(()-> new ResourceNotfoundException("FixedRates", "Id", No));
		fixedrateRepository.deleteById(No);
	}

}
