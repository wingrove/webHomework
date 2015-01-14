package com.myeclipse.hibernate;

/**
 * Student entity. @author MyEclipse Persistence Tools
 */

public class Student implements java.io.Serializable {

	// Fields
	private Integer stuNum;
	private String name;
	private String idnum;
	private Integer classId;
	private String email;
	private Integer phoneNum;

	// Constructors

	/** default constructor */
	public Student() {
	}

	/** minimal constructor */
	public Student(String name, String idnum, Integer classId) {
		this.name = name;
		this.idnum = idnum;
		this.classId = classId;
	}

	/** full constructor */
	public Student(String name, String idnum, Integer classId, String email, Integer phoneNum) {
		this.name = name;
		this.idnum = idnum;
		this.classId = classId;
		this.email = email;
		this.phoneNum = phoneNum;
	}
	
	public Student(Integer classId, String email, Integer phoneNum) {
		this.classId = classId;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	// Property accessors
	public Integer getStuNum() {
		return this.stuNum;
	}

	public void setStuNum(Integer stuNum) {
		this.stuNum = stuNum;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIdnum() {
		return this.idnum;
	}

	public void setIdnum(String idnum) {
		this.idnum = idnum;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getPhoneNum() {
		return this.phoneNum;
	}

	public void setPhoneNum(Integer phoneNum) {
		this.phoneNum = phoneNum;
	}

}