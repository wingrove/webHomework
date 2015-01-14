package com.myeclipse.hibernate;

import java.util.HashSet;
import java.util.Set;

/**
 * Teacher entity. @author MyEclipse Persistence Tools
 */

public class Teacher implements java.io.Serializable {

	// Fields

	private Integer workNum;
	private String name;
	private String idnum;
	private String school;
	private String email;
	private Integer phoneNum;
	private Set timetables = new HashSet(0);

	// Constructors

	/** default constructor */
	public Teacher() {
	}

	/** minimal constructor */
	public Teacher(String name, String idnum, String school) {
		this.name = name;
		this.idnum = idnum;
		this.school = school;
	}

	/** full constructor */
	public Teacher(String name, String idnum, String school, String email,
			Integer phoneNum, Set timetables) {
		this.name = name;
		this.idnum = idnum;
		this.school = school;
		this.email = email;
		this.phoneNum = phoneNum;
		this.timetables = timetables;
	}
	
	public Teacher(String school, String email, Integer phoneNum) {
		this.school = school;
		this.email = email;
		this.phoneNum = phoneNum;
	}

	// Property accessors

	public Integer getWorkNum() {
		return this.workNum;
	}

	public void setWorkNum(Integer workNum) {
		this.workNum = workNum;
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

	public String getSchool() {
		return this.school;
	}

	public void setSchool(String school) {
		this.school = school;
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

	public Set getTimetables() {
		return this.timetables;
	}

	public void setTimetables(Set timetables) {
		this.timetables = timetables;
	}

}