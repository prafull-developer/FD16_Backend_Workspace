package com.cjc.dto;

import lombok.Data;

@Data

public class RegistrationFormStatus {
	
	
	private int age;
	private String gender;
	private String email;
	private double mobileNo;
	private double loanRequired;
	private Loaninfo cLoanInfo;
	private  CustomerAddress cAddress;
	private Mortgage  cMortgageDetails;
	private AllpersonalDocs callPersonalDocs;
	private String status;
	private LoanDetails cLoanDetails;
	private AccountDetails cAccountDetails;
	
	

}
