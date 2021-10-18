package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the INSTITUTE_DETAILS database table.
 * 
 */
@Entity
@Table(name="INSTITUTE_DETAILS")
@NamedQuery(name="InstituteDetail.findAll", query="SELECT i FROM InstituteDetail i")
public class InstituteDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="INSTITUTE_CODE")
	private String instituteCode;

	@Column(name="ADMISSION_STARTED_YEAR")
	private int admissionStartedYear;

	@Column(name="AFFIL_UNIVERSITY_BOARD_NAME")
	private String affilUniversityBoardName;

	@Column(name="AFFIL_UNIVERSITY_STATE")
	private String affilUniversityState;

	@Column(name="DISE_CODE")
	private String diseCode;

	@Column(name="INSTITUTE_CATEGORY")
	private String instituteCategory;

	@Column(name="INSTITUTE_NAME")
	private String instituteName;

	@Column(name="INSTITUTE_TYPE")
	private String instituteType;
	@Column(name="LOCATION")
	private String location;

	@Column(name="MOBILE_NUMBER")
	private String mobileNumber;

	@Column(name="PRINCIPAL_NAME")
	private String principalName;
	@Column(name="TELEPHONE")
	private String telephone;
	@Column(name="PASSWORD")
	private String Password;

	@Column(name="INSTITUTE_MAIL")
	private String instituteMail;
	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="instituteDetail")
	private Set<Address> addresses;

	//bi-directional one-to-one association to InstituteStatus
	@OneToOne(mappedBy="instituteDetail", cascade = CascadeType.ALL)
	private InstituteStatus instituteStatus;

	//bi-directional many-to-one association to StudentBasicDetail
	@OneToMany(mappedBy="instituteDetail")
	private Set<StudentBasicDetail> studentBasicDetails;

	public InstituteDetail() {
	}

	public String getInstituteCode() {
		return this.instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public int getAdmissionStartedYear() {
		return this.admissionStartedYear;
	}

	public void setAdmissionStartedYear(int admissionStartedYear) {
		this.admissionStartedYear = admissionStartedYear;
	}

	public String getAffilUniversityBoardName() {
		return this.affilUniversityBoardName;
	}

	public void setAffilUniversityBoardName(String affilUniversityBoardName) {
		this.affilUniversityBoardName = affilUniversityBoardName;
	}

	public String getAffilUniversityState() {
		return this.affilUniversityState;
	}

	public void setAffilUniversityState(String affilUniversityState) {
		this.affilUniversityState = affilUniversityState;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public String getInstituteMail() {
		return instituteMail;
	}

	public void setInstituteMail(String instituteMail) {
		this.instituteMail = instituteMail;
	}

	public String getDiseCode() {
		return this.diseCode;
	}

	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}

	public String getInstituteCategory() {
		return this.instituteCategory;
	}

	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}

	public String getInstituteName() {
		return this.instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getInstituteType() {
		return this.instituteType;
	}

	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}

	public String getLocation() {
		return this.location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getMobileNumber() {
		return this.mobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public String getPrincipalName() {
		return this.principalName;
	}

	public void setPrincipalName(String principalName) {
		this.principalName = principalName;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setInstituteDetail(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setInstituteDetail(null);

		return address;
	}

	public InstituteStatus getInstituteStatus() {
		return this.instituteStatus;
	}

	public void setInstituteStatus(InstituteStatus instituteStatus) {
		this.instituteStatus = instituteStatus;
	}

	public Set<StudentBasicDetail> getStudentBasicDetails() {
		return this.studentBasicDetails;
	}

	public void setStudentBasicDetails(Set<StudentBasicDetail> studentBasicDetails) {
		this.studentBasicDetails = studentBasicDetails;
	}

	public StudentBasicDetail addStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		getStudentBasicDetails().add(studentBasicDetail);
		studentBasicDetail.setInstituteDetail(this);

		return studentBasicDetail;
	}

	public StudentBasicDetail removeStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		getStudentBasicDetails().remove(studentBasicDetail);
		studentBasicDetail.setInstituteDetail(null);

		return studentBasicDetail;
	}

}