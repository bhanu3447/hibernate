package com.bhanu.core.repository;

import java.util.List;
import java.util.stream.Stream;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.sessionfactoryutil.SessionFactoryUtil;

public class UserHqlRepository 
{
  public List<UserEntity> findAll()
  {
	  StringBuilder sb = new StringBuilder();
	  sb.append("from UserEntity");
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery(sb.toString());
	  return query.getResultList();
  }
  
  public List findByServiceName(String name)
  {
	  StringBuilder sb = new StringBuilder();
	  sb.append("from UserEntity where service_name=:n");
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Query query = session.createQuery(sb.toString());
	  query.setParameter("n",name);
	  return query.getResultList();
  }
 
}
