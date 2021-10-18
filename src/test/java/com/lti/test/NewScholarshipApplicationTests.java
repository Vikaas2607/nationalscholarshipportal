package com.lti.test;

import java.time.LocalDate;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.InstituteDetail;
import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.dao.AddressDAO;
import com.lti.appl.nsp.dao.InstituteDetailDAO;
import com.lti.appl.nsp.dao.StudentAcademicDetailDAO;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
@SpringBootTest
class NewScholarshipApplicationTests {
	@Autowired
	AddressDAO addObj;
	@Autowired
	InstituteDetailDAO instituteObj;
	@Autowired
	StudentBasicDetailDAO addObjS;
	@Autowired StudentAcademicDetailDAO sadObj;
	@Test
	void contextLoads() {
	}
	
	@Test
	
	void getAllStudentAcademicDetail()
	 {
						
				
	List<StudentAcademicDetail> studentAcademicDetail = sadObj.getAllAcademicDetail();
				
	for (StudentAcademicDetail studentAcademicDetail2 : studentAcademicDetail) 
	{
					
	System.out.println(studentAcademicDetail2.getAadhar());
		
			}
			}

	
	@Test
	void getAddress() {					
		
			List<Address> address= addObj.getAddressByAadhar("222");
			
			//System.out.println(address.getCity());
		for (Address address2 : address) {
			//address2.setCity("Guntur");
			System.out.println(address2.getCity());
		}
		
	}
	@Test
	void getAllAddress() {					
		
			List<Address> address= addObj.getAllAddress();
			//System.out.println(address.getCity());
			for (Address address2 : address) {
				//address2.setCity("Guntur");
				System.out.println(address2.getCity());
		//}
		
	}}
	@Test
	void addAdress() {
		Address newadd = new Address();
		newadd.setAddressId(2009);
		newadd.setCity("dubai");
		newadd.setDist("GUN");
		newadd.setPincode(4562);
		newadd.setState("Kerala");
		newadd.setHouseNumber("2-3");
		newadd.setLine1("1 st");
		newadd.setLine2("6");
		newadd.setPincode(6253);
	//	InstituteDetail ins = instituteObj.
//newadd.setInstituteDetail(ins);

		
		
		addObj.addAddress(newadd);
	}
	@Test
	void addStudentBasicDetail() {

	StudentBasicDetail student = new StudentBasicDetail();

	student.setAadhar("123468");
	
	//student.setDateOfBirth(new SimpleDateFormat("dd-mmm-yyyy").parse("24-oct-1998"));
	student.setDateOfBirth(LocalDate.of(1998, 5, 5));
	
	//InstituteDetail ins = instituteObj.getInstituteDetail("ki9");
    //student.setInstituteDetail(ins);

	addObjS.addStudentBasicDetail(student);
	}

	
	@Test
	void addInstituteDetail() {
		InstituteDetail newInstitute = new InstituteDetail();
		newInstitute.setInstituteCode("ki10");	
		newInstitute.setMobileNumber("70333");
		newInstitute.setPassword("94ygui");
		instituteObj.addInstitute(newInstitute);
	
}}
