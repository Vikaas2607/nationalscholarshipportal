package com.lti.appl.nsp.beans;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
 * The persistent class for the STUDENT_BASIC_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_BASIC_DETAILS")
@NamedQuery(name="StudentBasicDetail.findAll", query="SELECT s FROM StudentBasicDetail s")
public class StudentBasicDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;
	@Column(name="AGE")
	private int age;

//	@Temporal(TemporalType.DATE)
	
	@Column(name="DATE_OF_BIRTH", columnDefinition = "DATE")
	private LocalDate dateOfBirth;


	@Column(name="EMAIL_ID")
	private String emailId;

	@Column(name="FATHERS_NAME")
	private String fathersName;
	@Column(name="GENDER")
	private String gender;
	@Column(name="MOBILE")
	private String mobile;

	@Column(name="MOTHERS_NAME")
	private String mothersName;
	@Column(name="NAME")
	private String name;
	@Column(name="PASSWORD")
	private String password;

	//bi-directional many-to-one association to Address
	@OneToMany(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	private Set<Address> addresses;

	//bi-directional one-to-one association to StudentAcademicDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentAcademicDetail studentAcademicDetail;

	//bi-directional many-to-one association to StudentBankDetail
	@OneToMany(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private Set<StudentBankDetail> studentBankDetails;

	//bi-directional many-to-one association to InstituteDetail
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="INSTITUTE_CODE")
	private InstituteDetail instituteDetail;

	//bi-directional one-to-one association to StudentDisabilityDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentDisabilityDetail studentDisabilityDetail;

	//bi-directional one-to-one association to StudentDocumentDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentDocumentDetail studentDocumentDetail;

	//bi-directional one-to-one association to StudentFeeDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentFeeDetail studentFeeDetail;

	//bi-directional one-to-one association to StudentPersonalDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentPersonalDetail studentPersonalDetail;

	//bi-directional one-to-one association to StudentStatusDetail
	@OneToOne(mappedBy="studentBasicDetail", cascade = CascadeType.ALL)
	@PrimaryKeyJoinColumn
	private StudentStatusDetail studentStatusDetail;

	public StudentBasicDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate localDate) {
		this.dateOfBirth = localDate;
	}

	public String getEmailId() {
		return this.emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getFathersName() {
		return this.fathersName;
	}

	public void setFathersName(String fathersName) {
		this.fathersName = fathersName;
	}

	public String getGender() {
		return this.gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMothersName() {
		return this.mothersName;
	}

	public void setMothersName(String mothersName) {
		this.mothersName = mothersName;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(Set<Address> addresses) {
		this.addresses = addresses;
	}

	public Address addAddress(Address address) {
		getAddresses().add(address);
		address.setStudentBasicDetail(this);

		return address;
	}

	public Address removeAddress(Address address) {
		getAddresses().remove(address);
		address.setStudentBasicDetail(null);

		return address;
	}

	public StudentAcademicDetail getStudentAcademicDetail() {
		return this.studentAcademicDetail;
	}

	public void setStudentAcademicDetail(StudentAcademicDetail studentAcademicDetail) {
		this.studentAcademicDetail = studentAcademicDetail;
	}

	public Set<StudentBankDetail> getStudentBankDetails() {
		return this.studentBankDetails;
	}

	public void setStudentBankDetails( Set<StudentBankDetail> studentBankDetails) {
		this.studentBankDetails = studentBankDetails;
	}

	public StudentBankDetail addStudentBankDetail(StudentBankDetail studentBankDetail) {
		getStudentBankDetails().add(studentBankDetail);
		studentBankDetail.setStudentBasicDetail(this);

		return studentBankDetail;
	}

	public StudentBankDetail removeStudentBankDetail(StudentBankDetail studentBankDetail) {
		getStudentBankDetails().remove(studentBankDetail);
		studentBankDetail.setStudentBasicDetail(null);

		return studentBankDetail;
	}

	public InstituteDetail getInstituteDetail() {
		return this.instituteDetail;
	}

	public void setInstituteDetail(InstituteDetail instituteDetail) {
		this.instituteDetail = instituteDetail;
	}

	public StudentDisabilityDetail getStudentDisabilityDetail() {
		return this.studentDisabilityDetail;
	}

	public void setStudentDisabilityDetail(StudentDisabilityDetail studentDisabilityDetail) {
		this.studentDisabilityDetail = studentDisabilityDetail;
	}

	public StudentDocumentDetail getStudentDocumentDetail() {
		return this.studentDocumentDetail;
	}

	public void setStudentDocumentDetail(StudentDocumentDetail studentDocumentDetail) {
		this.studentDocumentDetail = studentDocumentDetail;
	}

	public StudentFeeDetail getStudentFeeDetail() {
		return this.studentFeeDetail;
	}

	public void setStudentFeeDetail(StudentFeeDetail studentFeeDetail) {
		this.studentFeeDetail = studentFeeDetail;
	}

	public StudentPersonalDetail getStudentPersonalDetail() {
		return this.studentPersonalDetail;
	}

	public void setStudentPersonalDetail(StudentPersonalDetail studentPersonalDetail) {
		this.studentPersonalDetail = studentPersonalDetail;
	}

	public StudentStatusDetail getStudentStatusDetail() {
		return this.studentStatusDetail;
	}

	public void setStudentStatusDetail(StudentStatusDetail studentStatusDetail) {
		this.studentStatusDetail = studentStatusDetail;
	}

}