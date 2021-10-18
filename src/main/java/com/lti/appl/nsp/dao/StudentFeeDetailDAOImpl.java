package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentFeeDetail;
@Repository
public class StudentFeeDetailDAOImpl implements StudentFeeDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addStudentFeeDetail(StudentFeeDetail feeObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.merge(feeObj);

	}

	@Transactional
	public void deleteFeeDetail(String aadhar) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(aadhar);


	}

	@Transactional
	public void updateFeeDetail(String aadhar, int admissionFee, int otherFee, int tuitionFee) {
		// TODO Auto-generated method stub
		StudentFeeDetail feeDetail = entityManager.find(StudentFeeDetail.class, aadhar);
		feeDetail.setAadhar(aadhar);
		feeDetail.setAdmissionFee(admissionFee);
		feeDetail.setOtherFee(otherFee);
		feeDetail.setTuitionFee(tuitionFee);

		entityManager.merge(feeDetail);
	}

	@Transactional
	public StudentFeeDetail getFeeDetail(String aadhar) {
		// TODO Auto-generated method stub
		StudentFeeDetail feeDetail = entityManager.find(StudentFeeDetail.class, aadhar);
		return feeDetail;
	}

	@Transactional
	public List<StudentFeeDetail> getAllFeeDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from StudentFeeDetail");
		List<StudentFeeDetail> studentFeeDetail= query.getResultList();
		return studentFeeDetail;
	}

}
