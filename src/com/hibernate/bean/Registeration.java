package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "registeration")
@Entity
public class Registeration {
	@Id
	@Column(name="id")
	private int id;
	@Column(name = "created_date")
	private Date createdDate;
	@Column(name = "student_id")
	private int studentId;
	@Column(name = "major_id")
	private int majorId;
	@Column(name = "academy_year_id")
	private int academyYearId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	public int getMajorId() {
		return majorId;
	}
	public void setMajorId(int majorId) {
		this.majorId = majorId;
	}
	public int getAcademyYearId() {
		return academyYearId;
	}
	public void setAcademyYearId(int academyYearId) {
		this.academyYearId = academyYearId;
	}
	
	
}
