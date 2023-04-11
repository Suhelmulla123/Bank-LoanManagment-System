package com.system.app.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Fixed_rates_Loan")
public class FixedRates {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int No;
	
	@Column(name="Loan_Type")
	private String Loan_Type;
	
	@Column(name="Duration in Years")
	private String Duration;
	
	@Column(name="Rate")
	private double  Rate;
	
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
