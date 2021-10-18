package com.lti.appl.nsp.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.InstituteDetail;
import com.lti.appl.nsp.dao.InstituteDetailDAO;
import com.lti.appl.nsp.dao.InstituteRegistrationDAO;
import com.lti.appl.nsp.dto.InstituteRegisterDTO;

@Service
public class InstitituteRegisterServiceImpl implements InstituteRegisterService {
	@Autowired
	InstituteRegistrationDAO instituteRegistrationDAO;
	@Autowired
	InstituteDetailDAO instituteDetailDAOObj;
	@Override
	public String  registerInstitute(InstituteRegisterDTO instituteRegisterDTO) {
		
			try {
				InstituteDetail ins = new InstituteDetail();
				ins.setInstituteCode(instituteRegisterDTO.getInstituteCode());
				ins.setInstituteName(instituteRegisterDTO.getInstituteName());
				ins.setInstituteCategory(instituteRegisterDTO.getInstituteCategory());
				ins.setPassword(instituteRegisterDTO.getPassword());
				ins.setInstituteMail(instituteRegisterDTO.getInstituteMail());
				ins.setDiseCode(instituteRegisterDTO.getDiseCode());
				ins.setLocation(instituteRegisterDTO.getLocation());
				ins.setInstituteType(instituteRegisterDTO.getInstituteType());
				ins.setAdmissionStartedYear(instituteRegisterDTO.getAdmissionStartedYear());
				ins.setPrincipalName(instituteRegisterDTO.getPrincipalName());
				ins.setMobileNumber(instituteRegisterDTO.getMobileNumber());
				ins.setTelephone(instituteRegisterDTO.getTelephone());
				ins.setAffilUniversityBoardName(instituteRegisterDTO.getAffilUniversityBoardName());
				ins.setAffilUniversityState(instituteRegisterDTO.getAffilUniversityState());

				System.out.println(instituteRegisterDTO.getAffilUniversityState());
				Set<Address> ads= new HashSet<Address>();
				Address ad = new Address();
				ad.setBlockOrTaluka(instituteRegisterDTO.getBlockOrTaluka());
				ad.setHouseNumber(instituteRegisterDTO.getHouseNumber());
				ad.setStreetNumber(instituteRegisterDTO.getStreetNumber());
				ad.setLine1(instituteRegisterDTO.getLine1());
				ad.setLine2(instituteRegisterDTO.getLine2());
				ad.setCity(instituteRegisterDTO.getCity());
				ad.setDist(instituteRegisterDTO.getDist());
				ad.setState(instituteRegisterDTO.getState());
				ad.setPincode(instituteRegisterDTO.getPincode());
				System.out.println(instituteRegisterDTO.getPincode());
				ads.add(ad);
				ad.setInstituteDetail(ins);
				
				ins.setAddresses(ads);
				System.out.println("adress Done"); 
			/*ads.add(ad);
			ad.setStudentBasicDetail(sbd);
			
		//	addObj.addAddress(ad);
			sbd.setAddresses(ads);
			System.out.println("adress Done"); */
			
			
			
				instituteDetailDAOObj.addInstitute(ins);
				
			
				
				return ("User registred!!");} 
			catch (Exception e) {
				return ("User already registred!!");
		
			}
		}
	}


