package com.lti.test;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.InstituteDetail;
import com.lti.appl.nsp.beans.InstituteStatus;
import com.lti.appl.nsp.beans.Minister;
import com.lti.appl.nsp.beans.StateNodalOfficer;
import com.lti.appl.nsp.beans.StudentAcademicDetail;
import com.lti.appl.nsp.beans.StudentBankDetail;
import com.lti.appl.nsp.beans.StudentBasicDetail;
import com.lti.appl.nsp.beans.StudentDisabilityDetail;
import com.lti.appl.nsp.beans.StudentDocumentDetail;
import com.lti.appl.nsp.beans.StudentFeeDetail;
import com.lti.appl.nsp.beans.StudentPersonalDetail;
import com.lti.appl.nsp.beans.StudentStatusDetail;
import com.lti.appl.nsp.dao.AddressDAO;
import com.lti.appl.nsp.dao.InstituteDetailDAO;
import com.lti.appl.nsp.dao.InstituteStatusDAO;
import com.lti.appl.nsp.dao.MinisterDAO;
import com.lti.appl.nsp.dao.StateNodalOfficerDAO;
import com.lti.appl.nsp.dao.StudentAcademicDetailDAO;
import com.lti.appl.nsp.dao.StudentBankDetailDAO;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
import com.lti.appl.nsp.dao.StudentDisabilityDetailDAO;
import com.lti.appl.nsp.dao.StudentDocumentDetailDAO;
import com.lti.appl.nsp.dao.StudentFeeDetailDAO;
import com.lti.appl.nsp.dao.StudentPersonalDetailDAO;
import com.lti.appl.nsp.dao.StudentRegistrationDAO;
import com.lti.appl.nsp.dao.StudentStatusDetailDAO;
import com.lti.appl.nsp.dto.ScholarshipApplicationDTO;

@SpringBootTest
class NewScholarshipApplicationTests2 {
	@Autowired
	AddressDAO addObj;
	@Autowired
	InstituteDetailDAO instituteObj;
	@Autowired
	StudentBasicDetailDAO addStudentBasicDetailObj;
	@Autowired
	StudentBasicDetailDAO basicObj;
	@Autowired
	StudentFeeDetailDAO feeObj;
	@Autowired
	StudentPersonalDetailDAO personalObj;
	@Autowired
	StudentDocumentDetailDAO documentObj;
	
	@Autowired
	StudentBankDetailDAO bankObj;
	@Autowired
	StudentAcademicDetailDAO academicObj;
	@Autowired
	StudentDisabilityDetailDAO disabilityObj;
	@Autowired
	MinisterDAO ministerObj;
	@Autowired
	StateNodalOfficerDAO stateObj;
	@Autowired
	StudentStatusDetailDAO studentStatusObj;
	@Autowired
	InstituteStatusDAO instituteStatusObj;
	@Autowired
	StudentDocumentDetailDAO studentdocumentObj;
	
	@Autowired
	StudentRegistrationDAO srd;
	
	@Test
	void contextLoads() {
	}
	
	
	
	@Test
	void getAddress() {					
		
			List<Address> address= addObj.getAddressByAadhar("657209918025");
			//System.out.println(address.getCity());
		for (Address address2 : address) {
			address2.setCity("Guntur");
			
			System.out.println(address2.getCity());
		}
		
	}
	@Test
	void getAll() {					
		
			List<Address> address= addObj.getAllAddress();
			//System.out.println(address.getCity());
			for (Address address2 : address) {
				address2.setCity("Guntur");
				System.out.println(address2.getCity());
		//}
		
	}}
	@Test
	void addAdress() {
		Address newadd = new Address();
		//newadd.setAddressId(2030);
		newadd.setCity("Palakkad");
		newadd.setDist("Palakkad");
		newadd.setPincode(678012);
		newadd.setState("Kerala");
		newadd.setHouseNumber("48/163");
		newadd.setLine1("2nd street");
		newadd.setLine2("near temple");
		
	//InstituteDetail ins = instituteObj.getInstituteDetail("A9");
	
		//	newadd.setInstituteDetail(ins);
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			newadd.setStudentBasicDetail(sbd);
		
		addObj.addAddress(newadd);
	}
	
