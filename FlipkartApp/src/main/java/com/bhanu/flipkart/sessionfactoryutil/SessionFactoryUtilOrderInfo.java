package com.bhanu.flipkart.sessionfactoryutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhanu.flipkart.entity.OrderInfo;
import com.bhanu.flipkart.util.ConnectionPropertiesUtil;


public class SessionFactoryUtilOrderInfo
{
 private static SessionFactory sessionFactory=null;
 public static SessionFactory getSessionFactoryOrder()
 {
	 if(sessionFactory==null)
	 {
		 Configuration cfg = new Configuration();
		 cfg.setProperties(ConnectionPropertiesUtil.getMyDbProperties());
		 cfg.addAnnotatedClass(OrderInfo.class);
		sessionFactory = cfg.buildSessionFactory();
		 
	 }
	return sessionFactory;
	 
 }
}
