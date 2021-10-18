package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUDENT_PERSONAL_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_PERSONAL_DETAILS")
@NamedQuery(name="StudentPersonalDetail.findAll", query="SELECT s FROM StudentPersonalDetail s")
public class StudentPersonalDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;
	@Column(name="CATEGORY")
	private String category;

	@Column(name="CHOOSE_SCHEME")
	private String chooseScheme;
	@Column(name="COMMUNITY")
	private String community;

	@Column(name="FAMILY_INCOME")
	private int familyIncome;

	@Column(name="FATHERS_PROFESSION")
	private String fathersProfession;

	@Column(name="IS_DISABLED")
	private String isDisabled;

	@Column(name="MARITAL_STATUS")
	private String maritalStatus;

	@Column(name="MOTHERS_PROFESSION")
	private String mothersProfession;
	@Column(name="RELIGION")
	private String religion;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentPersonalDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getCategory() {
		return this.category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getChooseScheme() {
		return this.chooseScheme;
	}

	public void setChooseScheme(String chooseScheme) {
		this.chooseScheme = chooseScheme;
	}

	public String getCommunity() {
		return this.community;
	}

	public void setCommunity(String community) {
		this.community = community;
	}

	public int getFamilyIncome() {
		return this.familyIncome;
	}

	public void setFamilyIncome(int familyIncome) {
		this.familyIncome = familyIncome;
	}

	public String getFathersProfession() {
		return this.fathersProfession;
	}

	public void setFathersProfession(String fathersProfession) {
		this.fathersProfession = fathersProfession;
	}

	public String getIsDisabled() {
		return this.isDisabled;
	}

	public void setIsDisabled(String isDisabled) {
		this.isDisabled = isDisabled;
	}

	public String getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(String maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getMothersProfession() {
		return this.mothersProfession;
	}

	public void setMothersProfession(String mothersProfession) {
		this.mothersProfession = mothersProfession;
	}

	public String getReligion() {
		return this.religion;
	}

	public void setReligion(String religion) {
		this.religion = religion;
	}

	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public StudentPersonalDetail(String category, String chooseScheme, String community, int familyIncome,
			String fathersProfession, String isDisabled, String maritalStatus, String mothersProfession,
			String religion) {
		super();
		this.category = category;
		this.chooseScheme = chooseScheme;
		this.community = community;
		this.familyIncome = familyIncome;
		this.fathersProfession = fathersProfession;
		this.isDisabled = isDisabled;
		this.maritalStatus = maritalStatus;
		this.mothersProfession = mothersProfession;
		this.religion = religion;
	}

}