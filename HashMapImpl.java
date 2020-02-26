package com.capg;
import java.util.HashMap;
	import java.util.Scanner;

	public class HashMapImpl {
		
		
		static int i=101;
		private int id;
	    private	String fname;
		private String lname;
		private double salary;
		private String designation;
		private String insuranceScheme;
		
		
		public HashMapImpl(int id, String fname, String lname, double salary, String designation) {
			//super();
			this.id = id;
			this.fname = fname;
			this.lname = lname;
			this.salary = salary;
			this.designation = designation;
		//	this.insuranceScheme= insuranceScheme;
			i++;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			id = i;
		}
		public String getFname() {
			return fname;
		}
		public void setFname(String fname) {
			this.fname = fname;
		}
		public String getLname() {
			return lname;
		}
		public void setLname(String lname) {
			this.lname = lname;
		}
		public double getSalary() {
			return salary;
		}
		public void setSalary(double salary) {
			this.salary = salary;
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
		this.insuranceScheme =insuranceScheme;

		}
		@Override
		public String toString() {
			return "id=" + id + ", Name=" + fname+" "+lname + ", salary=" + salary + ", designation="
					+ designation ;
		}
		
		public void insurance() {
			// TODO Auto-generated method stub
			String designation = getDesignation();
				double salary = getSalary();
		if(designation.equalsIgnoreCase("System Associate") && (salary>5000 && salary<20000))
		{
			setInsuranceScheme("SCHEME C");
		}
		else if(designation.equalsIgnoreCase("Programmer") && (salary>=20000 && salary<40000))
		{
			setInsuranceScheme("SCHEME B");
		}
		else if(designation.equalsIgnoreCase("Manager") && salary>=40000 )
		{
			 setInsuranceScheme("SCHEME A");
		}
		else if(designation.equalsIgnoreCase("Clerk") && salary<5000)
		{
			setInsuranceScheme("NO SCHEME");
			}
		}
		public void addElements(HashMap<String, HashMapImpl> list,HashMapImpl e)
		{
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("Enter key name");
			String s = sc.next();
			list.put(s,e);
			//sc.close();
		}
		@SuppressWarnings("unlikely-arg-type")
		public static void removeElement(HashMap<String,HashMapImpl> list,int id)
		{
			

			if(list.containsValue(id))
			{
				
				//list.remove()
			}
		}
		public static void main(String args[])
		{
			@SuppressWarnings({ "unused", "resource" })
			Scanner sc = new Scanner(System.in);
			
			HashMapImpl e1 = new HashMapImpl(i,"karthik","shegu",40000,"nager");
			HashMapImpl e2 = new HashMapImpl(i,"k","sh",20000,"mger");
			HashMapImpl e3 = new HashMapImpl(i,"d","kk",4000,"manag");
			HashMapImpl e4 = new HashMapImpl(i,"ie","iri",30000,"maer");
			HashMapImpl e5 = new HashMapImpl(i,"mahesh","ari",4000,"m");
			//int id, String fname, String lname, double salary, String designation
			HashMap<String,HashMapImpl> list = new HashMap<String,HashMapImpl>(); 
			e1.addElements(list, e1);
			e2.addElements(list, e2);
			e3.addElements(list, e3);
			e4.addElements(list, e4);
			e5.addElements(list, e5);
			System.out.println(list);

			
			
			
			
		}

	}


