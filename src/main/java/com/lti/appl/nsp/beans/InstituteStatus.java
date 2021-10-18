package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the INSTITUTE_STATUS database table.
 * 
 */
@Entity
@Table(name="INSTITUTE_STATUS")
@NamedQuery(name="InstituteStatus.findAll", query="SELECT i FROM InstituteStatus i")
public class InstituteStatus implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INSTITUTE_CODE")
	private String instituteCode;

	@Column(name="MINSITRY_APPROVAL_STATUS")
	private String minsitryApprovalStatus;

	@Column(name="STATE_NODAL_OFFICER_STATUS")
	private String stateNodalOfficerStatus;

	//bi-directional one-to-one association to InstituteDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="INSTITUTE_CODE")
	private InstituteDetail instituteDetail;

	public InstituteStatus() {
	}

	public String getInstituteCode() {
		return this.instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getMinsitryApprovalStatus() {
		return this.minsitryApprovalStatus;
	}

	public void setMinsitryApprovalStatus(String minsitryApprovalStatus) {
		this.minsitryApprovalStatus = minsitryApprovalStatus;
	}

	public String getStateNodalOfficerStatus() {
		return this.stateNodalOfficerStatus;
	}

	public void setStateNodalOfficerStatus(String stateNodalOfficerStatus) {
		this.stateNodalOfficerStatus = stateNodalOfficerStatus;
	}

	public InstituteDetail getInstituteDetail() {
		return this.instituteDetail;
	}

	public void setInstituteDetail(InstituteDetail instituteDetail) {
		this.instituteDetail = instituteDetail;
	}

}