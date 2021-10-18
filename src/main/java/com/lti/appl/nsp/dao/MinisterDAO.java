package com.lti.appl.nsp.dao;

import java.util.List;

import com.lti.appl.nsp.beans.Minister;

public interface MinisterDAO {
	
	public void addMinister(Minister ministerObj);                 
	public void deleteMinister(int ministerId);
	public void updateMinister(int ministerId, String ministerName,String ministerPassword);
	public Minister getLogin(int ministerId);
	public List<Minister> getAllMinister();


}