	@Test
	void testStu(){
		ScholarshipApplicationDTO scholarshipApplicationDto=  new ScholarshipApplicationDTO();
		scholarshipApplicationDto.setAadhar("9900");
		scholarshipApplicationDto.setAge(20);
		scholarshipApplicationDto.setFamilyIncome(12000);

		StudentBasicDetail sbd= new StudentBasicDetail();
		sbd.setAadhar(scholarshipApplicationDto.getAadhar());
	//	sbd.setAge(20);
		
		
		Set<Address> ads= new HashSet<Address>();
		Address ad = new Address();
		
		ad.setStudentBasicDetail(sbd);
		ads.add(ad);
	//	addObj.addAddress(ad);
		sbd.setAddresses(ads);
		System.out.println("adress Done");
		
		StudentPersonalDetail ppd= new StudentPersonalDetail();
		
		ppd.setAadhar(scholarshipApplicationDto.getAadhar());
		ppd.setFamilyIncome(12000);
		ppd.setStudentBasicDetail(sbd);
		sbd.setStudentPersonalDetail(ppd);
	//	personalObj.addStudentPersonalDetail(ppd);
		System.out.println("Personal Done");
		
		StudentAcademicDetail sad= new StudentAcademicDetail();
			sad.setAadhar(scholarshipApplicationDto.getAadhar());
			sad.setStudentBasicDetail(sbd);
			sbd.setStudentAcademicDetail(sad);
		//	academicObj.addStudentAcademicDetail(sad);
			System.out.println("Academic Done");
		
		
		
		StudentDisabilityDetail sdd= new StudentDisabilityDetail();
		sdd.setAadhar(scholarshipApplicationDto.getAadhar());
		sdd.setStudentBasicDetail(sbd);
		sbd.setStudentDisabilityDetail(sdd);
	//	disabilityObj.addStudentDisabilityDetail(sdd);
		System.out.println("Disability Done");
		
		//do we have for this?
		
		
		StudentFeeDetail sf= new StudentFeeDetail();
		sf.setAadhar(scholarshipApplicationDto.getAadhar());
		sf.setStudentBasicDetail(sbd);
		sbd.setStudentFeeDetail(sf);
	//	feeObj.addStudentFeeDetail(sf);
		System.out.println("Fee Done");
		

		
		
		StudentDocumentDetail dd= new StudentDocumentDetail();
		dd.setAadhar(scholarshipApplicationDto.getAadhar());
		dd.setStudentBasicDetail(sbd);
		sbd.setStudentDocumentDetail(dd);
	//	documentObj.addStudentDocumentDetail(dd);
		System.out.println("Document Done");
		//srd.insertIntoStudentRegistrationFormViaAadhar(ad, sad, sdd, dd, ppd, sf);
		
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);
	}
	
	@Test
	void addStudentBasicDetail() {

	StudentBasicDetail student = new StudentBasicDetail();

	student.setAadhar("657209918025");
	student.setDateOfBirth(LocalDate.of(1996, 12, 19));
	InstituteDetail ins = instituteObj.getInstituteDetail("A9");
	student.setInstituteDetail(ins);
	System.out.println("sssss"+student);
	addStudentBasicDetailObj.addStudentBasicDetail(student);
	}

	@Test
	void getAllStudentBasicDetail() {
				
		List<StudentBasicDetail> studentBasicDetail = basicObj.getAll();
		for (StudentBasicDetail studentBasicDetail2 : studentBasicDetail) {
			System.out.println(studentBasicDetail2.getInstituteDetail());
		}
	}
	
	
	@Test
	void getStudentBasicDetail() {					
	
		StudentBasicDetail studentBasicDetail= addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			System.out.println(studentBasicDetail.getAadhar());
			
			
	}  
	

	
	@Test
	void addInstitute() {
		InstituteDetail newInstitute = new InstituteDetail();
		newInstitute.setInstituteCode("A9");
		newInstitute.setAdmissionStartedYear(2010);
		newInstitute.setAffilUniversityBoardName("JNTUK");
		newInstitute.setAffilUniversityState("Andhra");
		newInstitute.setDiseCode("ADI");
		newInstitute.setInstituteCategory("Research");
		newInstitute.setInstituteName("Aditya");
		newInstitute.setInstituteType("Enginering");
		newInstitute.setLocation("Urban");
		newInstitute.setMobileNumber("9603225544");
		newInstitute.setTelephone("225566");
		newInstitute.setPrincipalName("Akesh Mohan");
		
		instituteObj.addInstitute(newInstitute);
	
}
	
	@Test
	void getAllInstituteDetail() {
				
		List<InstituteDetail> instituteDetail = instituteObj.getAllInstituteDetail();
		for (InstituteDetail instituteDetail2 : instituteDetail) {
			System.out.println(instituteDetail2.getInstituteCode());
		}
	
	}

	@Test
	void getInstituteDetail() {					
	
			InstituteDetail instituteDetail= instituteObj.getInstituteDetail("A9");
			System.out.println(instituteDetail.getInstituteCode());
		
		
	}  

	
	@Test
	void getAllStudentBankDetail() {
				
		List<StudentBankDetail> studentBankDetail = bankObj.getAllBankDetail();
		for (StudentBankDetail studentBankDetail2 : studentBankDetail) {
			System.out.println(studentBankDetail2.getAccountNo());
		}
	}
		
		@Test
		void insertBankDetail() {
			StudentBankDetail newBankDetail = new StudentBankDetail();
			newBankDetail.setAccountNo("31008589");
			newBankDetail.setBankName("ICICI");
			newBankDetail.setBankIfsc("ICIC123");
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			newBankDetail.setStudentBasicDetail(sbd);
			bankObj.addStudentBankDetail(newBankDetail);
		
	}
		
		
		
		
	//list refer address...check dao and daoimpl
		@Test
		void getBankDetail() {					
			
				StudentBankDetail studentBankDetail= bankObj.getBank("31008589");
				System.out.println(studentBankDetail.getBankIfsc());
			
		}  
		
		
		
		
		
		
		
		
		
		@Test
		void getAllStudentAcademicDetail() {
					
			List<StudentAcademicDetail> studentAcademicDetail = academicObj.getAllAcademicDetail();
			for (StudentAcademicDetail studentAcademicDetail2 : studentAcademicDetail) {
				System.out.println(studentAcademicDetail2.getAadhar());
			}
		}
			
			@Test
			void insertAcademicDetail() {
				StudentAcademicDetail newAcademicDetail = new StudentAcademicDetail();
				//newAcademicDetail.setAadhar("123471");
				newAcademicDetail.setBoardName("CBSE");
				newAcademicDetail.setPassingYear(2020);
				newAcademicDetail.setPercentage(85.56f);
				newAcademicDetail.setRollNo("123");
				newAcademicDetail.setStandard(20);
				
				StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
				sbd.setStudentAcademicDetail(newAcademicDetail);
				newAcademicDetail.setStudentBasicDetail(sbd);
				//newAcademicDetail.setStudentBasicDetail(sbd);
				//academicObj.addStudentAcademicDetail(newAcademicDetail);
				addStudentBasicDetailObj.addStudentBasicDetail(sbd);
				
			
		}
			//null	pointer
			@Test 
			void getAcademicDetail() {					
			
					StudentAcademicDetail studentAcademicDetail= academicObj.getAcademicDetail("657209918025");
					System.out.println(studentAcademicDetail.getBoardName());
				
				
			}  
			
			
			
			
			
			
			@Test
			void getAllStudentDisabilityDetail() {
						
				List<StudentDisabilityDetail> studentDisabilityDetail = disabilityObj.getAllDisabilityDetail();
				for (StudentDisabilityDetail studentDisabilityDetail2 : studentDisabilityDetail) {
					System.out.println(studentDisabilityDetail2.getAadhar());
				}
			}
				
				@Test
				void insertDisabilityDetail() {
					StudentDisabilityDetail newDisabilityDetail = new StudentDisabilityDetail();
					//newDisabilityDetail.setAadhar("123465");
					newDisabilityDetail.setPercentageOfDisability(20);
					newDisabilityDetail.setTypeOfDisability("Blind");
					
					StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
					sbd.setStudentDisabilityDetail(newDisabilityDetail);
					newDisabilityDetail.setStudentBasicDetail(sbd);
					
					addStudentBasicDetailObj.addStudentBasicDetail(sbd);
			
				
		
			}
				//null	pointer
				@Test
				void getDisabilityDetail() {					
				
						StudentDisabilityDetail studentDisabilityDetail= disabilityObj.getDisabilityDetail("657209918025");
						System.out.println(studentDisabilityDetail.getTypeOfDisability());
					
					
				}  


