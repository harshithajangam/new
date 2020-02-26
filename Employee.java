package com.capg;
import com.capg.EmployeeException;

public class Employee {
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", insuranceScheme="
				+ insuranceScheme + ", salary=" + salary + "]";
	}

	private int id;
	private String name, designation, insuranceScheme;
	private double salary;
	 public Employee()
	{
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getInsuranceScheme() {
		return insuranceScheme;
	}

	public void setInsuranceScheme(String insuranceScheme) {
		this.insuranceScheme = insuranceScheme;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) throws EmployeeException {
		if (salary < 3000) {
			EmployeeException e1 = new EmployeeException("Salary less than 3000");
			throw e1;
		} else {
			this.salary = salary;
		}
	}

}