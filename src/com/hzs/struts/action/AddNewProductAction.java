/*
 * Generated by MyEclipse Struts
 * Template path: templates/java/JavaClass.vtl
 */
package com.hzs.struts.action;

import hibernate.Product;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzs.hibernate.db.HibernateSessionFactory;
import com.hzs.struts.form.AddNewProductForm;


public class AddNewProductAction extends Action {
	/*
	 * Generated Methods
	 */

	/**
	 * Method execute
	 * 
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {

		AddNewProductForm addNewProductForm = (AddNewProductForm) form;

		String productId = addNewProductForm.getProductId();
		String productName = addNewProductForm.getProductName();
		String productType = addNewProductForm.getProductType();
		String productModel = addNewProductForm.getProductModel();
		String discription = addNewProductForm.getDiscription();
		String manufactory = addNewProductForm.getManufactory();
		String productionDate = addNewProductForm.getProductionDate();
		String buildDate = addNewProductForm.getBuildDate();

		Product product = new Product(productId, productName, productType, productModel, 
				discription, manufactory, productionDate, buildDate);

		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();

		session.save(product);
		session.flush();
		session.clear();

		tx.commit();

		return mapping.findForward("addNewProduct");
	}
}
