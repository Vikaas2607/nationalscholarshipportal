package com.lti.appl.nsp.service;


import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.*;
import com.lti.appl.nsp.dao.AddressDAO;
import com.lti.appl.nsp.dao.InstituteDetailDAO;
import com.lti.appl.nsp.dao.StudentApplySchemeDAO;
import com.lti.appl.nsp.dao.StudentBasicDetailDAO;
import com.lti.appl.nsp.dao.StudentRegistrationDAO;
import com.lti.appl.nsp.dto.ScholarshipApplicationDTO;
@Service
public class StudentApplicationServiceImpl implements StudentApplicationService {

	@Autowired	private StudentBasicDetailDAO  studentBasicDetailDAO;
	@Autowired
	StudentBasicDetailDAO addStudentBasicDetailObj;
	@Autowired
	AddressDAO addObj;
	@Autowired
	InstituteDetailDAO insObj;
	
	@Autowired	private StudentApplySchemeDAO studentApplySchemeDAO;
	@Override
	public String addScholarshipApplication(ScholarshipApplicationDTO scholarshipApplicationDto) {
		//Address address 						= new Address();
		//StudentAcademicDetail studentAcademicDetail 			= new StudentAcademicDetail();
		//StudentDisabilityDetail studentDisabilityDetail			= new StudentDisabilityDetail();
		//StudentDocumentDetail studentDocumentDetail			= new StudentDocumentDetail();
		//StudentPersonalDetail studentPersonalDetail			= new StudentPersonalDetail();
		//StudentFeeDetail studentFeeDetail				= new StudentFeeDetail();
		//StudentBasicDetail studentBasicDetail			= new StudentBasicDetail();
		try {	
		StudentBasicDetail studentBasicDetails	 = studentBasicDetailDAO.getStudentBasicDetail(scholarshipApplicationDto.getAadhar());
				if (studentBasicDetails==null) {
					throw new Exception("Invalid Aadhar");
				}else {
					//studentAcademicDetail.setStudentBasicDetail(studentBasicDetails);
					//studentAcademicDetail.setBoardName(scholarshipApplicationDto.getBoardName());
					//studentAcademicDetail.setModeOfStudy(scholarshipApplicationDto.getModeOfStudy());
					System.out.println(" "+scholarshipApplicationDto.getAadhar()+scholarshipApplicationDto.getFamilyIncome()+scholarshipApplicationDto.getAge());
					StudentAcademicDetail studentAcademicDetail	= new StudentAcademicDetail(scholarshipApplicationDto.getBoardName(), scholarshipApplicationDto.getPassingYear(),scholarshipApplicationDto.getPercentage() , 
							scholarshipApplicationDto.getRollNo(),scholarshipApplicationDto.getStandard(), scholarshipApplicationDto.getPresentYear(), scholarshipApplicationDto.getModeOfStudy(), scholarshipApplicationDto.getPresentCourse(), 
							scholarshipApplicationDto.getPrevousYear(), scholarshipApplicationDto.getPreviousCourse(),scholarshipApplicationDto.getPreviousCoursePercent());
					studentAcademicDetail.setStudentBasicDetail(studentBasicDetails);
					studentAcademicDetail.setAadhar(studentBasicDetails.getAadhar());
					
					Address address 						= new Address(scholarshipApplicationDto.getBlockOrTaluka(), scholarshipApplicationDto.getCity(), scholarshipApplicationDto.getDist(),scholarshipApplicationDto.getHouseNumber(), scholarshipApplicationDto.getLine1(), scholarshipApplicationDto.getLine2(), scholarshipApplicationDto.getPincode(),scholarshipApplicationDto.getState(),scholarshipApplicationDto.getStreetNumber());
					address.setStudentBasicDetail(studentBasicDetails);
					
					
			StudentDisabilityDetail studentDisabilityDetail			= new StudentDisabilityDetail(scholarshipApplicationDto.getPercentageOfDisability(), scholarshipApplicationDto.getTypeOfDisability());
			
			studentDisabilityDetail.setStudentBasicDetail(studentBasicDetails);
			studentDisabilityDetail.setAadhar(studentBasicDetails.getAadhar());
			StudentPersonalDetail studentPersonalDetail			= new StudentPersonalDetail(scholarshipApplicationDto.getCategory(), scholarshipApplicationDto.getChooseScheme(), scholarshipApplicationDto.getCommunity(), scholarshipApplicationDto.getFamilyIncome(), scholarshipApplicationDto.getFathersProfession(), scholarshipApplicationDto.getIsDisabled(), scholarshipApplicationDto.getMaritalStatus(), scholarshipApplicationDto.getMothersProfession(), scholarshipApplicationDto.getReligion())	;	
			studentPersonalDetail.setStudentBasicDetail(studentBasicDetails);
			studentPersonalDetail.setAadhar(studentBasicDetails.getAadhar());
			StudentFeeDetail studentFeeDetail				= new StudentFeeDetail(scholarshipApplicationDto.getAdmissionFee(), scholarshipApplicationDto.getOtherFee(), scholarshipApplicationDto.getTuitionFee())	;			
			studentFeeDetail.setStudentBasicDetail(studentBasicDetails);
			studentFeeDetail.setAadhar(studentBasicDetails.getAadhar());
		StudentDocumentDetail studentDocumentDetail			= new StudentDocumentDetail(scholarshipApplicationDto.getAadhar(), scholarshipApplicationDto.getBankPassbookFrontPage(), scholarshipApplicationDto.getCasteOrIncomeCertificate(), scholarshipApplicationDto.getDomicileCertificate(), scholarshipApplicationDto.getFeeRecieptOfCurrentYear(), scholarshipApplicationDto.getInstituteIdCard(), scholarshipApplicationDto.getNinthMarksheet(), scholarshipApplicationDto.getPreviousYearMarksheet(), scholarshipApplicationDto.getStudentPhotograph(), scholarshipApplicationDto.getTenthMarksheet(), scholarshipApplicationDto.getTwelfthMarksheet());
		studentDocumentDetail.setStudentBasicDetail(studentBasicDetails);	
		studentDocumentDetail.setAadhar(studentBasicDetails.getAadhar());
		
		
		studentApplySchemeDAO.insertIntoStudentApplicationFormViaAadhar(address, studentAcademicDetail, studentDisabilityDetail, studentDocumentDetail, studentPersonalDetail, studentFeeDetail);
		
		}return "Application Sucessful";
		} catch (Exception e) {
			return e.getMessage();
		}
	}
	public String testStu(ScholarshipApplicationDTO scholarshipApplicationDto){
		try {
		
		

		StudentBasicDetail sbd= new StudentBasicDetail();
		
		
		StudentDocumentDetail dd= new StudentDocumentDetail();
		dd.setAadhar(scholarshipApplicationDto.getAadhar());
	        dd.setStudentBasicDetail(sbd);
		
		
		//sbd.setAadhar(scholarshipApplicationDto.getAadhar());
		//sbd.setAge(scholarshipApplicationDto.getAge());
		//sbd.setStudentDocumentDetail(dd);
		
		
		
		
		StudentAcademicDetail sad= new StudentAcademicDetail();
		sad.setAadhar(scholarshipApplicationDto.getAadhar());
		sad.setStudentBasicDetail(sbd);
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);
		
		Address ad= new Address();
		ad.setStudentBasicDetail(sbd);
		addObj.addAddress(ad);
		
		StudentDisabilityDetail sdd= new StudentDisabilityDetail();
		sdd.setAadhar(scholarshipApplicationDto.getAadhar());
		sdd.setStudentBasicDetail(sbd);
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);
		
