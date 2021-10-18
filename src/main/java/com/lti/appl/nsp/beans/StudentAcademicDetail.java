package com.lti.appl.nsp.beans;

import java.io.Serializable;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * The persistent class for the STUDENT_ACADEMIC_DETAILS database table.
 * 
 */
@Entity
@Table(name="STUDENT_ACADEMIC_DETAILS")
@NamedQuery(name="StudentAcademicDetail.findAll", query="SELECT s FROM StudentAcademicDetail s")
public class StudentAcademicDetail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@Column(name="AADHAR")
	private String aadhar;

	@Column(name="BOARD_NAME")
	private String boardName;

	@Column(name="PASSING_YEAR")
	private int passingYear;
	@Column(name="PERCENTAGE")
	private Float percentage;

	@Column(name="ROLL_NO")
	private String rollNo;
	@Column(name="STANDARD")
	private int standard;
	@Column(name="PRESENT_YEAR")
	private int presentYear;

	@Column(name="MODE_OF_STUDY")
	private String modeOfStudy;

	@Column(name="PRESENT_COURSE")
	private String presentCourse;

	@Column(name="PREVIOUS_YEAR")
	private int previousYear;

	@Column(name="PREVIOUS_COURSE")
	private String previousCourse;

	@Column(name="PREVIOUS_COURSE_PERCENT")
	private float previousCoursePercent;

	//bi-directional one-to-one association to StudentBasicDetail
	@OneToOne
	@MapsId
	@JoinColumn(name="AADHAR")
	private StudentBasicDetail studentBasicDetail;

	public StudentAcademicDetail() {
	}

	public String getAadhar() {
		return this.aadhar;
	}

	public void setAadhar(String aadhar) {
		this.aadhar = aadhar;
	}

	public String getBoardName() {
		return this.boardName;
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
		return previousYear;
	}

	public void setPrevousYear(int prevousYear) {
		this.previousYear = prevousYear;
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

	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}

	public int getPassingYear() {
		return this.passingYear;
	}

	public void setPassingYear(int passingYear) {
		this.passingYear = passingYear;
	}

	public Float getPercentage() {
		return this.percentage;
	}

	public void setPercentage(Float percentage) {
		this.percentage = percentage;
	}

	public String getRollNo() {
		return this.rollNo;
	}

	public void setRollNo(String rollNo) {
		this.rollNo = rollNo;
	}

	public int getStandard() {
		return this.standard;
	}

	public void setStandard(int standard) {
		this.standard = standard;
	}
	@JsonIgnore
	public StudentBasicDetail getStudentBasicDetail() {
		return this.studentBasicDetail;
	}

	public void setStudentBasicDetail(StudentBasicDetail studentBasicDetail) {
		this.studentBasicDetail = studentBasicDetail;
	}

	public StudentAcademicDetail(String boardName, int passingYear, Float percentage, String rollNo, int standard,
			int presentYear, String modeOfStudy, String presentCourse, int prevousYear, String previousCourse,
			float previousCoursePercent) {
		super();
		this.boardName = boardName;
		this.passingYear = passingYear;
		this.percentage = percentage;
		this.rollNo = rollNo;
		this.standard = standard;
		this.presentYear = presentYear;
		this.modeOfStudy = modeOfStudy;
		this.presentCourse = presentCourse;
		this.previousYear = prevousYear;
		this.previousCourse = previousCourse;
		this.previousCoursePercent = previousCoursePercent;
	}

}