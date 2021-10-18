package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentDocumentDetail;
@Repository
public class StudentDocumentDetailDAOImpl implements StudentDocumentDetailDAO {

	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	public void addStudentDocumentDetail(StudentDocumentDetail studentdocumentObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.persist(studentdocumentObj);

	}

	@Transactional
	public void deleteStudentDocumentDetail(String aadhar) {
		StudentDocumentDetail studentDocumentDetail=entityManager.find(StudentDocumentDetail.class, aadhar);
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(studentDocumentDetail);

	}



	@Transactional
	public List<StudentDocumentDetail> getallStudentDocumentDetail() {
		Query query =entityManager.createQuery("from StudentDocumentDetail");
		List<StudentDocumentDetail> studentDocumentDetail= query.getResultList();
		return studentDocumentDetail;
		// TODO Auto-generated method stub
		
		
	}

	@Transactional
	public StudentDocumentDetail getStudentDocumentDetail(String aadhar) {
		// TODO Auto-generated method stub
		StudentDocumentDetail studentDocumentDetail = entityManager.find(StudentDocumentDetail.class, aadhar);
		return studentDocumentDetail;
		
	}

	@Transactional
	public void updateStudentDocumentDetail(String aadhar,String aadhaarCard,String bankPassbookFrontPage,String casteOrIncomeCertificate,String domicileCertificate,String feeRecieptOfCurrentYear,String instituteBonafiedCertificate,String instituteIdCard,String ninthMarksheet,String previousYearMarksheet,String studentPhotograph,String tenthMarksheet,String twelfthMarksheet) {
		// TODO Auto-generated method stub
		StudentDocumentDetail studentdocumentObj = entityManager.find(StudentDocumentDetail.class,"102923458765");
		studentdocumentObj.setAadhaarCard(aadhaarCard);
		studentdocumentObj.setAadhar(aadhar);
		studentdocumentObj.setBankPassbookFrontPage(bankPassbookFrontPage);
		studentdocumentObj.setCasteOrIncomeCertificate(casteOrIncomeCertificate);
		studentdocumentObj.setDomicileCertificate(domicileCertificate);
		studentdocumentObj.setFeeRecieptOfCurrentYear(feeRecieptOfCurrentYear);
		studentdocumentObj.setInstituteBonafiedCertificate(instituteBonafiedCertificate);
		studentdocumentObj.setInstituteIdCard(instituteIdCard);
		studentdocumentObj.setNinthMarksheet(ninthMarksheet);
		studentdocumentObj.setPreviousYearMarksheet(previousYearMarksheet);
		studentdocumentObj.setStudentPhotograph(studentPhotograph);
		studentdocumentObj.setTenthMarksheet(tenthMarksheet);
		studentdocumentObj.setTwelfthMarksheet(twelfthMarksheet);
		
		entityManager.merge(studentdocumentObj);
	}

}
