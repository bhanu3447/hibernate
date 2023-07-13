package com.association.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.CascadeType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Team  implements Serializable
{
  @Id
  @GenericGenerator(name="auto_gen",strategy="increment")
  @GeneratedValue(generator = "auto_gen")
  @Column(name = "alt_key")
  private long altKey;
  
  @Column(name = "name")
  private String name;
  
  
  @Column(name = "team_size")
  private long TeamSize;
  
  @Column(name = "team_type")
  private String TeamType;
  
  
  @OneToOne(cascade=CascadeType.ALL)
  @JoinColumn(name="forigen_key")
  private Captain captain;


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


public long getTeamSize() {
	return TeamSize;
}


public void setTeamSize(long teamSize) {
	TeamSize = teamSize;
}


public String getTeamType() {
	return TeamType;
}


public void setTeamType(String teamType) {
	TeamType = teamType;
}


public Captain getCaptain() {
	return captain;
}


public void setCaptain(Captain captain) {
	this.captain = captain;
}
  
}
