package com.capg;

public class Gender {

	
	String Fname;
	String Lname;
	 gender1 gender;
	 int age;
	 float weight;
	 String phno;
	 enum gender1 {M,m,F,f };
	 
	
	Gender()
	{
		Fname="mahesh";
		Lname="shegu";
		age=22;
		gender=gender1.m;
		weight=76.3f;
		phno="9912446939";
	}
	
	Gender(String Fname,String Lname,gender1 gender,int age,float weight,String phno)
	{
		this.Fname=Fname;
		this.Lname=Lname;
		this.gender=gender;
		this.age=age;
		this.weight=weight;
		this.phno=phno;
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
	public gender1 getGender() {
		return gender;
	}
	public gender1 setGender(gender1 gender) {
		return this.gender = gender;
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
	public String getPhno() {
		return phno;
	}


	public void setPhno(String phno) {
		this.phno = phno;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Gender p=new Gender();
		System.out.println("Fname is"+p.Fname);
		System.out.println("Lname is"+p.Lname);
		System.out.println("gender is"+p.gender);
		System.out.println("age is"+p.age);
		System.out.println("weight is"+p.weight);
		System.out.println("phno:"+p.phno);
		Gender p2=new Gender("karthik","shegu",gender1.m,20,67.8f,"8328299822");
		System.out.println("Fname is"+p2.getFname());
		System.out.println("Lname is"+p2.getLname());
		System.out.println("gender is"+p2.getGender());
		System.out.println("age is"+p2.getAge());
		System.out.println("weight is"+p2.getWeight());
		System.out.println("phno:"+p2.getPhno());
	}

}
