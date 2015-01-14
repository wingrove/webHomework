
package com.hzs.struts.action;

import hibernate.Customer;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzs.hibernate.db.HibernateSessionFactory;
import com.hzs.struts.form.DeleteCustomerForm;
import com.hzs.struts.form.ManModDelTimetableForm;

/** 
 * MyEclipse Struts
 * Creation date: 01-07-2014
 * 
 * XDoclet definition:
 * @struts.action path="/manModDelTimetable" name="manModDelTimetableForm" input="/form/manModDelTimetable.jsp" scope="request"
 */
public class DeleteCustomerAction extends Action {
	
	/** 
	 * Method execute
	 * @param mapping
	 * @param form
	 * @param request
	 * @param response
	 * @return ActionForward
	 */
	public ActionForward execute(ActionMapping mapping, ActionForm form,
			HttpServletRequest request, HttpServletResponse response) {
		
		DeleteCustomerForm deleteCustomerForm = (DeleteCustomerForm) form;
		
		String customerId = deleteCustomerForm.getCustomerId();
		Customer customer = new Customer(customerId,"a","a","a","a","a");
		
		request.getSession().setAttribute("customerId", customerId);
		
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		session.delete(customer);
		
		//Query query = session.createQuery("delete from customer c where c.customerId = ? ");
		//query.setString(0, customerId);

		tx.commit();
		
		return mapping.findForward("delSuccess");
			
//		
//		ManModDelTimetableForm manModDelTimetableForm = (ManModDelTimetableForm) form;// TODO Auto-generated method stub
//		
//		int recordNum = manModDelTimetableForm.getRecordNum();
//		int function = manModDelTimetableForm.getFunction();
//		
//		request.getSession().setAttribute("recordNum", recordNum);
//		
//		Session session = HibernateSessionFactory.getSession();
//		Transaction tx = session.beginTransaction();
//		
//		if (function == 1) { //modify
//			Query query = session.createQuery("from Timetable t where t.ttid = ?");
//			query.setInteger(0, recordNum);
//			List list = query.list();
//			
//			tx.commit();
//			
//			request.getSession().setAttribute("ModItem", list.get(0));
//			
//			return mapping.findForward("modTimetable");
//		}
//		else { //delete
//			Query query = session.createQuery("delete from Timetable t where t.ttid = ?");
//			query.setInteger(0, recordNum);
//			int ret = query.executeUpdate();
//			
//			tx.commit();
//			
//			request.getSession().setAttribute("ret", ret);
//			
//			return mapping.findForward("delSuccess");
//		}
	}
}