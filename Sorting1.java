package com.capg;


	import java.util.*;
	public class Sorting1{

		public static void main(String[] args)
	    {
	        int n;
	        @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of items:");
	        n = s.nextInt();
	        ArrayList<String> product = new ArrayList<String>();
	        @SuppressWarnings("resource")
			Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter the product names :");
	        for(int i = 0; i < n; i++)
	        {
	        	product.add(s1.nextLine());
	        }
	        product.stream().sorted().forEach(System.out::println);
	    }
	}

