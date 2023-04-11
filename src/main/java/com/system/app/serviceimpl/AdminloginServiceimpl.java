package com.system.app.serviceimpl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.system.app.DTO.AdminloginDTO;
import com.system.app.DTO.LoginDTO;
import com.system.app.exception.ResourceNotfoundException;
import com.system.app.model.AdminLogin;
import com.system.app.repository.AdminloginRepository;
import com.system.app.response.LoginResponse;
import com.system.app.service.AdminloginService;


@Service
public class AdminloginServiceimpl implements AdminloginService{
	
	@Autowired
	private AdminloginRepository adminloginRepository;
	
	@Autowired
	private PasswordEncoder passwordEncoder;

	@Override
	public String addAdminlogin(AdminloginDTO adminlogindto) {
		
		AdminLogin adminlogin1=new AdminLogin(adminlogindto.getUser_Name(),adminlogindto.getPassword());
		adminloginRepository.save(adminlogin1);
		return adminlogin1.getUser_Name();
		
		
	}

	@Override
	public AdminLogin updateAdminlogin(AdminLogin adminlogin, String User_Name) {
		AdminLogin existingpass= adminloginRepository.findById(User_Name).orElseThrow(()-> new ResourceNotfoundException("AdminLogin", "Id", User_Name));
		
		existingpass.setPassword(adminlogin.getPassword());
		
		adminloginRepository.save(existingpass);
		
		return existingpass;
	}

	@Override
	public void deleteAdminlogin(String User_Name) {
		adminloginRepository.findById(User_Name).orElseThrow(()-> new ResourceNotfoundException("AdminLogin", "Id", User_Name));
		adminloginRepository.deleteById(User_Name);
	}

	@Override
	public LoginResponse login(AdminloginDTO adminlogindto) {
		//String message="";
		Optional<AdminLogin> adminlogin3=adminloginRepository.findById(adminlogindto.getUser_Name());
		
		if(adminlogin3 != null) 
		{
			String password= adminlogindto.getPassword();
			//Optional<AdminLogin> adminlogin4=adminloginRepository.findById(adminlogindto.getPassword());
			
			if( adminlogindto.getPassword().equals(password))
			  {
					return new LoginResponse("welcome admin", true);
		      }else
				{
					return new LoginResponse("password not correct", true);
				}
		}else 
			{
				return new LoginResponse("username not exists", false);
			}
			
	
		
		
	}





}
