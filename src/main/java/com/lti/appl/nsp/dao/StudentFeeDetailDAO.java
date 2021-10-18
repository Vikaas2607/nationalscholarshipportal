package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentFeeDetail;

public interface StudentFeeDetailDAO {
public void addStudentFeeDetail(StudentFeeDetail feeObj);    
	
	public void deleteFeeDetail(String aadhar);
	
	public void updateFeeDetail(String aadhar, int admissionFee, int otherFee, int tuitionFee);
	
	public StudentFeeDetail getFeeDetail(String aadhar);
	
	public List< StudentFeeDetail> getAllFeeDetail ();
}
