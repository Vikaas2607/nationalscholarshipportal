package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentStatusDetail;

public interface StudentStatusDetailDAO {
	public void addStudentStatusDetail(StudentStatusDetail StudentStatusObj);         
	public void deleteStudentStatusDetail(String aadhar);
	public void updateStudentStatusDetail(String aadhar,String instituteApprovalStatus,String ministryApprovalStatus,int sanctionedAmount,String stateNodalOfficerStatus);
	public List<StudentStatusDetail> getallStudentStatusDetail();
	public StudentStatusDetail getStudentStatusDetail(String aadhar);
}
