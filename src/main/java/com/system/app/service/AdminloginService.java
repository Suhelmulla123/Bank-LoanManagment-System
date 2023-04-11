package com.system.app.service;

import com.system.app.DTO.AdminloginDTO;
import com.system.app.DTO.LoginDTO;
import com.system.app.model.AdminLogin;
import com.system.app.response.LoginResponse;

public interface AdminloginService {
	
    String addAdminlogin(AdminloginDTO adminlogindto);
	public AdminLogin updateAdminlogin(AdminLogin adminlogin, String User_Name);
	public void deleteAdminlogin(String User_Name);
	public LoginResponse login(AdminloginDTO adminlogindto);

}
