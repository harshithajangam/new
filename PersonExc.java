package com.cap;


	public class PersonExc {
		String Fname;
		String Lname;
		 char gender;
		 int age;
		 float weight;
		 
		PersonExc()
		{
			Fname="suhas";
			Lname="shegu";
			gender='m';
			age=22;
			weight=76.3f;
		}
		
		PersonExc(String Fname,String Lname,char gender,int age,float weight)
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
	}

