package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentBasicDetail;

public interface StudentBasicDetailDAO {

	public void addStudentBasicDetail(StudentBasicDetail addStudentBasicDetailObj);    //used to add                                 
	public void deleteStudentBasicDetail(int aadhar);
	public void updateStudentBasicDetail(StudentBasicDetail updateStudentBasicDetailObj);
	
	public StudentBasicDetail getStudentBasicDetail(String aadhar);
	public List<StudentBasicDetail> getAll();
	public StudentBasicDetail login(String aadhar);
	
}
