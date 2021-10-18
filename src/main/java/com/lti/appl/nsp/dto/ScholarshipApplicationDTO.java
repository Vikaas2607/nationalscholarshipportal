package com.lti.appl.nsp.dto;

import java.time.LocalDate;

import javax.persistence.Column;

public class ScholarshipApplicationDTO {
	//student academic
	private String aadhar;
	private String boardName;
	private int passingYear;
	private Float percentage;
	private String rollNo;
	private int standard;
	private int presentYear;
	private String modeOfStudy;
	private String presentCourse;
	private int prevousYear;
	private String previousCourse;
	private float previousCoursePercent;
	//student basic
	private int age;
	private LocalDate dateOfBirth;
	private String emailId;
	private String fathersName;
	private String gender;
	private String mobile;
	private String mothersName;
	private String name;
	private String instituteCode;
	
		//student disability
		private int percentageOfDisability;
		private String typeOfDisability;
		//student doc
	private String bankPassbookFrontPage;
		private String casteOrIncomeCertificate;
		private String domicileCertificate;
		private String feeRecieptOfCurrentYear;
		private String aadhaarCard;
		
		private String instituteBonafiedCertificate;
		
		private String instituteIdCard;
		private String ninthMarksheet;
		private String previousYearMarksheet;
		private String studentPhotograph;
		private String tenthMarksheet;
		private String twelfthMarksheet;
		//student fee
		private int admissionFee;
		private int otherFee;
		private int tuitionFee;
		//address
		
		
		//student personal
		private String category;
		private String chooseScheme;
		private String community;
		private int familyIncome;
		private String fathersProfession;
		private String isDisabled;
		private String maritalStatus;
		private String mothersProfession;
		private String religion;
		
		
		//instituteDetail

		
		private int admissionStartedYear;

		
		private String affilUniversityBoardName;

		
		private String affilUniversityState;

		
		private String diseCode;

		
		private String instituteCategory;

		
		private String instituteName;

		private String instituteType;
		
		private String location;

		
		private String mobileNumber;

		
		private String principalName;

		private String telephone;
		
		private String Password;
		
		
		private int addressId;

		
		private String blockOrTaluka;
		
		private String city;
	
		private String dist;

		
		private String houseNumber;

		
		private String line1;

		
		private String line2;
		
		private int pincode;

				private String state;

		
		public int getAddressId() {
					return addressId;
				}
				public void setAddressId(int addressId) {
					this.addressId = addressId;
				}
				public String getBlockOrTaluka() {
					return blockOrTaluka;
				}
				public void setBlockOrTaluka(String blockOrTaluka) {
					this.blockOrTaluka = blockOrTaluka;
				}
				public String getCity() {
					return city;
				}
				public void setCity(String city) {
					this.city = city;
				}
				public String getDist() {
					return dist;
				}
				public void setDist(String dist) {
					this.dist = dist;
				}
				public String getHouseNumber() {
					return houseNumber;
				}
				public void setHouseNumber(String houseNumber) {
					this.houseNumber = houseNumber;
				}
				public String getLine1() {
					return line1;
				}
				public void setLine1(String line1) {
					this.line1 = line1;
				}
				public String getLine2() {
					return line2;
				}
				public void setLine2(String line2) {
					this.line2 = line2;
				}
				public int getPincode() {
					return pincode;
				}
				public void setPincode(int pincode) {
					this.pincode = pincode;
				}
				public String getState() {
					return state;
				}
				public void setState(String state) {
					this.state = state;
				}
				public String getStreetNumber() {
					return streetNumber;
				}
				public void setStreetNumber(String streetNumber) {
					this.streetNumber = streetNumber;
				}
		private String streetNumber;
		
		
		
		
		
