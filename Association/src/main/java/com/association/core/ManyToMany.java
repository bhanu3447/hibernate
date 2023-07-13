package com.association.core;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.association.entity.Laptop;
import com.association.entity.Student;
import com.association.repository.association;
import com.association.sessionfactoryutil.SessionFactoryUtil;

public class ManyToMany
{
   public static void main(String[] args) 
   {
	   Laptop laptop = new Laptop();
		  laptop.setLid(143);
		  laptop.setLname("victus");
	   
		  
		  
		  Laptop laptop2 = new Laptop();
		  laptop2.setLid(12);
		  laptop2.setLname("dell");

		  Student student = new Student();
		  student.setSid(123);
		  student.setName("bhanu");
		
		  
		  Student student2 = new Student();
		  student2.setSid(12223);
		  student2.setName("prakash");
		  
	  
	 
	  laptop.getStudents().add(student);
	  laptop.getStudents().add(student2);
	  
	  laptop2.getStudents().add(student);
	  laptop2.getStudents().add(student2);
	  
	  
	 
	 
	  
	  student.getLaptops().add(laptop);
	  student.getLaptops().add(laptop2);
	  
	  
	  student2.getLaptops().add(laptop);
	  student2.getLaptops().add(laptop2);
	  
	 
	 
	  
	  
	  
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();

	
	  session.save(student);
	  session.save(student2);
	  session.save(laptop);
	  session.save(laptop2);
	  
	  transaction.commit();
	  session.close();
	  
	  
	  
	  
	  
	  
   }
}
