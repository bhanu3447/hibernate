 package com.association.core;

import java.util.ArrayList;
import java.util.List;

import com.association.entity.Airhostess;
import com.association.entity.Flight;
import com.association.repository.association;

public class OneToMany 
{
   public static void main(String[] args) 
   {
	
	 Airhostess airhostess1 = new Airhostess();
	 airhostess1.setAge("20");
	 airhostess1.setName("hemalatha");
	 
	 Airhostess airhostess2 = new Airhostess();
	 airhostess2.setAge("21");
	 airhostess2.setName("surya lakshmi");
	 
	 Airhostess airhostess3 = new Airhostess();
	 airhostess3.setAge("22");
	 airhostess3.setName("venkat lachhimi");
	 
	List<Airhostess>  l= new ArrayList<>();
	l.add(airhostess1);
	l.add(airhostess2);
	l.add(airhostess3);
	

	 
	 Flight flight = new Flight();
	 flight.setName("air india");
	 flight.setNumOfSeats("600");
	 flight.setPrice(10000000);
	 flight.setAirhostesslist(l);
	 
	 association asc = new association();
	 asc.saveFlightDetails(flight);
	 
   }
}
