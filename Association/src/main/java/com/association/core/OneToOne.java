package com.association.core;

import com.association.entity.Captain;
import com.association.entity.Team;
import com.association.repository.association;

public class OneToOne
{
  public static void main(String[] args)
  {
	
	Captain c = new Captain();
	c.setCaptainName("kohli");
	c.setAge("25");
	c.setEmail("@kholi100");
	
	
//	Team t = new Team();
//	t.setName("kohli");
//	t.setTeamSize(10);
//	t.setTeamType("ipl");
//	t.setCaptain(c);
	
	Team t2 = new Team();
	t2.setName("kohli");
	t2.setTeamSize(180);
	t2.setTeamType("ipl3");
	t2.setCaptain(c);

	association a = new association();
	a.saveTeamDetails(t2);
  }
}
