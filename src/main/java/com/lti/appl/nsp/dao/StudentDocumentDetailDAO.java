package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StudentDocumentDetail;

public interface StudentDocumentDetailDAO {
	public void addStudentDocumentDetail(StudentDocumentDetail studentdocumentObj);      
	public void deleteStudentDocumentDetail(String aadhar);
	public void updateStudentDocumentDetail(String aadhar,String aadhaarCard,String bankPassbookFrontPage,String casteOrIncomeCertificate,String domicileCertificate,String feeRecieptOfCurrentYear,String instituteBonafiedCertificate,String instituteIdCard,String ninthMarksheet,String previousYearMarksheet,String studentPhotograph,String tenthMarksheet,String twelfthMarksheet);
	public List<StudentDocumentDetail> getallStudentDocumentDetail();
	public StudentDocumentDetail getStudentDocumentDetail(String aadhar);
}
