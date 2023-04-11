package com.system.app.model;


import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;
@Entity
@Table(name="Loan_master_data")
public class LoanMaster {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int Loan_ID;	
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int C_ID;
	private String  Loan_Type;
	private int Loan_Tenure;
	private int Loan_Amount;
	private String Interest_Type; 
	private float Interest_Rate;
	private String IssueDate;
	private String Mortgage_Details;
	private String Guarantor_Name;
	private String Address;
	private String ContactNo;
	
	@ManyToOne
	@JoinColumn(name="Custmaster_cid")
	private CustMaster custmaster;
	
	

	public int getLoan_ID() {
		return Loan_ID;
	}
	public void setLoan_ID(int loan_ID) {
		Loan_ID = loan_ID;
	}
	public int getC_ID() {
		return C_ID;
	}
	public void setC_ID(int c_ID) {
		C_ID = c_ID;
	}
	public String getLoan_Type() {
		return Loan_Type;
	}
	public void setLoan_Type(String loan_Type) {
		Loan_Type = loan_Type;
	}
	public int getLoan_Tenure() {
		return Loan_Tenure;
	}
	public void setLoan_Tenure(int loan_Tenure) {
		Loan_Tenure = loan_Tenure;
	}
	public int getLoan_Amount() {
		return Loan_Amount;
	}
	public void setLoan_Amount(int loan_Amount) {
		Loan_Amount = loan_Amount;
	}
	public String getInterest_Type() {
		return Interest_Type;
	}
	public void setInterest_Type(String interest_Type) {
		Interest_Type = interest_Type;
	}
	public float getInterest_Rate() {
		return Interest_Rate;
	}
	public void setInterest_Rate(float interest_Rate) {
		Interest_Rate = interest_Rate;
	}
	public String getIssueDate() {
		return IssueDate;
	}
	public void setIssueDate(String issueDate) {
		IssueDate = issueDate;
	}
	public String getMortgage_Details() {
		return Mortgage_Details;
	}
	public void setMortgage_Details(String mortgage_Details) {
		Mortgage_Details = mortgage_Details;
	}
	public String getGuarantor_Name() {
		return Guarantor_Name;
	}
	public void setGuarantor_Name(String guarantor_Name) {
		Guarantor_Name = guarantor_Name;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public String getContactNo() {
		return ContactNo;
	}
	public void setContactNo(String contactNo) {
		ContactNo = contactNo;
	}
	public CustMaster getCustmaster() {
		return custmaster;
	}
	public void setCustmaster(CustMaster custmaster) {
		this.custmaster = custmaster;
	}
	
	

}
