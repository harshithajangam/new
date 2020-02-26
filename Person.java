package com.capg;

public class Person {
	String Fname;
	String Lname;
	 char gender;
	 int age;
	 float weight;
	 int phoneNo;
	 String fullName;
	 
	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = Fname+Lname;
	}

	Person()
	{
		Fname="Divya";
		Lname="Bharathi";
		gender='f';
		age=20;
		weight=85.55f;
		phoneNo=938983928;
		fullName="DivyaBharathi";
	}
	
	Person(String Fname,String Lname,char gender,int age,float weight)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
	}

	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		Lname = lname;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		Fname = fname;
	}
	public char getGender() {
		return gender;
	}
	public void setGender(char gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	
	public String DisplayDetails()
	{
		return Fname + Lname;
		
	}

	public Person(String Fname,String Lname,char gender,int age,float weight,int phoneNo, String fullName)
	{
	this.Fname=Fname;
	this.Lname=Lname;
	this.gender=gender;
	this.weight = weight;
	this.setPhoneNo(phoneNo);
	this.fullName=fullName;

	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}

	}



