package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "course_template")
@Entity
public class CourseTemplate {
	@Id
	@Column(name="id")
	private int id;
	@Column(name = "credit")
	private int credit;
	@Column(name = "create_datetime")
	private Date createDate;
	@Column(name = "course_id")
	private int courseId;
	@Column(name = "major_id")
	private int majorId;
	@Column(name = "academy_year_id")
	private int academyYearId;
	@Column(name = "course_template_type_id")
	private int courseTemplateTypeId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCredit() {
		return credit;
	}
	public void setCredit(int credit) {
		this.credit = credit;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getCourseId() {
		return courseId;
	}
	public void setCourseId(int courseId) {
		this.courseId = courseId;
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
	public int getCourseTemplateTypeId() {
		return courseTemplateTypeId;
	}
	public void setCourseTemplateTypeId(int courseTemplateTypeId) {
		this.courseTemplateTypeId = courseTemplateTypeId;
	}
	
}
