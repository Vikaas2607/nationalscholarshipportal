package com.lti.appl.nsp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.InstituteDetail;
import com.lti.appl.nsp.beans.StudentBankDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.dao.InstituteDetailDAO;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
import com.lti.appl.nsp.dto.StudentRegistrationDTO;
@Service
public class StudentRegistrationServiceImpl implements StudentRegistrationService {
@Autowired
StudentBasicDetailDAO addStudentBasicDetailDAOObj; 
@Autowired
InstituteDetailDAO instituteDetailDAOObj;
	@Override
	public String registerStudent(StudentRegistrationDTO studentRegistrationDTO) {

		
		
			StudentBasicDetail sbd = new StudentBasicDetail();
			sbd.setAadhar(studentRegistrationDTO.getAadhar());
			System.out.println("it reached service impl"+studentRegistrationDTO.getAadhar());
			sbd.setPassword(studentRegistrationDTO.getPassword());
			sbd.setName(studentRegistrationDTO.getName());
			sbd.setDateOfBirth(studentRegistrationDTO.getDateOfBirth());
			sbd.setGender(studentRegistrationDTO.getGender());
			sbd.setMobile(studentRegistrationDTO.getMobile());
			sbd.setEmailId(studentRegistrationDTO.getEmailId());
			sbd.setFathersName(studentRegistrationDTO.getFathersName());
			sbd.setMothersName(studentRegistrationDTO.getMothersName());
			sbd.setAge(studentRegistrationDTO.getAge());
			System.out.println("it reached service impl"+studentRegistrationDTO.getAge());
			//ins.setInstituteCode(studentRegistrationDTO.getInstituteCode());
	/*		InstituteDetail instituteDetail = instituteDetailDAOObj.getInstituteDetail(studentRegistrationDTO.getInstituteCode());
			System.out.println(studentRegistrationDTO.getInstituteCode());
			
			sbd.setInstituteDetail(instituteDetail); */
			System.out.println(studentRegistrationDTO.getInstituteCode());
			
			Set<StudentBankDetail> sbads = new HashSet<StudentBankDetail>();
			StudentBankDetail sbad = new StudentBankDetail();
			sbad.setAccountNo(studentRegistrationDTO.getAccountNo());
			sbad.setBankIfsc(studentRegistrationDTO.getBankIfsc());
			sbad.setBankName(studentRegistrationDTO.getBankName());
			sbads.add(sbad);
			sbad.setStudentBasicDetail(sbd);
			sbd.setStudentBankDetails(sbads);

			
			
			addStudentBasicDetailDAOObj.addStudentBasicDetail(sbd);
		
	return "fine";
}

}
