package com.system.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="LoanApplication_data")
public class LoanApp {
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	@Column(name="Application_ID")
	private int  App_id;
	
	@Column(name="Loan_Type")
	private String Loan_Type;
	
	@Column(name="Loan_Ammount")
	private int  Loan_Amount;
	
	@Column(name="Customer_Name")
	private String  Cust_Name;
	
	@Column(name="Monthly_Income")
	private int Monthly_Income;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="Age")
	private int Age;
	
	@Column(name="Address")
	private String  Address;
	
	@Column(name="Mobile_No")
	private long  MobileNo;
	
	@Column(name="WorkPhone")
	private long WorkPhone;
	
	@Column(name="Email_Id")
	private String EmailID;
	
	public int getApp_id() {
		return App_id;
	}
	public void setApp_id(int app_id) {
		App_id = app_id;
	}
	public String getLoan_Type() {
		return Loan_Type;
	}
	public void setLoan_Type(String loan_Type) {
		Loan_Type = loan_Type;
	}
	public int getLoan_Amount() {
		return Loan_Amount;
	}
	public void setLoan_Amount(int loan_Amount) {
		Loan_Amount = loan_Amount;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public int getMonthly_Income() {
		return Monthly_Income;
	}
	public void setMonthly_Income(int monthly_Income) {
		Monthly_Income = monthly_Income;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getAge() {
		return Age;
	}
	public void setAge(int age) {
		Age = age;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public long getMobileNo() {
		return MobileNo;
	}
	public void setMobileNo(long mobileNo) {
		MobileNo = mobileNo;
	}
	public long getWorkPhone() {
		return WorkPhone;
	}
	public void setWorkPhone(long workPhone) {
		WorkPhone = workPhone;
	}
	public String getEmailID() {
		return EmailID;
	}
	public void setEmailID(String emailID) {
		EmailID = emailID;
	}
}
