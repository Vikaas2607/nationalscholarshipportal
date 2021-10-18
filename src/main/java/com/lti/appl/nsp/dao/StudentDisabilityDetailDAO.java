package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentDisabilityDetail;

public interface StudentDisabilityDetailDAO {
public void deleteDisabilityDetail(String aadhar);
public void addStudentDisabilityDetail(StudentDisabilityDetail disabilityObj);   	
	public void updateDisabilityDetail(String aadhar, int percentageOfDisability, String typeOfDisability);
	
	public StudentDisabilityDetail getDisabilityDetail(String aadhar);
	
	public List< StudentDisabilityDetail> getAllDisabilityDetail ();
}
