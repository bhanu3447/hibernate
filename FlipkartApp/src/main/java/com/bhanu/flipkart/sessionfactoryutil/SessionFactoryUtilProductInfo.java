package com.bhanu.flipkart.sessionfactoryutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhanu.flipkart.entity.ProductInfo;
import com.bhanu.flipkart.util.ConnectionPropertiesUtil;

public class SessionFactoryUtilProductInfo 
{
  private static SessionFactory sessionFactory=null;
  public static SessionFactory getSessionFactoryProduct()
  {
	  if(sessionFactory==null)
	  {
		  Configuration cfg = new Configuration();
		  cfg.setProperties(ConnectionPropertiesUtil.getMyDbProperties());
		  cfg.addAnnotatedClass(ProductInfo.class);
		  sessionFactory = cfg.buildSessionFactory();
	  }
	  return sessionFactory;
  }
}
