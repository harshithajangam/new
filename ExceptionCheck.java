package com.capg;
import static org.junit.Assert.assertEquals;

import org.junit.Test;


public class ExceptionCheck {

	@Test
	public void testEmployeeException() {
		System.out.println("exception check1");
		Employee e = new Employee();
		assertEquals(12,e.getId());
	}

	@Test
	public void testEmployeeExceptionString() {
		System.out.println("exception check2");
		Employee e1 = new Employee();
		assertEquals("karthik",e1.getName());
	}

	@Test
	public void testToString() {
		System.out.println("exception check3");
		Employee e2 = new Employee();
		assertEquals("mahesh",e2.getClass().getName());
	}

	@Test
	public void testGetMessage() {
		System.out.println("exception check4");
		Employee e3 = new Employee();
		assertEquals(12,e3.getId());
	}

}

	