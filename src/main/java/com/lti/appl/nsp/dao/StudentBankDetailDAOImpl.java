package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentBankDetail;
@Repository
public class StudentBankDetailDAOImpl implements StudentBankDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Transactional
	public void addStudentBankDetail(StudentBankDetail bankObj){
	System.out.println(entityManager);
	entityManager.persist(bankObj); 
	}
	@Transactional                  
	public void deleteBankDetail(String accountNo){
	System.out.println(entityManager);
	entityManager.remove(accountNo);
	}
	
	@Transactional
	public StudentBankDetail getBank(String accountNo){
	StudentBankDetail bankDetail = entityManager.find(StudentBankDetail.class, accountNo);
	return bankDetail;
	}
	@Transactional
	public void updateBankDetail(String accountNo,String bankName,String bankIfsc){
	StudentBankDetail bankDetail = entityManager.find(StudentBankDetail.class, accountNo);
	bankDetail.setAccountNo(accountNo);
	bankDetail.setBankName(bankName);
	bankDetail.setBankIfsc(bankIfsc);
	entityManager.merge(bankDetail);
	}
	
	@Transactional
	public List<StudentBankDetail> getAllBankDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from StudentBankDetail");
		List<StudentBankDetail> studentBankDetail= query.getResultList();
		return studentBankDetail;
		
	}

}
