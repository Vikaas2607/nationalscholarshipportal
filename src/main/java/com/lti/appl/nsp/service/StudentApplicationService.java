package com.lti.appl.nsp.service;

import com.lti.appl.nsp.dto.ScholarshipApplicationDTO;

public interface StudentApplicationService {
	public String addScholarshipApplication(ScholarshipApplicationDTO scholarshipApplicationDto);
	public String testStu(ScholarshipApplicationDTO scholarshipApplicationDto);
	public String registerStudent(ScholarshipApplicationDTO scholarshipApplicationDto);//transient class//add==registerStudent
}
