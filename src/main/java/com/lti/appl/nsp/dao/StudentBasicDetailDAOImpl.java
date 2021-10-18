package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.InstituteDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
@Repository
public class StudentBasicDetailDAOImpl implements StudentBasicDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	public void addStudentBasicDetail(StudentBasicDetail addStudentBasicDetailObj) {
		System.out.println("entityManager");
		entityManager.merge(addStudentBasicDetailObj);
	}

	

	

	@Transactional
	public List<StudentBasicDetail> getAll() {
		List<StudentBasicDetail> studentBasicDetail = entityManager.createQuery(" from StudentBasicDetail").getResultList();
		return studentBasicDetail;
	}

	@Transactional
	public void updateStudentBasicDetail(StudentBasicDetail updateStudentBasicDetailObj) {
		// TODO Auto-generated method stub
		
	}

	



	@Override
	public void deleteStudentBasicDetail(int aadhar) {
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public StudentBasicDetail getStudentBasicDetail(String aadhar) {
		// TODO Auto-generated method stub
		
		StudentBasicDetail studentBasicDetail = entityManager.find(StudentBasicDetail.class, aadhar);
		return studentBasicDetail;
	}
	
	


	@Transactional
	public StudentBasicDetail login(String aadhar) {
		StudentBasicDetail studentBasicDetailObj = entityManager.find(StudentBasicDetail.class, aadhar);
		return studentBasicDetailObj;
	}



	
}



