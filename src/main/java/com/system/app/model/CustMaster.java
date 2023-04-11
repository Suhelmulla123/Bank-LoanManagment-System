package com.system.app.model;




import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
@Entity
@Table(name="customer_master")
public class CustMaster {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO.IDENTITY)
	@Column(name="Custmaster_cid")

	private int C_ID;
	
	@Column(name="Customer_Name")
	private String  Cust_Name;
	
	@Column(name="PAN_No")
	private String  PAN_No;
	
	@Column(name="Gender")
	private String Gender;
	
	@Column(name="City")
	private String City;
	
	@Column(name="Address")
	private String  Address;
	
	@Column(name="MobileNO")
	private long MobileNo ;
	
	@Column(name="WorkPhone")
	private long Work_phone;
	
	@Column(name="Dob")
	private String  Dob;
	
	@Column(name="Status")
	private String  Status;
	
	public int getC_ID() {
		return C_ID;
	}
	public void setC_ID(int c_ID) {
		C_ID = c_ID;
	}
	public String getCust_Name() {
		return Cust_Name;
	}
	public void setCust_Name(String cust_Name) {
		Cust_Name = cust_Name;
	}
	public String getPAN_No() {
		return PAN_No;
	}
	public void setPAN_No(String pAN_No) {
		PAN_No = pAN_No;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
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
	public long getWork_phone() {
		return Work_phone;
	}
	public void setWork_phone(long work_phone) {
		Work_phone = work_phone;
	}
	public String getDob() {
		return Dob;
	}
	public void setDob(String dob) {
		Dob = dob;
	}
	public String getStatus() {
		return Status;
	}
	public void setStatus(String status) {
		Status = status;
	}
	

}
