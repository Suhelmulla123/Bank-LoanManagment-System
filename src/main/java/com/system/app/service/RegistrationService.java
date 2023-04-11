package com.system.app.service;

import java.util.List;

import com.system.app.model.Registration;



public interface RegistrationService {
	
	
	public Registration addRegistration(Registration registration);
	public Registration getRegistrationByUserName(Registration registration);
	public Registration getRegistrationById(int Rid);
	public List<Registration> getAllRegistrations();
	public Registration updateRegistration(Registration registration, int Rid);
	public void deleteRegistration(int Rid);

}
