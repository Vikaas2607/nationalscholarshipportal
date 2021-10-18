package com.lti.appl.nsp.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.beans.StudentBankDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.dto.InstituteRegisterDTO;
import com.lti.appl.nsp.dto.LoginDTO;
import com.lti.appl.nsp.dto.ScholarshipApplicationDTO;
import com.lti.appl.nsp.dto.StudentLoginDTO;
import com.lti.appl.nsp.dto.StudentRegistrationDTO;
import com.lti.appl.nsp.service.InstituteRegisterService;
import com.lti.appl.nsp.service.StudentAcademicDetailService;
import com.lti.appl.nsp.service.StudentApplicationService;
import com.lti.appl.nsp.service.StudentBasicDetailService;
import com.lti.appl.nsp.service.StudentLoginService;
import com.lti.appl.nsp.service.StudentRegistrationService;

@RestController

@CrossOrigin(origins = "*")
public class Controller {
	@Autowired
	StudentBasicDetailService studentBasicDetailService;
	@Autowired
	StudentAcademicDetailService studentAcademicDetailService;
	@Autowired
	StudentApplicationService studentApplicationService; 
	@Autowired
	InstituteRegisterService instituteRegisterService; 
	@Autowired
	StudentRegistrationService studentRegisterService; 
	@Autowired
	StudentLoginService sls;
	
	
	
	
	
@GetMapping(path="/getStudentRegistrationDetails")//working

public List<StudentBasicDetail> getAll(){
  List<StudentBasicDetail> getAllStudentBasicDetails = studentBasicDetailService.getAllStudentBasicDetailService();
  return getAllStudentBasicDetails;
}


@PostMapping(path="/addStudentBasicDetails")

public String addStudentBasicDetail(@RequestBody StudentBasicDetail studentBasicDetail) {
	try {
		studentBasicDetailService.addStudentBasicDetail(studentBasicDetail);
		
		return ("User registered!!");
	} 
	catch (Exception e) {
		
		return ("User already registered!!");
	}

}

@PostMapping(path="/addStudentAcademicDetails")
public String addStudentAcademicDetail(@RequestBody StudentAcademicDetail studentAcademicDetail) {
	try {
		studentAcademicDetailService.addStudentAcademicDetail(studentAcademicDetail);
		
		return ("User registered!!");
	} 
	catch (Exception e) {
		
		return ("User already registered!!");
	}
}
@GetMapping(path="/studentLogin")
public String login(@RequestBody LoginDTO loginDto) {
	
	try {
		studentBasicDetailService.login(loginDto.getAadhar(), loginDto.getPassword());
		
		return ("Login Successfull");
	} catch (Exception e) {
		
		return ("Login UnSuccessfull");
	}
}




//working
@PostMapping(path = "/studentapplyingforscheme")
public String studentApplyForScheme(@RequestBody ScholarshipApplicationDTO scholarshipApplicationDTO) {
	return studentApplicationService.registerStudent(scholarshipApplicationDTO);

}
//working a
@PostMapping(path = "/instituteregistration")
public String registerInstitute(@RequestBody InstituteRegisterDTO instituteRegisterDTO) {
	return instituteRegisterService.registerInstitute(instituteRegisterDTO);

}
//working i
@PostMapping(path = "/studentregistration")
public String registerStudent(@RequestBody StudentRegistrationDTO studentRegisterDTO) {
	return studentRegisterService.registerStudent(studentRegisterDTO);

}






//working
@PostMapping(path="/studentlogin")
public boolean isStudentPresent(@RequestBody StudentLoginDTO studentLoginDTO ) {
	
	boolean students = sls.isStudentPresentService(studentLoginDTO.getAadhar(), studentLoginDTO.getPassword());
	return students;
}

}
