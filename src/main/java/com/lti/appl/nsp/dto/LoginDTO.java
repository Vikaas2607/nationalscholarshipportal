package com.lti.appl.nsp.dto;

public class LoginDTO {
String aadhar;
String institute_mail;
String State_Nodal_Officer_Password;
String Minister_Password;
int Minister_Id;
int State_Nodal_Officer_Id;
//String password;
String password;
public String getAadhar() {
	return aadhar;
}
public void setAadhar(String aadhar) {
	this.aadhar = aadhar;
}
public String getInstitute_mail() {
	return institute_mail;
}
public void setInstitute_mail(String institute_mail) {
	this.institute_mail = institute_mail;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getState_Nodal_Officer_Password() {
	return State_Nodal_Officer_Password;
}
public void setState_Nodal_Officer_Password(String state_Nodal_Officer_Password) {
	State_Nodal_Officer_Password = state_Nodal_Officer_Password;
}
public String getMinister_Password() {
	return Minister_Password;
}
public void setMinister_Password(String minister_Password) {
	Minister_Password = minister_Password;
}
public int getMinister_Id() {
	return Minister_Id;
}
public void setMinister_Id(int minister_Id) {
	Minister_Id = minister_Id;
}
public int getState_Nodal_Officer_Id() {
	return State_Nodal_Officer_Id;
}
public void setState_Nodal_Officer_Id(int state_Nodal_Officer_Id) {
	State_Nodal_Officer_Id = state_Nodal_Officer_Id;
}}

