/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hzs.struts.form;

import org.apache.struts.action.ActionForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-05-2014
 * 
 * XDoclet definition:
 * @struts.form name="stuBasicInfoForm"
 */
public class StuModifyInfoForm extends ActionForm {
	/*
	 * Generated fields
	 */

	/** phoneNumber property */
	private String phoneNumber;

	/** email property */
	private String email;

	/** classID property */
	private String classID;

	/*
	 * Generated Methods
	 */

	/** 
	 * Returns the phoneNumber.
	 * @return String
	 */
	public String getPhoneNumber() {
		return phoneNumber;
	}

	/** 
	 * Set the phoneNumber.
	 * @param phoneNumber The phoneNumber to set
	 */
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	/** 
	 * Returns the email.
	 * @return String
	 */
	public String getEmail() {
		return email;
	}

	/** 
	 * Set the email.
	 * @param email The email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}

	/** 
	 * Returns the classID.
	 * @return String
	 */
	public String getClassID() {
		return classID;
	}

	/** 
	 * Set the classID.
	 * @param classID The classID to set
	 */
	public void setClassID(String classID) {
		this.classID = classID;
	}
}