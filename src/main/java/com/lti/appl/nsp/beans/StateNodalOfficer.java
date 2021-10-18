package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STATE_NODAL_OFFICER database table.
 * 
 */
@Entity
@Table(name="STATE_NODAL_OFFICER")
@NamedQuery(name="StateNodalOfficer.findAll", query="SELECT s FROM StateNodalOfficer s")
public class StateNodalOfficer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="STATE_NODAL_OFFICER_ID")
	private int stateNodalOfficerId;

	@Column(name="STATE")
	private String state;

	@Column(name="STATE_NODAL_OFFICER_NAME")
	private String stateNodalOfficerName;

	@Column(name="STATE_NODAL_OFFICER_PASSWORD")
	private String stateNodalOfficerPassword;

	public StateNodalOfficer() {
	}

	public int getStateNodalOfficerId() {
		return this.stateNodalOfficerId;
	}

	public void setStateNodalOfficerId(int stateNodalOfficerId) {
		this.stateNodalOfficerId = stateNodalOfficerId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStateNodalOfficerName() {
		return this.stateNodalOfficerName;
	}

	public void setStateNodalOfficerName(String stateNodalOfficerName) {
		this.stateNodalOfficerName = stateNodalOfficerName;
	}

	public String getStateNodalOfficerPassword() {
		return this.stateNodalOfficerPassword;
	}

	public void setStateNodalOfficerPassword(String stateNodalOfficerPassword) {
		this.stateNodalOfficerPassword = stateNodalOfficerPassword;
	}

}