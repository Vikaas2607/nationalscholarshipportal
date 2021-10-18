package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentAcademicDetail;

public interface StudentAcademicDetailDAO {
public void addStudentAcademicDetail(StudentAcademicDetail academicObj);    //used to add
	
	public void deleteAcademicDetail(String aadhar);
	
	public void updateAcademicDetail(String aadhar, String boardName,int passingYear, Float percentage, String rollNo, int standard);
	
	public StudentAcademicDetail getAcademicDetail(String aadhar);
	
	public List< StudentAcademicDetail> getAllAcademicDetail ();
}
