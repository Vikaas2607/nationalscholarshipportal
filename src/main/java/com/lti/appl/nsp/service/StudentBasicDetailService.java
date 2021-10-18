package com.lti.appl.nsp.service;

import java.util.List;

import com.lti.appl.nsp.beans.StudentBankDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;

public interface StudentBasicDetailService {
	public List<StudentBasicDetail> getAllStudentBasicDetailService();
	public String addStudentBasicDetail(StudentBasicDetail studentBasicDetail);//used from dao but return type changed
	public boolean register(String  aadhar, String password);
	public StudentBasicDetail getStudentBasicDetailOfAadhar(String aadhar);
	public String addStudentBankDetail(StudentBankDetail bankObj); //used for bank i have to shift later 
public String login(String aadhar,String password);
//public String userloginService(String emailId,String password);
	public List<StudentBasicDetail> getStudentBasicDetailOfInstitute(int instituteCode);
}
