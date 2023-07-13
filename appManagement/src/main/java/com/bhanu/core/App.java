package com.bhanu.core;

import java.util.List;

import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.repository.UserHqlRepository;
import com.bhanu.core.repository.UserRepository;

/**
 * Hello world!
 *
 */
public class App 
{
     public static void main(String[] args)
     {
		UserEntity userEntity = new UserEntity();
		userEntity.setAltKey(356);
		userEntity.setServiceName("testing");
		userEntity.setUrl("bhanugoud2001@");
		userEntity.setStatus("up");
		userEntity.setCreatedDate("2023/2/11");
		userEntity.setCreatedBy("bhanu");
		userEntity.setModifiedDate("2022/11/30");
		userEntity.setModifiedBy("erripuk hemanth");
		
		UserRepository userRepository = new UserRepository();
//		userRepository.save(userEntity);
//		System.out.println(userRepository.findById(1));
		
	
		UserHqlRepository userHqlRepository = new UserHqlRepository();
		
//		List<UserEntity> l = userHqlRepository.findAll();
//		l.forEach(a->{System.out.println(a);});
		
		List<UserEntity> l = userHqlRepository.findByServiceName("test");		
		System.out.println(l);
	}
}
