package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.appl.nsp.beans.StudentAcademicDetail;
@Repository
public class StudentAcademicDetailDAOImpl implements StudentAcademicDetailDAO {

	@PersistenceContext
	EntityManager entityManager;
	
	@Transactional
	public void addStudentAcademicDetail(StudentAcademicDetail academicObj) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.merge(academicObj);

	}

	@Transactional
	public void deleteAcademicDetail(String aadhar) {
		// TODO Auto-generated method stub
		System.out.println(entityManager);
		entityManager.remove(aadhar);

	}

	@Transactional
	public void updateAcademicDetail(String aadhar, String boardName, int passingYear, Float percentage,
			String rollNo, int standard) {
		// TODO Auto-generated method stub
		StudentAcademicDetail academicDetail = entityManager.find(StudentAcademicDetail.class, aadhar);
		academicDetail.setAadhar(aadhar);
		academicDetail.setBoardName(boardName);
		academicDetail.setPassingYear(passingYear);
		academicDetail.setPercentage(percentage);
		academicDetail.setRollNo(rollNo);
		academicDetail.setStandard(standard);
		entityManager.merge(academicDetail);

	}

	@Transactional	public StudentAcademicDetail getAcademicDetail(String aadhar) {
		// TODO Auto-generated method stub
		StudentAcademicDetail academicDetail = entityManager.find(StudentAcademicDetail.class, aadhar);
		return academicDetail;
	}

	@Transactional
	public List<StudentAcademicDetail> getAllAcademicDetail() {
		// TODO Auto-generated method stub
		Query query =entityManager.createQuery("from StudentAcademicDetail");
		List<StudentAcademicDetail> studentAcademicDetail= query.getResultList();
		return studentAcademicDetail;
	}




}
