package com.capg;

import static org.junit.Assert.*;
import org.junit.Test;

//import junitproject.Person;

public class TestPerson2 {
	@Test
	public void testPerson()
	{
		
	}
	@Test
	public void testGetFirstName()
	{
		System.out.println("From TestPerson2");
		Person per=new Person("Robert","King");
		assertEquals("Robert",per.getFirstName());
	}
	@Test
	public void testGetLastName()
	{
		System.out.println("From TestPerson2");
		Person per=new Person("Robert","King");
		assertEquals("King",per.getLastName());
	}
	@Test
	public void testGetFullName()
	{
		System.out.println("From TestPerson2");
		Person per=new Person("Robert","King");
		assertEquals("Robert King",per.getFullname());
	}
	@Test(expected= IllegalArgumentException.class)
	public void testNullslnName()
	{
		System.out.println("from TestPerson2 testing exceptions");
		@SuppressWarnings("unused")
		Person per1=new Person(null,null);
	}
	

}