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
public class StateNodalOfficerDAOImpl implements StateNodalOfficerDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public List<StateNodalOfficer> getAllStateNodalOfficer() {
		Query query =entityManager.createQuery("from StateNodalOfficer");
		List<StateNodalOfficer> stateNodalOfficer=query.getResultList();
		return stateNodalOfficer;
	}
	

	@Transactional
	public void addStateNodalOfficer(StateNodalOfficer stateObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.merge(stateObj); 
	}

	@Transactional
	public void deleteStateNodalOfficer(int stateNodalOfficerId) {
		StateNodalOfficer stateNodalOfficer =entityManager.find(StateNodalOfficer.class, stateNodalOfficerId);
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(stateNodalOfficer);
	}
	
	@Transactional
	public void updateStateNodalOfficer(int stateNodalOfficerId, String stateNodalOfficerName, String stateNodalOfficerPassword,
			String state) {
		StateNodalOfficer stateNodalOfficer=entityManager.find(StateNodalOfficer.class, 202);
		stateNodalOfficer.setStateNodalOfficerId(stateNodalOfficerId);
		stateNodalOfficer.setStateNodalOfficerName(stateNodalOfficerName);
		stateNodalOfficer.setStateNodalOfficerPassword(stateNodalOfficerPassword);
		stateNodalOfficer.setState(state);
		entityManager.merge(stateNodalOfficer);
		// TODO Auto-generated method stub
		
	}

	@Transactional
	public StateNodalOfficer getState(int stateNodalOfficerId) {
		// TODO Auto-generated method stub
		StateNodalOfficer stateNodalOfficer = entityManager.find(StateNodalOfficer.class, stateNodalOfficerId);
		return stateNodalOfficer;
	}


}
