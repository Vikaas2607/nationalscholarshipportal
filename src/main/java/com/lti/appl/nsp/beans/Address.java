package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the ADDRESS database table.
 * 
 */
@Entity
@NamedQuery(name="Address.findAll", query="SELECT a FROM Address a")
public class Address implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	@Column(name="ADDRESS_ID")
	private int addressId;

	@Column(name="BLOCK_OR_TALUKA")
	private String blockOrTaluka;
	@Column(name="CITY")
	private String city;
	@Column(name="DISTRICT")
	private String dist;

	@Column(name="HOUSE_NUMBER")
	private String houseNumber;

	@Column(name="LINE_1")
	private String line1;

	@Column(name="LINE_2")
	private String line2;
	@Column(name="PINCODE")
	private int pincode;

	@Column(name="STATE")
	private String state;

	@Column(name="STREET_NUMBER")
	private String streetNumber;

	//bi-directional many-to-one association to InstituteDetail
	@ManyToOne
	@JoinColumn(name="INSTITUTE_CODE")
	private InstituteDetail instituteDetail;

	//bi-directional many-to-one association to StudentBasicDetail
	@ManyToOne
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public Address() {	}

	public int getAddressId() {
		return this.addressId;
	}

	public void setAddressId(int addressId) {
		this.addressId = addressId;
	}

	public String getBlockOrTaluka() {
		return this.blockOrTaluka;
	}

	public void setBlockOrTaluka(String blockOrTaluka) {
		this.blockOrTaluka = blockOrTaluka;
	}

	public String getCity() {
		return this.city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getDist() {
		return this.dist;
	}

	public void setDist(String dist) {
		this.dist = dist;
	}

	public String getHouseNumber() {
		return this.houseNumber;
	}

	public void setHouseNumber(String houseNumber) {
		this.houseNumber = houseNumber;
	}

	public String getLine1() {
		return this.line1;
	}

	public void setLine1(String line1) {
		this.line1 = line1;
	}

	public String getLine2() {
		return this.line2;
	}

	public void setLine2(String line2) {
		this.line2 = line2;
	}

	public int getPincode() {
		return this.pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreetNumber() {
		return this.streetNumber;
	}

	public void setStreetNumber(String streetNumber) {
		this.streetNumber = streetNumber;
	}
	@JsonIgnore
	public InstituteDetail getInstituteDetail() {
		return this.instituteDetail;
	}

	public void setInstituteDetail(InstituteDetail instituteDetail) {
		this.instituteDetail = instituteDetail;
	}
@JsonIgnore
	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public Address(String blockOrTaluka, String city, String dist, String houseNumber, String line1, String line2,
			int pincode, String state, String streetNumber) {
		super();
		this.blockOrTaluka = blockOrTaluka;
		this.city = city;
		this.dist = dist;
		this.houseNumber = houseNumber;
		this.line1 = line1;
		this.line2 = line2;
		this.pincode = pincode;
		this.state = state;
		this.streetNumber = streetNumber;
	}

}


