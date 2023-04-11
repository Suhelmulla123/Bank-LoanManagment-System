package com.system.app.serviceimpl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.Registration;
import com.system.app.repository.RegistrationRepository;
import com.system.app.service.RegistrationService;
 
@Service
public class RegistrationServiceimpl implements RegistrationService {
	@Autowired
	private RegistrationRepository registrationRepository;

	@Override
	public Registration addRegistration(Registration registration) {
		registrationRepository.save(registration);
		return registration;
	}

	
	

	@Override
	public Registration getRegistrationById(int id) {
		
		Optional<Registration> registration=registrationRepository.findById(id);
		if(registration.isPresent()) 
		{
			return registration.get();
		}
		else 
		{
			throw new ResourceNotfoundException("Registration", "Id" , id);
		}
		
		
		
	}

	//get all registrations
	@Override
	public List<Registration> getAllRegistrations() {
		
		return registrationRepository.findAll();
	}

	@Override
	public Registration updateRegistration(Registration registration, int Rid) {
		
		Registration existingregist= registrationRepository.findById(Rid).orElseThrow(()-> new ResourceNotfoundException("Registration", "Id", Rid));
		
		existingregist.setFullName(registration.getFullName());
		existingregist.setUserName(registration.getUserName());
		existingregist.setPassword(registration.getPassword());
		existingregist.setMobileNo(registration.getMobileNo());
		existingregist.setEmailId(registration.getEmailId());
		
		registrationRepository.save(existingregist);
		return existingregist;
		
	}

	@Override
	public void deleteRegistration(int Rid) {
		registrationRepository.findById(Rid).orElseThrow(()-> new ResourceNotfoundException("Registration", "Id", Rid));
		registrationRepository.deleteById(Rid);
	}




	@Override
	public Registration getRegistrationByUserName(Registration registration) {
		// TODO Auto-generated method stub
		return null;
	}

}
