package com.lti.appl.nsp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.dao.StudentAcademicDetailDAO;
@Service
public class StudentAcademicDetailServiceImpl implements StudentAcademicDetailService {
	@Autowired
	StudentAcademicDetailDAO studentAcademicDetailDAO;
	@Override
	public String addStudentAcademicDetail(StudentAcademicDetail academicObj) {
		try {
			studentAcademicDetailDAO.addStudentAcademicDetail(academicObj);
			return ("User registred!!");} 
		catch (Exception e) {
			return ("User already registred!!");
	
		}
	}

}
