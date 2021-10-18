package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.InstituteStatus;
@Repository
public class InstituteStatusDAOImpl implements InstituteStatusDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Override
	@Transactional
	public void addInstituteStatus(InstituteStatus InstituteStatusObj) {  
		System.out.println(entityManager);
		entityManager.merge(InstituteStatusObj);
		
	}


	@Transactional
	public void deleteInstituteStatus(String instituteCode)
	{
		InstituteStatus instituteStatus = entityManager.find(InstituteStatus.class, instituteCode);
		System.out.println(entityManager);
		entityManager.remove(instituteStatus);
		
	}

	@Transactional
	public InstituteStatus getStatus(String instituteCode) {
		InstituteStatus instituteStatus = entityManager.find(InstituteStatus.class, instituteCode);
		return instituteStatus;
	}



	@Transactional
	public void updateInstituteStatus(String instituteCode,String minsitryApprovalStatus,String stateNodalOfficerStatus) {
		InstituteStatus instituteStatusObj = entityManager.find(InstituteStatus.class, "101");
		instituteStatusObj.setInstituteCode(instituteCode);
		instituteStatusObj.setMinsitryApprovalStatus(minsitryApprovalStatus);
		instituteStatusObj.setStateNodalOfficerStatus(stateNodalOfficerStatus);;
		System.out.println(entityManager);
	entityManager.merge(instituteStatusObj);
	}


	@Transactional
    public List<InstituteStatus> getallInstituteStatus() {
        // TODO Auto-generated method stub
        Query query =entityManager.createQuery("from InstituteStatus");
        List<InstituteStatus> instituteStatus=query.getResultList();
        return instituteStatus;

	}
	

}


