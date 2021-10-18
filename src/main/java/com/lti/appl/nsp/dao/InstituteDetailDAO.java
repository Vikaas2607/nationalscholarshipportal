package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.Address;
import com.lti.appl.nsp.beans.InstituteDetail;

public interface InstituteDetailDAO {

	public void addInstitute(InstituteDetail addObj);                                     
	public void deleteAddress(int instituteCode);
	public void updateAddress(InstituteDetail updateObj);
	public InstituteDetail getInstituteDetail(String instituteCode);
	
	public List< InstituteDetail> getAllInstituteDetail ();
	
}
