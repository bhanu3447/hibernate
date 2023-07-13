package com.bhanu.core.sessionfactoryutil;


import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.util.ConnectionPropertiesUtil;

public class SessionFactoryUtil 
{
 private static SessionFactoryUtil sessionfactory=null;
 public static SessionFactory getSessionFactory()
 {
	 if(sessionfactory==null)
	 {
		 Configuration cfg = new Configuration();
		 cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
		 cfg.addAnnotatedClass(UserEntity.class);
		return cfg.buildSessionFactory(); 
	 }
	return null;
 }
}
