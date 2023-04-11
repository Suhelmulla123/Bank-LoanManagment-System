package com.system.app.model;




import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="admin_Login_Details")
public class AdminLogin {
	@Id
	@Column(name="UserName")
	private String  User_Name;
	

	@Column(name="Password")
	private String Password;
	
	
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
	
	public AdminLogin(String user_Name, String password) {
		super();
		User_Name = user_Name;
		Password = password;
	}
	public AdminLogin() {
		
		
	}
	
	


}
