package com.lti.appl.nsp.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import javax.persistence.Query;
import org.springframework.stereotype.Repository;

import com.lti.appl.nsp.beans.StudentStatusDetail;
@Repository
public class StudentStatusDetailDAOImpl implements StudentStatusDetailDAO {
	@PersistenceContext
	EntityManager entityManager;
	@Override
	@Transactional
	public void addStudentStatusDetail(StudentStatusDetail StudentStatusObj) {
		System.out.println(entityManager);
		entityManager.persist(StudentStatusObj);
	}

@Transactional
	public void updateStudentStatusDetail(String aadhar,String instituteApprovalStatus,String ministryApprovalStatus,int sanctionedAmount,String stateNodalOfficerStatus) {
	    StudentStatusDetail studentstatusObj = entityManager.find(StudentStatusDetail.class, 123456);
	    studentstatusObj.setAadhar(aadhar);
	    studentstatusObj.setInstituteApprovalStatus(instituteApprovalStatus);
	    studentstatusObj.setMinistryApprovalStatus(ministryApprovalStatus);
	    studentstatusObj.setSanctionedAmount(sanctionedAmount);
	    studentstatusObj.setStateNodalOfficerStatus(stateNodalOfficerStatus);
	    
		entityManager.merge(studentstatusObj);
	}
@Transactional
	public void deleteStudentStatusDetail(String aadhar) {
	StudentStatusDetail studentStatusDetail=entityManager.find(StudentStatusDetail.class, aadhar);
		//StudentStatusDetailDAOImpl status = entityManager.find(StudentStatusDetailDAOImpl.class, aadhar);
	    System.out.println(entityManager);
		entityManager.remove(studentStatusDetail);
        }
//@Transactional
//public void deleteMinister(int ministerId) {
	//Minister minister =entityManager.find(Minister.class, ministerId);
	// TODO Auto-generated method stub
	//System.out.println(entityManager);
	//entityManager.remove(minister);;
//}
@Transactional
	public StudentStatusDetail getStudentStatusDetail(String aadhar) {
	StudentStatusDetail student= entityManager.find(StudentStatusDetail.class, aadhar);
		return student;
	}


@Transactional
public List<StudentStatusDetail> getallStudentStatusDetail() {
 //TODO Auto-generated method stub
Query query =entityManager.createQuery("from StudentStatusDetail");
List<StudentStatusDetail> studentStatusDetail=query.getResultList();
return studentStatusDetail;
}





}
