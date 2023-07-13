package com.bhanu.core.repository;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.bhanu.core.dto.UserDto;
import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.sessionfactoryutil.SessionFactoryUtil;
import com.bhanu.core.util.ConnectionPropertiesUtil;

public class UserRepository
{
	
  public void saveOrUpdate(UserEntity userEntity) {
	  //save db logic
//	  Configuration cfg = new Configuration();
//	  cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//	  cfg.addAnnotatedClass(UserEntity.class);
//	  SessionFactory sessionFactory = cfg.buildSessionFactory();
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.merge(userEntity);
	  transaction.commit(); 
  }
  
 
public UserEntity findById(long id)
  {
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  return session.get(UserEntity.class, id);
  }
  
  public void update(UserDto userDto){
	  //update db logic
	  UserEntity userEntity = findById(userDto.getAltKey());
	  if(userEntity!=null)
	  {
	   userEntity.setName(userDto.getName());
	   userEntity.setCity(userDto.getCity());
	   userEntity.setCountry(userDto.getCountry());
	   userEntity.setPinCode(userDto.getPinCode());
	   saveOrUpdate(userEntity);
//	   Configuration cfg = new Configuration();
//	   cfg.setProperties(ConnectionPropertiesUtil.getMysqlDbProperties());
//	   cfg.addAnnotatedClass(UserEntity.class);
//	   SessionFactory sessionFactory = cfg.buildSessionFactory();
//	   Session session = sessionFactory.openSession();
//	   Transaction transaction = session.beginTransaction();
//	   session.merge(userEntity);
//	   transaction.commit();
	  }
  }
  
  public void delete(UserEntity u) {
	  //delete db logic
	  
	  SessionFactory sessionFactory = SessionFactoryUtil.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  Transaction transaction = session.beginTransaction();
	  session.delete(u);
	  transaction.commit();
	  
  }
}


