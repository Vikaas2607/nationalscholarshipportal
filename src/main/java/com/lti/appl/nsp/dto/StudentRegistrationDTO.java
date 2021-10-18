package com.lti.appl.nsp.dto;

import java.time.LocalDate;

import javax.persistence.Column;

public class StudentRegistrationDTO {

	private String aadhar;
	
	private int age;

	
	
	private LocalDate dateOfBirth;


	
	private String emailId;

	
	private String fathersName;
	
	private String gender;
	
	private String mobile;

	
	private String mothersName;
	
	private String name;
	
	private String password;
	
	
	
private String instituteCode;

private String blockOrTaluka;

private String city;

private String dist;


private String houseNumber;


private String line1;
private String line2;

private int pincode;


private String state;

private String streetNumber;
//bank

private String accountNo;


private String bankIfsc;


	
	public String getBlockOrTaluka() {
	return blockOrTaluka;
}

public void setBlockOrTaluka(String blockOrTaluka) {
	this.blockOrTaluka = blockOrTaluka;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}

public String getDist() {
	return dist;
}

public void setDist(String dist) {
	this.dist = dist;
}

public String getHouseNumber() {
	return houseNumber;
}

public void setHouseNumber(String houseNumber) {
	this.houseNumber = houseNumber;
}

public String getLine1() {
	return line1;
}

public void setLine1(String line1) {
	this.line1 = line1;
}

public String getLine2() {
	return line2;
}

public void setLine2(String line2) {
	this.line2 = line2;
}

public int getPincode() {
	return pincode;
}

public void setPincode(int pincode) {
	this.pincode = pincode;
}

public String getState() {
	return state;
}

public void setState(String state) {
	this.state = state;
}

public String getStreetNumber() {
	return streetNumber;
}

public void setStreetNumber(String streetNumber) {
	this.streetNumber = streetNumber;
}

	public String getInstituteCode() {
	return instituteCode;
}

public void setInstituteCode(String instituteCode) {
	this.instituteCode = instituteCode;
}

	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankIfsc() {
		return bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankName() {
		return bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	private String bankName;

	public String getAadhar() {
		return aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFathersName() {
		return fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMothersName() {
		return mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
}
