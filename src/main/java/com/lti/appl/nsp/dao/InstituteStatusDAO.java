package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.InstituteStatus;

public interface InstituteStatusDAO {
	public void addInstituteStatus(InstituteStatus InstituteStatusObj);  
	public void deleteInstituteStatus(String instituteCode);
	public void updateInstituteStatus(String instituteCode,String minsitryApprovalStatus,String stateNodalOfficerStatus);
	public List<InstituteStatus> getallInstituteStatus();
	public InstituteStatus getStatus(String instituteCode);

}