@Test
void getAllStudentFeeDetail() {
			
	List<StudentFeeDetail> studentFeeDetail = feeObj.getAllFeeDetail();
	for (StudentFeeDetail studentFeeDetail2 : studentFeeDetail) {
		System.out.println(studentFeeDetail2.getAadhar());
	}
}
	
	@Test
	void insertFeeDetail() {
		StudentFeeDetail newFeeDetail = new StudentFeeDetail();
		//newDisabilityDetail.setAadhar("123465");
		newFeeDetail.setAdmissionFee(20000);
		newFeeDetail.setOtherFee(2200);
		newFeeDetail.setTuitionFee(25);
		
		StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
		sbd.setStudentFeeDetail(newFeeDetail);
		newFeeDetail.setStudentBasicDetail(sbd);
		
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);


}
	
	@Test
	void getFeeDetail() {					
		
			StudentFeeDetail studentFeeDetail= feeObj.getFeeDetail("657209918025");
			System.out.println(studentFeeDetail.getAdmissionFee());
		
		
	} 
	
	
	
	
	
	
	
	@Test
	void getAllStudentPersonalDetail() {
				
		List<StudentPersonalDetail> studentPersonalDetail = personalObj.getAllPersonalDetail();
		for (StudentPersonalDetail studentPersonalDetail2 : studentPersonalDetail) {
			System.out.println(studentPersonalDetail2.getAadhar());
		}
	}
		
		@Test
		void insertPersonalDetail() {
			StudentPersonalDetail newPersonalDetail = new StudentPersonalDetail();
			//newDisabilityDetail.setAadhar("123465");
			newPersonalDetail.setCategory("Abcd");
			newPersonalDetail.setChooseScheme("NTSE");
			newPersonalDetail.setCommunity("Abcd");
			newPersonalDetail.setFamilyIncome(1000);
			newPersonalDetail.setFathersProfession("Business");			
			newPersonalDetail.setMaritalStatus("Single");
			newPersonalDetail.setMothersProfession("HW");
			newPersonalDetail.setReligion("Hindu");
			newPersonalDetail.setIsDisabled("No");
			
			
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			sbd.setStudentPersonalDetail(newPersonalDetail);
			newPersonalDetail.setStudentBasicDetail(sbd);
			
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);
		
			

		
	}
	//null	pointer
		@Test
		void getPersonalDetail() {					
		
				StudentPersonalDetail studentPersonalDetail= personalObj.getPersonalDetail("657209918025");
				System.out.println(studentPersonalDetail.getChooseScheme());
			
			
		}  
		
		@Test
		void insertStudentDocumentDetail() {//not working
			StudentDocumentDetail newStudentDocumentDetail = new StudentDocumentDetail();
			
			newStudentDocumentDetail.setAadhaarCard("am_aadhar");
			newStudentDocumentDetail.setBankPassbookFrontPage("am_bank");
			newStudentDocumentDetail.setCasteOrIncomeCertificate("am_casteorincome");
			newStudentDocumentDetail.setDomicileCertificate("am_domicile");
			newStudentDocumentDetail.setFeeRecieptOfCurrentYear("am_fee");
			newStudentDocumentDetail.setInstituteBonafiedCertificate("am_bonfied");
			newStudentDocumentDetail.setInstituteIdCard("am_id");
			newStudentDocumentDetail.setNinthMarksheet("am_9");
			newStudentDocumentDetail.setPreviousYearMarksheet("am_previous");
			newStudentDocumentDetail.setStudentPhotograph("am_photo");
			newStudentDocumentDetail.setTenthMarksheet("am_10");
			newStudentDocumentDetail.setTwelfthMarksheet("am_12");
			
			
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			sbd.setStudentDocumentDetail(newStudentDocumentDetail);
			newStudentDocumentDetail.setStudentBasicDetail(sbd);
			
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);
			
			/*StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetailOfAadhar("123456");
			sbd.setStudentFeeDetail(newFeeDetail);
			newFeeDetail.setStudentBasicDetail(sbd);
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);	*/
	}
		
		@Test//STUDENT document
		void getStudentDocumentDetail() {					
			
				StudentDocumentDetail studentDocumentDetail=studentdocumentObj.getStudentDocumentDetail("657209918025");
				System.out.println(studentDocumentDetail.getAadhar());
			
			
		}  
		@Test
		void getAllStudentDocumentDetail() {
					
			List<StudentDocumentDetail> studentDocumentDetail = studentdocumentObj.getallStudentDocumentDetail();
			for (StudentDocumentDetail studentDocumentDetail2 : studentDocumentDetail) {
				System.out.println(studentDocumentDetail2.getAadhar());
			}
		}
		
		@Test
		void updateStudentDocumentDetail() { 
	                                                                     
	            	  studentdocumentObj.updateStudentDocumentDetail("123480","a_addhar","a_bank","a_caste","a_domicile","a_fee","a_bonafied","a_id","a_9","a_previous","a_photo","a_10","a_12");
	            
		}
		@Test
		void deleteStudentDocumentDetail() {                                                          
			studentdocumentObj.deleteStudentDocumentDetail("102923458765");	
		}


		@Test
		void addMinister() {
			Minister newMinister = new Minister();
			newMinister.setMinisterId(100);
			newMinister.setMinisterName("VASUNDHRA RAJE");
			newMinister.setMinisterPassword("vasu_123");
			ministerObj.addMinister(newMinister);
				
	     }
		
		
		@Test//Minister
		void getMinister() {					
			
				Minister minister= ministerObj.getLogin(100);
				System.out.println(minister.getMinisterId());
		
		}  
		
		
		@Test
		void getStateNodalOfficer() {					
			
				StateNodalOfficer stateNodalOfficer= stateObj.getState(20);
				System.out.println(stateNodalOfficer.getStateNodalOfficerId());
			
			
		} 
		@Test
		void getAllStateNodalOfficer() {
					
			List<StateNodalOfficer> stateNodalOfficer = stateObj.getAllStateNodalOfficer();
			for (StateNodalOfficer stateNodalOfficer2 : stateNodalOfficer) {
				System.out.println(stateNodalOfficer2.getStateNodalOfficerId());
			}
		}
		
		@Test
		void updateStateNodalOfficer() { 
	                                                                      
	             stateObj.updateStateNodalOfficer(20, "AMAN MISHRA", "AMAN_123","TN");
	         
		}
		
		@Test
		void deleteStateNodalOfficer() {                                                          
			stateObj.deleteStateNodalOfficer(20);	
		}
		
		
		@Test
		void insertStudentStatusDetail() {
			StudentStatusDetail newStudentStatusDetail = new StudentStatusDetail();
			//newStudentStatusDetail.setAadhar("123465");
			newStudentStatusDetail.setInstituteApprovalStatus("approved");
			newStudentStatusDetail.setMinistryApprovalStatus("approved");
			newStudentStatusDetail.setSanctionedAmount(30000);
			newStudentStatusDetail.setStateNodalOfficerStatus("approved");
			//StudentStatusObj.addStudentStatusDetail(newStudentStatusDetail);
			
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetail("657209918025");
			sbd.setStudentStatusDetail(newStudentStatusDetail);
			newStudentStatusDetail.setStudentBasicDetail(sbd);
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);
			/*StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetailOfAadhar("123456");
			sbd.setStudentFeeDetail(newFeeDetail);
			newFeeDetail.setStudentBasicDetail(sbd);
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);	*/
	}
		
		
		@Test//STUDENT STATUS
		void getStudentStatusDetail() {					
		
				StudentStatusDetail studentStatusDetail=studentStatusObj.getStudentStatusDetail("657209918025");
				System.out.println(studentStatusDetail.getInstituteApprovalStatus());
			
		}  
		@Test
		void getAllStudentStatusDetail() {
					
			List<StudentStatusDetail> studentStatusDetail = studentStatusObj.getallStudentStatusDetail();
			for (StudentStatusDetail studentStatusDetail2 : studentStatusDetail) {
				System.out.println(studentStatusDetail2.getAadhar());
			}
		}
		
		@Test
		void updateStudentStatusDetail() { 
	                                                                     
	             studentStatusObj.updateStudentStatusDetail("123400","approved","rejected",50000,"approved");
	              
		}
		@Test
		void deleteStudentStatusDetail() {                                                          
			studentStatusObj.deleteStudentStatusDetail("123480");	
		}
		
		
		@Test//not working
		void addInstituteStatus() {
			InstituteStatus newInstituteStatus = new InstituteStatus();
			//newInstituteStatus.setInstituteCode("asd54");
			newInstituteStatus.setMinsitryApprovalStatus("approved");
			newInstituteStatus.setStateNodalOfficerStatus("approved");
		
			InstituteDetail id = instituteObj.getInstituteDetail("A9");
			id.setInstituteStatus(newInstituteStatus);
			newInstituteStatus.setInstituteDetail(id);
			instituteObj.addInstitute(id);
			
	/*		StudentStatusDetail newStudentStatusDetail = new StudentStatusDetail();
			//newStudentStatusDetail.setAadhar("123465");
			newStudentStatusDetail.setInstituteApprovalStatus("approved");
			newStudentStatusDetail.setMinistryApprovalStatus("approved");
			newStudentStatusDetail.setSanctionedAmount(30000);
			newStudentStatusDetail.setStateNodalOfficerStatus("approved");
			//StudentStatusObj.addStudentStatusDetail(newStudentStatusDetail);
			
			StudentBasicDetail sbd = addStudentBasicDetailObj.getStudentBasicDetailOfAadhar("123400");
			sbd.setStudentStatusDetail(newStudentStatusDetail);
			newStudentStatusDetail.setStudentBasicDetail(sbd);
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);  */
			
		} 
		
		
		@Test//institute STATUS
		void getInstituteStatus() {					
			
				InstituteStatus instituteStatus=instituteStatusObj.getStatus("A9");
				System.out.println(instituteStatus.getStateNodalOfficerStatus());
			
		}  
		@Test
		void getallInstituteStatus() {
					
			List<InstituteStatus> instituteStatus = instituteStatusObj.getallInstituteStatus();
			for (InstituteStatus instituteStatus2 : instituteStatus) {
				System.out.println(instituteStatus2.getInstituteCode());
			}
		}
		
		@Test
		void updateInstituteStatus() { 
	                                                                   
	              instituteStatusObj.updateInstituteStatus("222","rejected","rejected");
	             
		}
		@Test
		void deleteInstituteStatus() {                                                          
			instituteStatusObj.deleteInstituteStatus("222");	
		}
		
		@Test
		void getAllMinister() {
					
			List<Minister> minister = ministerObj.getAllMinister();
			for (Minister minister2 : minister) {
				System.out.println(minister2.getMinisterId());
			}
		}
		
		@Test
		void updateMinister() { 
	                                                                      
	           ministerObj.updateMinister(100, "NARENDRA MODI", "MODI_123");
	              
		}
		
		@Test
		void deleteMinister() {                                                          
			ministerObj.deleteMinister(100);	
		}
		
		@Test
		void addStateNodalOfficer() {
			StateNodalOfficer newStateNodalOfficer = new StateNodalOfficer();
			newStateNodalOfficer.setStateNodalOfficerId(20);
			newStateNodalOfficer.setStateNodalOfficerName("AKSHAY MISHRA");
			newStateNodalOfficer.setStateNodalOfficerPassword("AKKI_123");
			newStateNodalOfficer.setState("MP");
			stateObj.addStateNodalOfficer(newStateNodalOfficer);
			
			
	     }	  
	}