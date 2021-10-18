package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUDENT_DISABILITY_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_DISABILITY_DETAILS")
@NamedQuery(name="StudentDisabilityDetail.findAll", query="SELECT s FROM StudentDisabilityDetail s")
public class StudentDisabilityDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;

	@Column(name="PERCENTAGE_OF_DISABILITY")
	private int percentageOfDisability;

	@Column(name="TYPE_OF_DISABILITY")
	private String typeOfDisability;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentDisabilityDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public int getPercentageOfDisability() {
		return this.percentageOfDisability;
	}

	public void setPercentageOfDisability(int percentageOfDisability) {
		this.percentageOfDisability = percentageOfDisability;
	}

	public String getTypeOfDisability() {
		return this.typeOfDisability;
	}

	public void setTypeOfDisability(String typeOfDisability) {
		this.typeOfDisability = typeOfDisability;
	}

	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public StudentDisabilityDetail(int percentageOfDisability, String typeOfDisability) {
		super();
		this.percentageOfDisability = percentageOfDisability;
		this.typeOfDisability = typeOfDisability;
	}

}