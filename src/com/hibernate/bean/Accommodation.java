package com.hibernate.bean;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "accommodation")
@Entity
public class Accommodation {
	@Id
	@Column(name="id")
	private int id;
	@Column(name="create_datetime")
	private Date createTime;
	@Column(name="expired_datetime")
	private Date expriedTime;
	@Column(name="apartment_id")
	private int apartmentId;
	@Column(name="student_id")
	private int studentId;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public Date getExpriedTime() {
		return expriedTime;
	}
	public void setExpriedTime(Date expriedTime) {
		this.expriedTime = expriedTime;
	}
	public int getApartmentId() {
		return apartmentId;
	}
	public void setApartmentId(int apartmentId) {
		this.apartmentId = apartmentId;
	}
	public int getStudent_id() {
		return studentId;
	}
	public void setStudent_id(int student_id) {
		this.studentId = student_id;
	}
	@Override
	public String toString() {
		return "Accommodation [id=" + id + ", createTime=" + createTime + ", expriedTime=" + expriedTime
				+ ", apartmentId=" + apartmentId + ", student_id=" + studentId + "]";
	}
	
	
	
}
