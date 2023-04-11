package com.system.app.DTO;

public class LoginDTO {
	private String  User_Name;
	private String Password;
	
	@Override
	public String toString() {
		return "LoginDTO [User_Name=" + User_Name + ", Password=" + Password + "]";
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

	public LoginDTO(String user_Name, String password) {
		super();
		User_Name = user_Name;
		Password = password;
	}

}
