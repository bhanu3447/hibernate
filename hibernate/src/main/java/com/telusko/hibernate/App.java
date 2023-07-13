package com.telusko.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.imageio.spi.ServiceRegistry;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { 
    	
    	Laptop laptop = new Laptop();
    	laptop.setLid(12);
    	laptop.setLname("dell");
    
    	
     	
    	Laptop laptop2 = new Laptop();
    	laptop2.setLid(2);
    	laptop2.setLname("hp");
    	
    	List <Laptop> l=new ArrayList<Laptop>();
    	l.add(laptop2);
    	l.add(laptop);
    	
    	Student student = new Student();
    	student.setName("bhanu");
    	student.setMarks(20);
    	
    	laptop.setStudent(student);
    	laptop2.setStudent(student);
        
  
    	
          Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
//        StandardServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
//        SessionFactory sessionFactory = cfg.buildSessionFactory(reg);
          SessionFactory sessionFactory = cfg.buildSessionFactory();
          Session session = sessionFactory.openSession();
          Transaction transaction = session.beginTransaction();
        
        
              session.save(laptop2);
              session.save(laptop);
              session.save(student);
              transaction.commit();
    	
    	
    	
    	
  //////******************************one to many***********************************************////////////////
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(1);
//    	laptop.setLname("dell");
//    	
//    	Laptop laptop2 = new Laptop();
//    	laptop2.setLid(2);
//    	laptop2.setLname("hp");
//    	
//    	
//    	List<Laptop> l= new ArrayList<Laptop>();
//    	l.add(laptop2);
//    	l.add(laptop);
//    	
//    	
//    	Student student = new Student();
//    	student.setName("bhanu");
//    	student.setMarks(20);
//    	student.setRollno(25);
//    	
//    	student.setLaptops(l);
//    	
//    	
//    	
//    
//    	
//        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
////        StandardServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
////        SessionFactory sessionFactory = cfg.buildSessionFactory(reg);
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        
//        session.save(laptop);
//        session.save(student);
//        transaction.commit();
//    	
    	
    	
    	
    	
    	
    	
    	//////******************************one to one***********************************************////////////////
    	
//    	Laptop laptop = new Laptop();
//    	laptop.setLid(1);
//    	laptop.setLname("dell");
//    	
//    	
//    	Student student = new Student();
//    	student.setName("bhanu");
//    	student.setMarks(20);
//    	student.setRollno(25);
//    	
//    	student.setLaptop(laptop);
//   	
//        Configuration cfg = new Configuration().configure().addAnnotatedClass(Student.class).addAnnotatedClass(Laptop.class);
////        StandardServiceRegistry reg=new StandardServiceRegistryBuilder().applySettings(cfg.getProperties()).build();
////        SessionFactory sessionFactory = cfg.buildSessionFactory(reg);
//        SessionFactory sessionFactory = cfg.buildSessionFactory();
//        Session session = sessionFactory.openSession();
//        Transaction transaction = session.beginTransaction();
//        
//        session.save(laptop);
//        session.save(student);
//        transaction.commit();
       
   
        
    }
}
