package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentDisabilityDetail;
@Repository
public class StudentDisabilityDetailDAOImpl implements StudentDisabilityDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	public void addStudentDisabilityDetail(StudentDisabilityDetail disabilityObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.merge(disabilityObj);

	}

	@Transactional
	public void deleteDisabilityDetail(String aadhar) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(aadhar);


	}

	@Transactional
	public void updateDisabilityDetail(String aadhar, int percentageOfDisability, String typeOfDisability) {
		// TODO Auto-generated method stub
		StudentDisabilityDetail disabilityDetail = entityManager.find(StudentDisabilityDetail.class, aadhar);
		disabilityDetail.setAadhar(aadhar);
		disabilityDetail.setPercentageOfDisability(percentageOfDisability);
		disabilityDetail.setTypeOfDisability(typeOfDisability);
		entityManager.merge(disabilityDetail);
	}

	@Transactional
	public StudentDisabilityDetail getDisabilityDetail(String aadhar) {
		// TODO Auto-generated method stub
		StudentDisabilityDetail disabilityDetail = entityManager.find(StudentDisabilityDetail.class, aadhar);
		return disabilityDetail;
	}


	@Transactional
	public List<StudentDisabilityDetail> getAllDisabilityDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from StudentDisabilityDetail");
		List<StudentDisabilityDetail> studentDisabilityDetail= query.getResultList();
		return studentDisabilityDetail;
	}

}
