package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.InstituteDetail;
@Repository
public class InstituteDetailDAOImpl implements InstituteDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	
	public void addInstitute(InstituteDetail instituteObj) {
		System.out.println("entityManager");
		entityManager.merge(instituteObj);
	}

	@Override
	public void deleteAddress(int instituteCode) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateAddress(InstituteDetail updateObj) {
		// TODO Auto-generated method stub

	}

	@Transactional
	public InstituteDetail getInstituteDetail(String instituteCode) {
		// TODO Auto-generated method stub
		InstituteDetail instituteDetail = entityManager.find(InstituteDetail.class, instituteCode);
		return instituteDetail;
	}

	@Transactional
	public List<InstituteDetail> getAllInstituteDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from InstituteDetail");
		List<InstituteDetail> instituteDetail= query.getResultList();
		return instituteDetail;
	}
	
	

}
