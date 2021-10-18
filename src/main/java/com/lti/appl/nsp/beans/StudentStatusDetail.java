package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUDENT_STATUS_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_STATUS_DETAILS")
@NamedQuery(name="StudentStatusDetail.findAll", query="SELECT s FROM StudentStatusDetail s")
public class StudentStatusDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;

	@Column(name="INSTITUTE_APPROVAL_STATUS")
	private String instituteApprovalStatus;

	@Column(name="MINISTRY_APPROVAL_STATUS")
	private String ministryApprovalStatus;

	@Column(name="SANCTIONED_AMOUNT")
	private int sanctionedAmount;

	@Column(name="STATE_NODAL_OFFICER_STATUS")
	private String stateNodalOfficerStatus;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentStatusDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getInstituteApprovalStatus() {
		return this.instituteApprovalStatus;
	}

	public void setInstituteApprovalStatus(String instituteApprovalStatus) {
		this.instituteApprovalStatus = instituteApprovalStatus;
	}

	public String getMinistryApprovalStatus() {
		return this.ministryApprovalStatus;
	}

	public void setMinistryApprovalStatus(String ministryApprovalStatus) {
		this.ministryApprovalStatus = ministryApprovalStatus;
	}

	public int getSanctionedAmount() {
		return this.sanctionedAmount;
	}

	public void setSanctionedAmount(int sanctionedAmount) {
		this.sanctionedAmount = sanctionedAmount;
	}

	public String getStateNodalOfficerStatus() {
		return this.stateNodalOfficerStatus;
	}

	public void setStateNodalOfficerStatus(String stateNodalOfficerStatus) {
		this.stateNodalOfficerStatus = stateNodalOfficerStatus;
	}

	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

}