package com.bhanu.core.repository;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.sessionfactoryutil.SessionFactoryUtil;
import com.bhanu.core.util.ConnectionPropertiesUtil;

public class UserRepository 
{
  public void save(UserEntity userentity)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
      Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(userentity);
	  transaction.commit();
  }
  
  public UserEntity findById(int id) 
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  return session.get(UserEntity.class, id);
  }
  
  public static void main(String[] args)
  {
	Map <String,Long> m= new HashMap <String,Long>();
	
}
  
}
