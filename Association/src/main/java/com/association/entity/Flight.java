package com.association.entity;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="flight_info")
public class Flight implements Serializable
{
  @Id
  @GenericGenerator(name="auto_gen",strategy="increment")
  @GeneratedValue(generator = "auto_gen")
  @Column(name = "alt_key")
  private long altKey;
  
  @Column(name = "name")
  private String name;
  
  @Column(name = "num_of_seats")
  private String numOfSeats;
  
  @Column(name = "price")
  private double price;
  
  
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name = "flight_id")
  private List<Airhostess> airhostesslist;


public long getAltKey() {
	return altKey;
}


public void setAltKey(long altKey) {
	this.altKey = altKey;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getNumOfSeats() {
	return numOfSeats;
}


public void setNumOfSeats(String numOfSeats) {
	this.numOfSeats = numOfSeats;
}


public double getPrice() {
	return price;
}


public void setPrice(double price) {
	this.price = price;
}


public List<Airhostess> getAirhostesslist() {
	return airhostesslist;
}


public void setAirhostesslist(List<Airhostess> airhostesslist) {
	this.airhostesslist = airhostesslist;
}
  
}
