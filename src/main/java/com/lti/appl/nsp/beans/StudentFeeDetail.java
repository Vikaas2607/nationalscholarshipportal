package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUDENT_FEE_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_FEE_DETAILS")
@NamedQuery(name="StudentFeeDetail.findAll", query="SELECT s FROM StudentFeeDetail s")
public class StudentFeeDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;

	@Column(name="ADMISSION_FEE")
	private int admissionFee;

	@Column(name="OTHER_FEE")
	private int otherFee;

	@Column(name="TUITION_FEE")
	private int tuitionFee;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentFeeDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public int getAdmissionFee() {
		return this.admissionFee;
	}

	public void setAdmissionFee(int admissionFee) {
		this.admissionFee = admissionFee;
	}

	public int getOtherFee() {
		return this.otherFee;
	}

	public void setOtherFee(int otherFee) {
		this.otherFee = otherFee;
	}

	public int getTuitionFee() {
		return this.tuitionFee;
	}

	public void setTuitionFee(int tuitionFee) {
		this.tuitionFee = tuitionFee;
	}

	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public StudentFeeDetail(int admissionFee, int otherFee, int tuitionFee) {
		super();
		this.admissionFee = admissionFee;
		this.otherFee = otherFee;
		this.tuitionFee = tuitionFee;
	}

}