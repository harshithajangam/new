package com.cig.eis.pl;
import com.cg.eis.bean.*;
import com.cg.eis.service.*;
import com.exception.EmployeeException;

import java.util.*;

	public class UserInput {

	public static void main(String[] args) {
	@SuppressWarnings("resource")
	Scanner in = new Scanner(System.in);
	System.out.println("Enter Details of Employee");
	System.out.println("Enter ID Number");
	int id = in.nextInt();
	System.out.println("Enter Name");
	String name = in.next();
	System.out.println("Enter Designation Name (Programmer,System Associate,Manager,Clerk)");
	String designation = in.next();
	System.out.println("Enter salary");
	double salary = in.nextDouble();
	String insuranceScheme;

	Employee e = new Employee();
	e.setId(id);
	e.setName(name);
	e.setDesignation(designation);
	// e.setSalary(salary);
	EmployeeInsuranceScheme eis = new EmployeeInsuranceScheme();
	insuranceScheme = eis.insuranceDetails(salary, designation);
	e.setInsuranceScheme(insuranceScheme);
	try {
	e.setSalary(salary);
	System.out.println("Employee id " + e.getId());
	System.out.println("Employee Name " + e.getName());
	System.out.println("Employee designation " + e.getDesignation());
	System.out.println("Employee salary " + e.getSalary());
	System.out.println("Employee insurance scheme " + e.getInsuranceScheme());
	} catch (EmployeeException emp) {
	System.out.println(emp.toString());
	}

	 System.out.println("Employee id "+ e.getId());
	 System.out.println("Employee Name "+ e.getName());
	 System.out.println("Employee designation "+ e.getDesignation());
	 System.out.println("Employee salary "+ e.getSalary());
	 System.out.println("Employee insurance scheme "+ e.getInsuranceScheme());

	}

	public static void checkSalary(double salary) throws EmployeeException {
	if (salary < 3000) {
	EmployeeException e = new EmployeeException("Salary less than 3000");
	throw e;
	}
	}
	}

