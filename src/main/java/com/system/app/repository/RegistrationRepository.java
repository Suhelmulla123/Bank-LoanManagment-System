package com.system.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.system.app.model.Registration;

public interface RegistrationRepository extends JpaRepository<Registration, Integer> {
	
	

}
