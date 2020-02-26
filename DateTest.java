package com.capg;




import static org.junit.Assert.*;

import org.junit.Test;


public class DateTest {

	@Test
	public void testSetDay() {
		System.out.println("From TestPerson2");
		Date d=new Date(12,11,2011);
		assertEquals(12,d.getDay());;
	}

	@Test
	public void testGetDay() {
		System.out.println("From TestPerson2");
		Date d1=new Date(12,12,2012);
		assertEquals("12",d1.getDay());
	}

	@Test
	public void testSetMonth() {
		System.out.println("From TestPerson2");
		Date d2=new Date(12,12,2012);
		assertEquals("12",d2.getMonth());
	}

	@Test
	public void testGetMonth() {
		System.out.println("From TestPerson2");
		Date d3=new Date(12,12,2012);
		assertEquals("12",d3.getMonth());
	}

	@Test
	public void testSetYear() {
		System.out.println("From TestPerson2");
		Date d4=new Date(12,12,2012);
		assertEquals("12",d4.getYear());
	}

	@Test
	public void testGetYear() {
		System.out.println("From TestPerson2");
		Date d5=new Date(12,12,2012);
		assertEquals("12",d5.getYear());
	}

	@Test
	public void testToString() {
		System.out.println("From TestPerson2");
		@SuppressWarnings("unused")
		Date d6=new Date(12,12,2012);
		
	}

}
