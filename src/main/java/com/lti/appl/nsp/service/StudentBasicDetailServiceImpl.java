package com.lti.appl.nsp.service;

import java.util.List;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.StudentBankDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.dao.StudentBankDetailDAO;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
@Service

public class StudentBasicDetailServiceImpl implements StudentBasicDetailService {
@Autowired
StudentBasicDetailDAO studentBasicDetailDAO;
@Autowired
StudentBankDetailDAO studentBankDetailDAO;
	@Override
	public List<StudentBasicDetail> getAllStudentBasicDetailService() {
		List<StudentBasicDetail> allStudentBasicDetail = studentBasicDetailDAO.getAll();
		return allStudentBasicDetail;
	}
	@Override
	public String addStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		try {
			studentBasicDetailDAO.addStudentBasicDetail(studentBasicDetail);
			return ("User registred!!");} 
		catch (Exception e) {
			return ("User already registred!!");
	
		}
	}
	@Override
	public boolean register(String aadhar, String password) {
		// TODO Auto-generated method stub
		return false;
	}
	@Override
	public StudentBasicDetail getStudentBasicDetailOfAadhar(String aadhar) {
		// TODO Auto-generated method stub
		return null;
	}
/*
@Override
	public String login(String aadhar,String password) {
			try {
				StudentBasicDetail resObj = studentBasicDetailDAO.getStudentBasicDetailOfAadhar(aadhar);
				String currentPassword = studentBasicDetailDAO.login(aadhar);
				if(password.equals(currentPassword)) {
					return "Password Matched";
				}else {
					throw new Exception("Password doesn't Matched");
				}
			}catch (Exception e) {
				return ("User account not found");
			}
	
	}*/
@Override
public String login(String aadhar,String password) {
try {
	StudentBasicDetail studentBasicObj = studentBasicDetailDAO.login(aadhar);
	
	if(studentBasicObj==null) {
		throw new Exception("invalid Aadhar");
		}else if(!studentBasicObj.getPassword().equals(password)) {
			throw new Exception("Invalid Password");
			}else {
				return "Login Successful";
			}
	} catch (Exception e) {
		return e.getMessage();
	}
	
}

	@Override
	public List<StudentBasicDetail> getStudentBasicDetailOfInstitute(int instituteCode) {
		// TODO Auto-generated method stub
		return null;
	}
	//this is bank service lets shift
	public String addStudentBankDetail(StudentBankDetail bankObj){
		try {
			studentBankDetailDAO.addStudentBankDetail(bankObj);
			return ("User registred!!");} 
		catch (Exception e) {
			return ("User already registred!!");
	
		}
}
}