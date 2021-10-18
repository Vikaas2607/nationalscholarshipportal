package com.lti.appl.nsp.dao;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.beans.StudentDisabilityDetail;
import com.lti.appl.nsp.beans.StudentDocumentDetail;
import com.lti.appl.nsp.beans.StudentFeeDetail;
import com.lti.appl.nsp.beans.StudentPersonalDetail;
@Repository
public class StudentApplySchemeDAOImpl implements StudentApplySchemeDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void insertIntoStudentApplicationFormViaAadhar(Address address, StudentAcademicDetail studentAcademicDetail,
			StudentDisabilityDetail studentDisabilityDetail, StudentDocumentDetail studentDocumentDetail,
			StudentPersonalDetail studentPersonalDetail, StudentFeeDetail studentFeeDetail
			) {
		StudentBasicDetail studentBasicDetails = new StudentBasicDetail();
		
		Set<Address> addressSet = new HashSet<>();
		Address address2 = new Address();
		address2.setStudentBasicDetail(studentBasicDetails);
		
		addressSet.add(address2);//
		
		studentBasicDetails.setAddresses( addressSet);
		studentBasicDetails.setStudentAcademicDetail(studentAcademicDetail);
		studentBasicDetails.setStudentPersonalDetail(studentPersonalDetail);
		studentBasicDetails.setStudentFeeDetail(studentFeeDetail);
		studentBasicDetails.setStudentDocumentDetail(studentDocumentDetail);
		studentBasicDetails.setStudentDisabilityDetail(studentDisabilityDetail);
		studentBasicDetails.setStudentAcademicDetail(studentAcademicDetail);
		
		entityManager.merge(studentBasicDetails);
		

	}

}
