package com.lti.appl.nsp.dao;



import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.InstituteDetail;


@Repository
public class InstituteRegistrationDAOImpl implements InstituteRegistrationDAO {
	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void insertIntoInstituteRegistrationForm(InstituteDetail instituteRegisterObj) {
		System.out.println("entityManager");
		entityManager.persist(instituteRegisterObj);
	}

	


	

}
