package com.bhanu.core;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import com.bhanu.core.dto.UserDto;
import com.bhanu.core.entity.UserEntity;
import com.bhanu.core.repository.UserHqlRepository;
import com.bhanu.core.repository.UserRepository;

public class App  
{
    public static void main( String[] args )
    {
    	UserEntity userEntity = new UserEntity();
//    	userEntity.setAltKey(4);
//    	userEntity.setName("mangal");
//    	userEntity.setEmail("abjhijeet@123");
//    	userEntity.setPassword("725827");
//    	userEntity.setCity("banglore");
//    	userEntity.setCountry("india");
//    	userEntity.setPinCode("12345595");
//    	userEntity.setContactNumber("10899");
    	
    	UserRepository userRepository = new UserRepository();
//    	userRepository.save(userEntity);
//    	System.out.println(userRepository.findById(2).toString());
    	
    	UserDto userDto = new UserDto();
//    	userDto.setAltKey(1);
//    	userDto.setName("k hemalatha");
//    	userDto.setCity("nunakinapalli");
//    	userDto.setPinCode("524002");
//    	userDto.setCountry("india");
    	
//    	userRepository.update(userDto);
    	
//    	userEntity.setAltKey(2);
//    	userRepository.delete(userEntity);
    	
    	UserHqlRepository userHqlRepository = new UserHqlRepository();
    	List<UserEntity> list = userHqlRepository.findAll();
//    	list.forEach(a->
//    	{                                //1.8 for each feature
//    		System.out.println(a);
//    	
//    	});
    	
    	//using stream api filtering
    	
//    	List<UserEntity> l = list.stream().filter(a->a.getName().equalsIgnoreCase("mangal")).collect(Collectors.toList());
//    	l.forEach(a->{System.out.println(a);});
    	
    	
    	//to get  a single object
    	
//    	Optional<UserEntity> findAny = list.stream().filter(a->a.getName().equalsIgnoreCase("mangal")).findAny();
//    	System.out.println(findAny);
    	
    	//to get  first object
    	
//    	Optional<UserEntity> findAny = list.stream().filter(a->a.getName().equalsIgnoreCase("mangal")).findFirst();
//    	System.out.println(findAny);
    	
//    	List <UserEntity>l = userHqlRepository.findByName("tiger");
//    	l.forEach(a->{System.out.println(a);});
    	
    	
    	//update using email
    	
    	userHqlRepository.updatePasswordByEmail("tiger@123", "bhalllnu1263");
    	
    	// update using name
    	
//    	userHqlRepository.updatePasswordByName("tiger","surya");
 
    	
    	//delete row by email
    	userHqlRepository.deleteByEmail("tiger@123");
    	
   }    
}
