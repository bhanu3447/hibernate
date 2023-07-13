package com.association.core;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.association.entity.Address;
import com.association.entity.Employee;
import com.association.sessionfactoryutil.SessionFactoryUtil;

public class ManyToOne 
{
  public static void main(String[] args)
  {
	  
	  
	  Address address = new Address();
	  address.setAid(202);
	  address.setAddloc("banglore");
	  address.setPin(563007);
	  
	  Employee employee = new Employee();
	  employee.setEid(1);
	  employee.setEname("bhanu");
	  employee.setAddress(address);
	  
	  
	  
	  Employee employee2 = new Employee();
	  employee2.setEid(25);
	  employee2.setEname("prakash");
	  employee2.setAddress(address);

	
	  
	 
	  	  
	  
	  Configuration cfg = new Configuration();
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
//	  session.persist(address);
	  session.persist(employee);
	  session.persist(employee2);
	  transaction.commit();
	  session.close();

  }
}
