package com.association.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student  implements Serializable
{
	
	@Id
//	@GenericGenerator(name="auto_gen",strategy="increment")
//	  @GeneratedValue(generator = "auto_gen")
	@Column(name = "sid")
    private long sid;
  
	
	@Column(name = "name")
    private String name;
	
	@ManyToMany
    private List<Laptop> laptops=new ArrayList<>();


	public long getSid() {
		return sid;
	}


	public void setSid(long sid) {
		this.sid = sid;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public List<Laptop> getLaptops() {
		return laptops;
	}


	public void setLaptops(List<Laptop> laptops) {
		this.laptops = laptops;
	}
	
	
	
	
	
  
  
}
