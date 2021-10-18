package com.lti.appl.nsp.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentBasicDetail;
@Repository
public class StudentLoginDAOImpl implements StudentLoginDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	
	@Transactional
	public boolean isPresent(String aadhar, String password) {
	try {
			StudentBasicDetail ref = entityManager.find(StudentBasicDetail.class, aadhar);
			System.out.println("it reached dao impl");
			String id=ref.getAadhar();
		  //String mother=ref.getMothersName();
			System.out.println(ref.getMothersName());
			System.out.println(ref.getAadhar());
			String pass=ref.getPassword();
			System.out.println(ref.getPassword());
			if (aadhar==id & pass.equals(password)) {
				System.out.println("login successful");
				return true;
			}
			else {
				System.out.println("credentials incorrect");
				return false;
			}
			}catch(Exception ex) {
				System.out.println("user does not exist");
				return false;
			}
			}
	
			}
		
	


	
