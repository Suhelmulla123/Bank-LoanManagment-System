package com.system.app.model;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Floating_Rates_Loan")
public class FloatingRates
{
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int  No;
	
	@Column(name="Loan_type")
	private String Loan_Type;
	
	@Column(name="Duration in years")
	private String  Duration;
	
	@Column(name="Rates in %")
	private double Rate;
	
	
	public int getNo() {
		return No;
	}
	public void setNo(int no) {
		No = no;
	}
	public String getLoan_Type() {
		return Loan_Type;
	}
	public void setLoan_Type(String loan_Type) {
		Loan_Type = loan_Type;
	}
	public String getDuration() {
		return Duration;
	}
	public void setDuration(String duration) {
		Duration = duration;
	}
	public double getRate() {
		return Rate;
	}
	public void setRate(double rate) {
		Rate = rate;
	}
}
