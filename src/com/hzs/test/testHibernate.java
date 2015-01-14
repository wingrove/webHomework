package com.hzs.test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hzs.hibernate.db.HibernateSessionFactory;
import com.myeclipse.hibernate.User;

public class testHibernate {
	
	public static void main(String[] args) {
		Session session = HibernateSessionFactory.getSession();
		Transaction tx = session.beginTransaction();
		
		User user = new User("judy", "456", 0);
		
		user.setId(2);
		
		try {
			session.update(user);
			tx.commit();
		}
		catch (Exception e) {
			// TODO: handle exception
			tx.rollback();
			e.printStackTrace();
		} 
		finally {
			session.close();
		}
		
	}

}
