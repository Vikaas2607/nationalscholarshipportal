package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentPersonalDetail;

public interface StudentPersonalDetailDAO {
public void addStudentPersonalDetail(StudentPersonalDetail personalObj);    
	
	public void deletePersonalDetail(String aadhar);
	
	public void updatePersonalDetail(String aadhar,String category,String chooseScheme, String community, int familyIncome, String fathersProfession, String isDisabled, String maritalStatus, String mothersProfession, String religion );
	
	public StudentPersonalDetail getPersonalDetail(String aadhar);
	
	public List< StudentPersonalDetail> getAllPersonalDetail ();
}
