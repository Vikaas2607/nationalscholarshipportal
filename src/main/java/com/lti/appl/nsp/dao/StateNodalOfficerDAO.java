package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.StateNodalOfficer;

public interface StateNodalOfficerDAO {
	public List<StateNodalOfficer> getAllStateNodalOfficer();
	public void addStateNodalOfficer(StateNodalOfficer stateObj);    
	public void deleteStateNodalOfficer(int stateNodalOfficerId);
	public void updateStateNodalOfficer(int stateNodalOfficerId,String stateNodalOfficerName,String stateNodalOfficerPassword,String state);
	public StateNodalOfficer getState(int stateNodalOfficerId);
	


}
