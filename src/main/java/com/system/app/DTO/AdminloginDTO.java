package com.system.app.DTO;

import jakarta.persistence.Column;
import jakarta.persistence.Id;

public class AdminloginDTO {

	
	private String  User_Name;
	private String Password;
	
	public AdminloginDTO(String user_Name, String password) {
		super();
		User_Name = user_Name;
		Password = password;
	}
	
	

	public AdminloginDTO() {
		
	}



	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}



	@Override
	public String toString() {
		return "AdminloginDTO [User_Name=" + User_Name + ", Password=" + Password + "]";
	}
	
	
	
}
