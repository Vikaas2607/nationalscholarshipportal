package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.Minister;
import com.lti.appl.nsp.beans.StateNodalOfficer;

@Repository
public class MinisterDAOImpl implements MinisterDAO {
	
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addMinister(Minister ministerObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.persist(ministerObj);

	}

	@Transactional
	public void deleteMinister(int ministerId) {
		Minister minister =entityManager.find(Minister.class, ministerId);
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(minister);
	}


	

	@Transactional
	public Minister getLogin(int ministerId) {
		// TODO Auto-generated method stub
		Minister ministerLogin = entityManager.find(Minister.class, ministerId);
		return ministerLogin;
		
		
	}

	@Transactional
	public List<Minister> getAllMinister() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from Minister");
		List<Minister> ministerLogin=query.getResultList();
		return ministerLogin;
		
	}

	@Transactional
	public void updateMinister(int ministerId, String ministerName,String ministerPassword) {
		Minister ministerObj = entityManager.find(Minister.class, 99);
		//ministerObj.setMinisterId(ministerId);
		ministerObj.setMinisterName(ministerName);
		ministerObj.setMinisterPassword(ministerPassword);
				entityManager.merge(ministerObj);
	}

}
