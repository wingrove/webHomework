package com.myeclipse.hibernate;

/**
 * Timetable entity. @author MyEclipse Persistence Tools
 */

public class Timetable implements java.io.Serializable {

	// Fields

	private Integer ttid;
	private Course course;
	private Teacher teacher;
	private Integer termNum;
	private Integer classId;
	private String room;
	private Integer beginWeek;
	private Integer endWeek;
	private Integer beginCourse;
	private Integer endCourse;

	// Constructors

	/** default constructor */
	public Timetable() {
	}

	/** full constructor */
	public Timetable(Course course, Teacher teacher, Integer termNum,
			Integer classId, String room, Integer beginWeek, Integer endWeek,
			Integer beginCourse, Integer endCourse) {
		this.course = course;
		this.teacher = teacher;
		this.termNum = termNum;
		this.classId = classId;
		this.room = room;
		this.beginWeek = beginWeek;
		this.endWeek = endWeek;
		this.beginCourse = beginCourse;
		this.endCourse = endCourse;
	}

	// Property accessors

	public Integer getTtid() {
		return this.ttid;
	}

	public void setTtid(Integer ttid) {
		this.ttid = ttid;
	}

	public Course getCourse() {
		return this.course;
	}

	public void setCourse(Course course) {
		this.course = course;
	}

	public Teacher getTeacher() {
		return this.teacher;
	}

	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}

	public Integer getTermNum() {
		return this.termNum;
	}

	public void setTermNum(Integer termNum) {
		this.termNum = termNum;
	}

	public Integer getClassId() {
		return this.classId;
	}

	public void setClassId(Integer classId) {
		this.classId = classId;
	}

	public String getRoom() {
		return this.room;
	}

	public void setRoom(String room) {
		this.room = room;
	}

	public Integer getBeginWeek() {
		return this.beginWeek;
	}

	public void setBeginWeek(Integer beginWeek) {
		this.beginWeek = beginWeek;
	}

	public Integer getEndWeek() {
		return this.endWeek;
	}

	public void setEndWeek(Integer endWeek) {
		this.endWeek = endWeek;
	}

	public Integer getBeginCourse() {
		return this.beginCourse;
	}

	public void setBeginCourse(Integer beginCourse) {
		this.beginCourse = beginCourse;
	}

	public Integer getEndCourse() {
		return this.endCourse;
	}

	public void setEndCourse(Integer endCourse) {
		this.endCourse = endCourse;
	}

}