package com.association.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.entity.Flight;
import com.association.entity.Laptop;
import com.association.entity.Student;
import com.association.entity.Team;
import com.association.sessionfactoryutil.SessionFactoryUtil;



public class association
{
  public void saveTeamDetails(Team team)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(team);
	  transaction.commit();
	  
  }
  public void saveFlightDetails(Flight flight)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(flight);
	  transaction.commit();
	  
  }
  public void saveLaptopDetails(Laptop laptop)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(laptop);
	  transaction.commit();
	  
  }
  public void saveStudentDetails(Student student)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(student);
	  transaction.commit();
	  
  }
 
  
  
}
