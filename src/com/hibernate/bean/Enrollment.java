package com.hibernate.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "enrollment")
@Entity
public class Enrollment {
	@Id
	@Column(name = "id")
	private int id;
	@Column(name = "course_impl_id")
	private int courseImplId;
	@Column(name = "student_id")
	private int studentId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCourseImplId() {
		return courseImplId;
	}
	public void setCourseImplId(int courseImplId) {
		this.courseImplId = courseImplId;
	}
	public int getStudentId() {
		return studentId;
	}
	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}
	
}
