package com.system.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.system.app.DTO.AdminloginDTO;
import com.system.app.DTO.LoginDTO;
import com.system.app.model.AdminLogin;
import com.system.app.response.LoginResponse;
import com.system.app.service.AdminloginService;

@RestController
@RequestMapping(value="/adminlogin")
public class AdminloginController {
	
	@Autowired
	private AdminloginService adminloginService;
	
	// add adminlogin details
	
	@PostMapping
	public String addAdminlogin(@RequestBody AdminloginDTO adminlogindto) 
	{
		String User_Name=adminloginService.addAdminlogin(adminlogindto);
		return User_Name;}
	
	@PostMapping(path="/login")
	public ResponseEntity<LoginResponse> loginAdmin(@RequestBody AdminloginDTO adminlogindto)
	{
		LoginResponse loginresponse= adminloginService.login(adminlogindto);
		return ResponseEntity.ok(loginresponse);
		
	}
	
	//update password of admin login
	@PutMapping(value="{Id}")
	public ResponseEntity<AdminLogin> updateAdminlogin(@PathVariable ("Id") String User_Name, @RequestBody AdminLogin adminlogin)
	{
		
		return new ResponseEntity<AdminLogin>(adminloginService.updateAdminlogin(adminlogin, User_Name),HttpStatus.OK);
		
	}
	
	//delete adminlogin details
	@DeleteMapping(value= "{Id}")
	public ResponseEntity<String> deleteAdminLogin(@PathVariable ("Id") String User_Name)
	{
		adminloginService.deleteAdminlogin(User_Name);
		return new ResponseEntity<String>("Admin details deleted successfully", HttpStatus.OK);
		
	}

}