		public int getAdmissionStartedYear() {
			return admissionStartedYear;
		}
		public void setAdmissionStartedYear(int admissionStartedYear) {
			this.admissionStartedYear = admissionStartedYear;
		}
		public String getAffilUniversityBoardName() {
			return affilUniversityBoardName;
		}
		public void setAffilUniversityBoardName(String affilUniversityBoardName) {
			this.affilUniversityBoardName = affilUniversityBoardName;
		}
		public String getAffilUniversityState() {
			return affilUniversityState;
		}
		public void setAffilUniversityState(String affilUniversityState) {
			this.affilUniversityState = affilUniversityState;
		}
		public String getDiseCode() {
			return diseCode;
		}
		public void setDiseCode(String diseCode) {
			this.diseCode = diseCode;
		}
		public String getInstituteCategory() {
			return instituteCategory;
		}
		public void setInstituteCategory(String instituteCategory) {
			this.instituteCategory = instituteCategory;
		}
		public String getInstituteName() {
			return instituteName;
		}
		public void setInstituteName(String instituteName) {
			this.instituteName = instituteName;
		}
		public String getInstituteType() {
			return instituteType;
		}
		public void setInstituteType(String instituteType) {
			this.instituteType = instituteType;
		}
		public String getLocation() {
			return location;
		}
		public void setLocation(String location) {
			this.location = location;
		}
		public String getMobileNumber() {
			return mobileNumber;
		}
		public void setMobileNumber(String mobileNumber) {
			this.mobileNumber = mobileNumber;
		}
		public String getPrincipalName() {
			return principalName;
		}
		public void setPrincipalName(String principalName) {
			this.principalName = principalName;
		}
		public String getTelephone() {
			return telephone;
		}
		public void setTelephone(String telephone) {
			this.telephone = telephone;
		}
		public String getPassword() {
			return Password;
		}
		public void setPassword(String password) {
			Password = password;
		}
		public String getAadhar() {
			return aadhar;
		}
		public void setAadhar(String aadhar) {
			this.aadhar = aadhar;
		}
		public String getBoardName() {
			return boardName;
		}
		public void setBoardName(String boardName) {
			this.boardName = boardName;
		}
		public int getPassingYear() {
			return passingYear;
		}
		public void setPassingYear(int passingYear) {
			this.passingYear = passingYear;
		}
		public Float getPercentage() {
			return percentage;
		}
		public void setPercentage(Float percentage) {
			this.percentage = percentage;
		}
		public String getRollNo() {
			return rollNo;
		}
		public void setRollNo(String rollNo) {
			this.rollNo = rollNo;
		}
		public int getStandard() {
			return standard;
		}
		public void setStandard(int standard) {
			this.standard = standard;
		}
		public int getPresentYear() {
			return presentYear;
		}
		public void setPresentYear(int presentYear) {
			this.presentYear = presentYear;
		}
		public String getModeOfStudy() {
			return modeOfStudy;
		}
		public void setModeOfStudy(String modeOfStudy) {
			this.modeOfStudy = modeOfStudy;
		}
		public String getPresentCourse() {
			return presentCourse;
		}
		public void setPresentCourse(String presentCourse) {
			this.presentCourse = presentCourse;
		}
		public int getPrevousYear() {
			return prevousYear;
		}
		public void setPrevousYear(int prevousYear) {
			this.prevousYear = prevousYear;
		}
		public String getPreviousCourse() {
			return previousCourse;
		}
		public void setPreviousCourse(String previousCourse) {
			this.previousCourse = previousCourse;
		}
		public float getPreviousCoursePercent() {
			return previousCoursePercent;
		}
		public void setPreviousCoursePercent(float previousCoursePercent) {
			this.previousCoursePercent = previousCoursePercent;
		}
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public LocalDate getDateOfBirth() {
			return dateOfBirth;
		}
		public void setDateOfBirth(LocalDate dateOfBirth) {
			this.dateOfBirth = dateOfBirth;
		}
		public String getEmailId() {
			return emailId;
		}
		public void setEmailId(String emailId) {
			this.emailId = emailId;
		}
		public String getFathersName() {
			return fathersName;
		}
		public void setFathersName(String fathersName) {
			this.fathersName = fathersName;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getMobile() {
			return mobile;
		}
		public void setMobile(String mobile) {
			this.mobile = mobile;
		}
		public String getMothersName() {
			return mothersName;
		}
		public void setMothersName(String mothersName) {
			this.mothersName = mothersName;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getPercentageOfDisability() {
			return percentageOfDisability;
		}
		public void setPercentageOfDisability(int percentageOfDisability) {
			this.percentageOfDisability = percentageOfDisability;
		}
		public String getTypeOfDisability() {
			return typeOfDisability;
		}
		public void setTypeOfDisability(String typeOfDisability) {
			this.typeOfDisability = typeOfDisability;
		}
		public String getBankPassbookFrontPage() {
			return bankPassbookFrontPage;
		}
		public void setBankPassbookFrontPage(String bankPassbookFrontPage) {
			this.bankPassbookFrontPage = bankPassbookFrontPage;
		}
		public String getCasteOrIncomeCertificate() {
			return casteOrIncomeCertificate;
		}
		public void setCasteOrIncomeCertificate(String casteOrIncomeCertificate) {
			this.casteOrIncomeCertificate = casteOrIncomeCertificate;
		}
		public String getDomicileCertificate() {
			return domicileCertificate;
		}
		public void setDomicileCertificate(String domicileCertificate) {
			this.domicileCertificate = domicileCertificate;
		}
		public String getFeeRecieptOfCurrentYear() {
			return feeRecieptOfCurrentYear;
		}
		public void setFeeRecieptOfCurrentYear(String feeRecieptOfCurrentYear) {
			this.feeRecieptOfCurrentYear = feeRecieptOfCurrentYear;
		}
		public String getInstituteIdCard() {
			return instituteIdCard;
		}
		public void setInstituteIdCard(String instituteIdCard) {
			this.instituteIdCard = instituteIdCard;
		}
		public String getNinthMarksheet() {
			return ninthMarksheet;
		}
		public void setNinthMarksheet(String ninthMarksheet) {
			this.ninthMarksheet = ninthMarksheet;
		}
		public String getPreviousYearMarksheet() {
			return previousYearMarksheet;
		}
		public void setPreviousYearMarksheet(String previousYearMarksheet) {
			this.previousYearMarksheet = previousYearMarksheet;
		}
		public String getStudentPhotograph() {
			return studentPhotograph;
		}
		public void setStudentPhotograph(String studentPhotograph) {
			this.studentPhotograph = studentPhotograph;
		}
		public String getTenthMarksheet() {
			return tenthMarksheet;
		}
		public void setTenthMarksheet(String tenthMarksheet) {
			this.tenthMarksheet = tenthMarksheet;
		}
		public String getTwelfthMarksheet() {
			return twelfthMarksheet;
		}
		public void setTwelfthMarksheet(String twelfthMarksheet) {
			this.twelfthMarksheet = twelfthMarksheet;
		}
		public int getAdmissionFee() {
			return admissionFee;
		}
		public void setAdmissionFee(int admissionFee) {
			this.admissionFee = admissionFee;
		}
		public int getOtherFee() {
			return otherFee;
		}
		public void setOtherFee(int otherFee) {
			this.otherFee = otherFee;
		}
		public int getTuitionFee() {
			return tuitionFee;
		}
		public void setTuitionFee(int tuitionFee) {
			this.tuitionFee = tuitionFee;
		}
		public String getCategory() {
			return category;
		}
		public void setCategory(String category) {
			this.category = category;
		}
		public String getChooseScheme() {
			return chooseScheme;
		}
		public void setChooseScheme(String chooseScheme) {
			this.chooseScheme = chooseScheme;
		}
		public String getCommunity() {
			return community;
		}
		public void setCommunity(String community) {
			this.community = community;
		}
		public int getFamilyIncome() {
			return familyIncome;
		}
		public void setFamilyIncome(int familyIncome) {
			this.familyIncome = familyIncome;
		}
		public String getFathersProfession() {
			return fathersProfession;
		}
		public void setFathersProfession(String fathersProfession) {
			this.fathersProfession = fathersProfession;
		}
		public String getIsDisabled() {
			return isDisabled;
		}
		public void setIsDisabled(String isDisabled) {
			this.isDisabled = isDisabled;
		}
		public String getMaritalStatus() {
			return maritalStatus;
		}
		public void setMaritalStatus(String maritalStatus) {
			this.maritalStatus = maritalStatus;
		}
		public String getMothersProfession() {
			return mothersProfession;
		}
		public void setMothersProfession(String mothersProfession) {
			this.mothersProfession = mothersProfession;
		}
		public String getReligion() {
			return religion;
		}
		public void setReligion(String religion) {
			this.religion = religion;
		}
		
		public String getInstituteCode() {
			return instituteCode;
		}
		public void setInstituteCode(String instituteCode) {
			this.instituteCode = instituteCode;
		}
		public String getAadhaarCard() {
			return aadhaarCard;
		}
		public void setAadhaarCard(String aadhaarCard) {
			this.aadhaarCard = aadhaarCard;
		}
		public String getInstituteBonafiedCertificate() {
			return instituteBonafiedCertificate;
		}
		public void setInstituteBonafiedCertificate(String instituteBonafiedCertificate) {
			this.instituteBonafiedCertificate = instituteBonafiedCertificate;
		}
		
}
