package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the STUDENT_DOCUMENT_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_DOCUMENT_DETAILS")
@NamedQuery(name="StudentDocumentDetail.findAll", query="SELECT s FROM StudentDocumentDetail s")
public class StudentDocumentDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAAR")
	private String aadhar;

	@Column(name="AADHAAR_CARD")
	private String aadhaarCard;

	@Column(name="BANK_PASSBOOK_FRONT_PAGE")
	private String bankPassbookFrontPage;

	@Column(name="CASTE_OR_INCOME_CERTIFICATE")
	private String casteOrIncomeCertificate;

	@Column(name="DOMICILE_CERTIFICATE")
	private String domicileCertificate;

	@Column(name="FEE_RECIEPT_OF_CURRENT_YEAR")
	private String feeRecieptOfCurrentYear;

	@Column(name="INSTITUTE_BONAFIED_CERTIFICATE")
	private String instituteBonafiedCertificate;

	@Column(name="INSTITUTE_ID_CARD")
	private String instituteIdCard;

	@Column(name="NINTH_MARKSHEET")
	private String ninthMarksheet;

	@Column(name="PREVIOUS_YEAR_MARKSHEET")
	private String previousYearMarksheet;

	@Column(name="STUDENT_PHOTOGRAPH")
	private String studentPhotograph;

	@Column(name="TENTH_MARKSHEET")
	private String tenthMarksheet;

	@Column(name="TWELFTH_MARKSHEET")
	private String twelfthMarksheet;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentDocumentDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getAadhaarCard() {
		return this.aadhaarCard;
	}

	public void setAadhaarCard(String aadhaarCard) {
		this.aadhaarCard = aadhaarCard;
	}

	public String getBankPassbookFrontPage() {
		return this.bankPassbookFrontPage;
	}

	public void setBankPassbookFrontPage(String bankPassbookFrontPage) {
		this.bankPassbookFrontPage = bankPassbookFrontPage;
	}

	public String getCasteOrIncomeCertificate() {
		return this.casteOrIncomeCertificate;
	}

	public void setCasteOrIncomeCertificate(String casteOrIncomeCertificate) {
		this.casteOrIncomeCertificate = casteOrIncomeCertificate;
	}

	public String getDomicileCertificate() {
		return this.domicileCertificate;
	}

	public void setDomicileCertificate(String domicileCertificate) {
		this.domicileCertificate = domicileCertificate;
	}

	public String getFeeRecieptOfCurrentYear() {
		return this.feeRecieptOfCurrentYear;
	}

	public void setFeeRecieptOfCurrentYear(String feeRecieptOfCurrentYear) {
		this.feeRecieptOfCurrentYear = feeRecieptOfCurrentYear;
	}

	public String getInstituteBonafiedCertificate() {
		return this.instituteBonafiedCertificate;
	}

	public void setInstituteBonafiedCertificate(String instituteBonafiedCertificate) {
		this.instituteBonafiedCertificate = instituteBonafiedCertificate;
	}

	public String getInstituteIdCard() {
		return this.instituteIdCard;
	}

	public void setInstituteIdCard(String instituteIdCard) {
		this.instituteIdCard = instituteIdCard;
	}

	public String getNinthMarksheet() {
		return this.ninthMarksheet;
	}

	public void setNinthMarksheet(String ninthMarksheet) {
		this.ninthMarksheet = ninthMarksheet;
	}

	public String getPreviousYearMarksheet() {
		return this.previousYearMarksheet;
	}

	public void setPreviousYearMarksheet(String previousYearMarksheet) {
		this.previousYearMarksheet = previousYearMarksheet;
	}

	public String getStudentPhotograph() {
		return this.studentPhotograph;
	}

	public void setStudentPhotograph(String studentPhotograph) {
		this.studentPhotograph = studentPhotograph;
	}

	public String getTenthMarksheet() {
		return this.tenthMarksheet;
	}

	public void setTenthMarksheet(String tenthMarksheet) {
		this.tenthMarksheet = tenthMarksheet;
	}

	public String getTwelfthMarksheet() {
		return this.twelfthMarksheet;
	}

	public void setTwelfthMarksheet(String twelfthMarksheet) {
		this.twelfthMarksheet = twelfthMarksheet;
	}

	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public StudentDocumentDetail(String aadhaarCard, String bankPassbookFrontPage, String casteOrIncomeCertificate,
			String domicileCertificate, String feeRecieptOfCurrentYear, 
			String instituteIdCard, String ninthMarksheet, String previousYearMarksheet, String studentPhotograph,
			String tenthMarksheet, String twelfthMarksheet) {
		super();
		this.aadhaarCard = aadhaarCard;
		this.bankPassbookFrontPage = bankPassbookFrontPage;
		this.casteOrIncomeCertificate = casteOrIncomeCertificate;
		this.domicileCertificate = domicileCertificate;
		this.feeRecieptOfCurrentYear = feeRecieptOfCurrentYear;
		
		this.instituteIdCard = instituteIdCard;
		this.ninthMarksheet = ninthMarksheet;
		this.previousYearMarksheet = previousYearMarksheet;
		this.studentPhotograph = studentPhotograph;
		this.tenthMarksheet = tenthMarksheet;
		this.twelfthMarksheet = twelfthMarksheet;
	}

}