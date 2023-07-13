package com.telusko.hibernate;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name="alien_info")
public class Alien implements Serializable
{
 @Id
  private int aid;
 
  private AlienName aname;
  private String colour;

}
