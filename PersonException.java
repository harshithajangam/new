package com.cap;

import java.util.Scanner;

public class PersonException {

		public static void main(String[] args) {
			// TODO Auto-generated method stub		
			PersonExc p1 = new PersonExc();
			System.out.println("Fname is : "+p1.Fname);
			System.out.println("Lname is : "+p1.Lname);
			System.out.println("gender is : "+p1.gender);
			System.out.println("age is : "+p1.age);
			System.out.println("weight is : "+p1.weight);
		
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.print("Please enter your first name : ");
			String fname = sc.nextLine();
			System.out.print("Please enter your last name : ");
			String lname = sc.nextLine();
		
			try
			{
				if((fname.equals("") && lname.equals("")))
					throw new NullPointerException("Null Entry");
				else
				{
					PersonExc p2 = new PersonExc(fname,lname,'m',20,67.8f);
					System.out.println("Fname is "+p2.getFname());
					System.out.println("Lname is "+p2.getLname());
					System.out.println("gender is "+p2.getGender());
					System.out.println("age is "+p2.getAge());
					System.out.println("weight is "+p2.getWeight());
				}
			}
			catch(NullPointerException e)
			{
				System.out.println("This field should not be empty..."+e.getMessage());
			}
		}	
	}


