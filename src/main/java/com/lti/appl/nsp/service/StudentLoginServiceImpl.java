package com.lti.appl.nsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
import com.lti.appl.nsp.dao.StudentLoginDAO;

@Service
public class StudentLoginServiceImpl implements StudentLoginService {
@Autowired
StudentLoginDAO sbdObj;

	@Override
	public boolean isStudentPresentService(String aadhar, String password) {
		boolean res= sbdObj.isPresent(aadhar,password);
		System.out.println("it reached service impl");
	
		return res;
	}
		
	
	
	}
			