		//do we have for this?
		StudentPersonalDetail ppd= new StudentPersonalDetail();
		ppd.setAadhar(scholarshipApplicationDto.getAadhar());
		ppd.setFamilyIncome(scholarshipApplicationDto.getFamilyIncome());
		ppd.setStudentBasicDetail(sbd);
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);
	
		
		StudentFeeDetail sf= new StudentFeeDetail();
		sf.setAadhar(scholarshipApplicationDto.getAadhar());
		sf.setStudentBasicDetail(sbd);
		addStudentBasicDetailObj.addStudentBasicDetail(sbd);
		
		
		return "Done";
		//srd.insertIntoStudentRegistrationFormViaAadhar(ad, sad, sdd, dd, ppd, sf);
		
		
	} catch (Exception e) {
		return e.getMessage();
	}}
	
	@Override
	public String registerStudent(ScholarshipApplicationDTO scholarshipApplicationDto){//transient==empty
		try {
			StudentBasicDetail sbd	 = studentBasicDetailDAO.getStudentBasicDetail(scholarshipApplicationDto.getAadhar());//empty row
			if (sbd==null) {
				throw new Exception("Invalid Aadhar");
			}else {
			//sbd.setAadhar(scholarshipApplicationDto.getAadhar());
			//sbd.setAge(scholarshipApplicationDto.getAge());
			//sbd.setPassword(scholarshipApplicationDto.getPassword());
			
			
			//InstituteDetail ins = instituteObj.getInstituteDetail("ki9");
			//student.setInstituteDetail(ins);
			//sbd.setAadhar(scholarshipApplicationDto.getAadhar());
		//	sbd.setAge(20);
			
			
			
			StudentPersonalDetail ppd= new StudentPersonalDetail();
			
			ppd.setAadhar(scholarshipApplicationDto.getAadhar());
			ppd.setIsDisabled(scholarshipApplicationDto.getIsDisabled());
			ppd.setMaritalStatus(scholarshipApplicationDto.getMaritalStatus());
			ppd.setFathersProfession(scholarshipApplicationDto.getFathersProfession());
			ppd.setMothersProfession(scholarshipApplicationDto.getMothersProfession());
			ppd.setChooseScheme(scholarshipApplicationDto.getChooseScheme());
			ppd.setReligion(scholarshipApplicationDto.getReligion());
			ppd.setCommunity(scholarshipApplicationDto.getCommunity());
			ppd.setCategory(scholarshipApplicationDto.getCategory());
			ppd.setFamilyIncome(scholarshipApplicationDto.getFamilyIncome());

			ppd.setStudentBasicDetail(sbd);
			sbd.setStudentPersonalDetail(ppd);
		//	personalObj.addStudentPersonalDetail(ppd);
			System.out.println("Personal Done");
			
			StudentAcademicDetail sad= new StudentAcademicDetail();
			sad.setAadhar(scholarshipApplicationDto.getAadhar());
			sad.setStandard(scholarshipApplicationDto.getStandard());
			sad.setRollNo(scholarshipApplicationDto.getRollNo());
			sad.setBoardName(scholarshipApplicationDto.getBoardName());
			sad.setPercentage(scholarshipApplicationDto.getPercentage());
			sad.setPassingYear(scholarshipApplicationDto.getPassingYear());
			sad.setPresentCourse(scholarshipApplicationDto.getPresentCourse());
			sad.setPresentYear(scholarshipApplicationDto.getPresentYear());
			sad.setModeOfStudy(scholarshipApplicationDto.getModeOfStudy());
			sad.setPreviousCourse(scholarshipApplicationDto.getPreviousCourse());
			sad.setPrevousYear(scholarshipApplicationDto.getPrevousYear());
			sad.setPreviousCoursePercent(scholarshipApplicationDto.getPreviousCoursePercent());
			sad.setStudentBasicDetail(sbd);
			sbd.setStudentAcademicDetail(sad);
			//	academicObj.addStudentAcademicDetail(sad);
				
			System.out.println("Academic Done");
			
			StudentDisabilityDetail sdd= new StudentDisabilityDetail();
			sdd.setAadhar(scholarshipApplicationDto.getAadhar());
			sdd.setTypeOfDisability(scholarshipApplicationDto.getTypeOfDisability());
			sdd.setPercentageOfDisability(scholarshipApplicationDto.getPercentageOfDisability());
			
			sdd.setStudentBasicDetail(sbd);
			sbd.setStudentDisabilityDetail(sdd);
		//	disabilityObj.addStudentDisabilityDetail(sdd);
			System.out.println("Disability Done");
			
			//do we have for this?
			
			
			StudentFeeDetail sf= new StudentFeeDetail();
			sf.setAadhar(scholarshipApplicationDto.getAadhar());
			sf.setAdmissionFee(scholarshipApplicationDto.getAdmissionFee());
			sf.setTuitionFee(scholarshipApplicationDto.getTuitionFee());
			sf.setOtherFee(scholarshipApplicationDto.getOtherFee());
			
			sf.setStudentBasicDetail(sbd);
			sbd.setStudentFeeDetail(sf);
		//	feeObj.addStudentFeeDetail(sf);
			System.out.println("Fee Done");
			
			StudentDocumentDetail dd= new StudentDocumentDetail();
			dd.setAadhar(scholarshipApplicationDto.getAadhar());
			dd.setDomicileCertificate(scholarshipApplicationDto.getDomicileCertificate());
			dd.setStudentPhotograph(scholarshipApplicationDto.getStudentPhotograph());
			dd.setInstituteIdCard(scholarshipApplicationDto.getInstituteIdCard());
			dd.setCasteOrIncomeCertificate(scholarshipApplicationDto.getCasteOrIncomeCertificate());
			dd.setPreviousYearMarksheet(scholarshipApplicationDto.getPreviousYearMarksheet());
			dd.setFeeRecieptOfCurrentYear(scholarshipApplicationDto.getFeeRecieptOfCurrentYear());
			dd.setBankPassbookFrontPage(scholarshipApplicationDto.getBankPassbookFrontPage());
			dd.setAadhaarCard(scholarshipApplicationDto.getAadhaarCard());
			dd.setTenthMarksheet(scholarshipApplicationDto.getTenthMarksheet());
			dd.setTwelfthMarksheet(scholarshipApplicationDto.getTwelfthMarksheet());
			dd.setNinthMarksheet(scholarshipApplicationDto.getNinthMarksheet());
			dd.setInstituteBonafiedCertificate(scholarshipApplicationDto.getInstituteBonafiedCertificate());
						
			dd.setStudentBasicDetail(sbd);
			sbd.setStudentDocumentDetail(dd);
		//	documentObj.addStudentDocumentDetail(dd);
			System.out.println("Document Done");
			//srd.insertIntoStudentRegistrationFormViaAadhar(ad, sad, sdd, dd, ppd, sf);

			
			Set<Address> ads= new HashSet<Address>();
			Address ad = new Address();
			ad.setBlockOrTaluka(scholarshipApplicationDto.getBlockOrTaluka());
			ad.setHouseNumber(scholarshipApplicationDto.getHouseNumber());
			ad.setStreetNumber(scholarshipApplicationDto.getStreetNumber());
			ad.setLine1(scholarshipApplicationDto.getLine1());
			ad.setLine2(scholarshipApplicationDto.getLine2());
			ad.setCity(scholarshipApplicationDto.getCity());
			System.out.println("District is "+ scholarshipApplicationDto.getDist());
			ad.setDist(scholarshipApplicationDto.getDist());
			ad.setState(scholarshipApplicationDto.getState());
			ad.setPincode(scholarshipApplicationDto.getPincode());
			ads.add(ad);
			ad.setStudentBasicDetail(sbd);
			
		//	addObj.addAddress(ad);
			sbd.setAddresses(ads);
			System.out.println("adress Done");
			
			
			
			addStudentBasicDetailObj.addStudentBasicDetail(sbd);
			return "Done";
			//srd.insertIntoStudentRegistrationFormViaAadhar(ad, sad, sdd, dd, ppd, sf);
			
			
		}} catch (Exception e) {
			return "user does not exist";
	}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
