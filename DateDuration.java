package com.capg;

import java.time.*;
public class DateDuration {
		
	         public void duration()
	         {
	        	 LocalDate pdate = LocalDate.of(2014,12,11);
	 	        LocalDate now = LocalDate.now();
	 	 
	 	        Period dur = Period.between(pdate, now);
	 	       System.out.printf("\nDuration is %d years, %d months and %d days old\n\n",dur.getYears(), dur.getMonths(), dur.getDays());
	 }
	           public static void main(String[] args)
		    {
		        DateDuration d = new DateDuration();
		        d.duration();
		     
		     
		    }
	}
