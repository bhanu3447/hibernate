package com.association.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Laptop 
{
	

	@Id
//	@GenericGenerator(name="auto_gen",strategy="increment")
//	  @GeneratedValue(generator = "auto_gen")
	@Column(name = "lid")
    private long lid;
  
	
	@Column(name = "lname")
    private String lname;
	
	@ManyToMany(mappedBy = "laptops")
  private List<Student> students=new ArrayList<>();

	public long getLid() {
		return lid;
	}

	public void setLid(long lid) {
		this.lid = lid;
	}

	public String getLname() {
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public List<Student> getStudents() {
		return students;
	}

	public void setStudents(List<Student> students) {
		this.students = students;
	}



	
	

}
