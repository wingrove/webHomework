
package com.hzs.struts.form;

import org.apache.struts.action.ActionForm;

public class DeleteCustomerForm extends ActionForm {
	
	private String customerId;

	public String getCustomerId() {
		return customerId;
	}

	public void setCustomerId(String customerId) {
		this.customerId = customerId;
	}
}