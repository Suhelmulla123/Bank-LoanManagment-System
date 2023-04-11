package com.system.app.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.FloatingRates;
import com.system.app.repository.Floatingratesrepository;
import com.system.app.service.FloatingrateService;
@Service
public class FloatingRatesimpl implements FloatingrateService {
	
	@Autowired
	private Floatingratesrepository floatingratesRepository;

	@Override
	public FloatingRates addFloatingrates(FloatingRates floatingrates) {
		floatingratesRepository.save(floatingrates);
		return floatingrates;
	}

	@Override
	public FloatingRates updtaeFloatingrates(FloatingRates floatingrates, int No) {
		FloatingRates existingfloatingrate =floatingratesRepository.findById(No).orElseThrow(()-> new ResourceNotfoundException("FloatingRates", "Id", No));
		
		existingfloatingrate.setLoan_Type(floatingrates.getLoan_Type());
		existingfloatingrate.setDuration(floatingrates.getDuration());
		existingfloatingrate.setRate(floatingrates.getRate());
		
		floatingratesRepository.save(existingfloatingrate);
		
		return existingfloatingrate;
	}

	@Override
	public void deleteFloatingrates(int No) {
		floatingratesRepository.findById(No).orElseThrow(()-> new ResourceNotfoundException("FloatingRates", "Id", No));
		floatingratesRepository.deleteById(No);
	}

}
