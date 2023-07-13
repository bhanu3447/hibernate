package com.bhanu.core.sessionfactoryutil;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.util.ConnectionPropertiesUtil;

public class SessionFactoryUtil
{
 private static SessionFactory sessionFactory=null;
 public static SessionFactory getSessionFactory()
 {
	 if(sessionFactory==null)
	 {
		 Configuration cfg = new Configuration();
		  cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		  cfg.addAnnotatedClass(UserEntity.class);
		  sessionFactory = cfg.buildSessionFactory();
	 }
	return sessionFactory;
 } 
}
