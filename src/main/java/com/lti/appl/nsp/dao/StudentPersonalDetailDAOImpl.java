package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentPersonalDetail;
@Repository
public class StudentPersonalDetailDAOImpl implements StudentPersonalDetailDAO {

	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addStudentPersonalDetail(StudentPersonalDetail personalObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.merge(personalObj); 

	}

	@Transactional
	public void deletePersonalDetail(String aadhar) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(aadhar);

	}

	@Transactional
	public void updatePersonalDetail(String aadhar, String category, String chooseScheme, String community,
			int familyIncome, String fathersProfession, String isDisabled, String maritalStatus,
			String mothersProfession, String religion) {
		// TODO Auto-generated method stub
		StudentPersonalDetail personalDetail = entityManager.find(StudentPersonalDetail.class, aadhar);
		personalDetail.setAadhar(aadhar);
		personalDetail.setCategory(category);
		personalDetail.setChooseScheme(chooseScheme);
		personalDetail.setCommunity(community);
		personalDetail.setFamilyIncome(familyIncome);
		personalDetail.setFathersProfession(fathersProfession);
		personalDetail.setIsDisabled(isDisabled);
		personalDetail.setMaritalStatus(maritalStatus);
		personalDetail.setMothersProfession(mothersProfession);
		personalDetail.setReligion(religion);
		
		entityManager.merge(personalDetail);

	}

	@Transactional
	public StudentPersonalDetail getPersonalDetail(String aadhar) {
		// TODO Auto-generated method stub
		StudentPersonalDetail personalDetail = entityManager.find(StudentPersonalDetail.class, aadhar);
		return personalDetail;
	}

	@Transactional
	public List<StudentPersonalDetail> getAllPersonalDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from StudentPersonalDetail");
		List<StudentPersonalDetail> studentPersonalDetail= query.getResultList();
		return studentPersonalDetail;
	}

}
