package com.bhanu.core.repository;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
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
 
 public List findByName(String name)
 {
	 StringBuilder sb = new StringBuilder();
	 sb.append("from UserEntity where name=:n");   //(=: is called as name parameter in hql)
	 SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	 Session session = sessionFactory.openSession();
	 Query query = session.createQuery(sb.toString());
	 query.setParameter("n",name);
	 return query.getResultList(); 
 }
 
 
 public void updatePasswordByEmail(String email,String password)
 {
	StringBuilder sb = new StringBuilder();
	
	sb.append(" update UserEntity set ");
	sb.append(" password=:p where email=:e");
//	sb.append("update UserEntity set password=:p where email=:e");
	SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction transaction = session.beginTransaction();
	Query query = session.createQuery(sb.toString());
	query.setParameter("p",password);
	query.setParameter("e", email);
	query.executeUpdate();
	transaction.commit();
	
 }
 
 
  public void updatePasswordByName(String name,String password)
  {
	  StringBuilder sb = new StringBuilder();
	  sb.append("update UserEntity set password=:p where name=:n");
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  Query query = session.createQuery(sb.toString());
	  query.setParameter("p", password);
	  query.setParameter("n", name);
	  query.executeUpdate();
	  transaction.commit();
  }
  
  public void deleteByEmail(String email)
  {
	  StringBuilder sb = new StringBuilder();
	  sb.append("delete UserEntity where email=:e");
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  Query query = session.createQuery(sb.toString());
	  query.setParameter("e", email);
	  query.executeUpdate();
	  transaction.commit();
  }
 
}
