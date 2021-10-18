package com.lti.appl.nsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentBasicDetail;

@Repository
public class StudentRegistrationDAOImpl implements StudentRegistrationDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void insertIntoStudentRegistrationForm(StudentBasicDetail studentRegisterObj) {
		// TODO Auto-generated method stub
		System.out.println("entityManager");
		entityManager.merge(studentRegisterObj);

	}

}
