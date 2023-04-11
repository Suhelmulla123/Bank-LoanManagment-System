package com.system.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="registration_data")
public class Registration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int  Rid;
	
	
	  @Column(name="FULL_NAME" )
	  private String FullName;
	 
	@Column(name="USERNAME")
	private String UserName;
	@Column(name="PASSWORD")
	private String Password;
	@Column(name="MOBILE_NO")
	private long  MobileNo;
	@Column(name="EMAIL_ID")
	private String EmailId;
	
	public int getRid() {
		return Rid;
	}
	public void setRid(int rid) {
		Rid = rid;
	}

	
	  public String getFullName(){
		 return FullName; 
	  }
	  public void setFullName(String fullName){
		  FullName = fullName;
	  }
	 
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public String getEmailId() {
		return EmailId;
	}
	public void setEmailId(String emailId) {
		EmailId = emailId;
	}
	
	

}
