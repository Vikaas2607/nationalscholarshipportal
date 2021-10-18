package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * The persistent class for the STUDENT_BANK_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_BANK_DETAILS")
@NamedQuery(name="StudentBankDetail.findAll", query="SELECT s FROM StudentBankDetail s")
public class StudentBankDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="ACCOUNT_NO")
	private String accountNo;

	@Column(name="BANK_IFSC")
	private String bankIfsc;

	@Column(name="BANK_NAME")
	private String bankName;

	//bi-directional many-to-one association to StudentBasicDetail
	@ManyToOne
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentBankDetail() {
	}

	public String getAccountNo() {
		return this.accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	public String getBankIfsc() {
		return this.bankIfsc;
	}

	public void setBankIfsc(String bankIfsc) {
		this.bankIfsc = bankIfsc;
	}

	public String getBankName() {
		return this.bankName;
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	//@JsonIgnore
	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

}