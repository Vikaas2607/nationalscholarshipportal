package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the MINISTER database table.
 * 
 */
@Entity
@NamedQuery(name="Minister.findAll", query="SELECT m FROM Minister m")
public class Minister implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="MINISTER_ID")
	private int ministerId;

	@Column(name="MINISTER_NAME")
	private String ministerName;

	@Column(name="MINISTER_PASSWORD")
	private String ministerPassword;

	public Minister() {
	}

	public int getMinisterId() {
		return this.ministerId;
	}

	public void setMinisterId(int ministerId) {
		this.ministerId = ministerId;
	}

	public String getMinisterName() {
		return this.ministerName;
	}

	public void setMinisterName(String ministerName) {
		this.ministerName = ministerName;
	}

	public String getMinisterPassword() {
		return this.ministerPassword;
	}

	public void setMinisterPassword(String ministerPassword) {
		this.ministerPassword = ministerPassword;
	}

}