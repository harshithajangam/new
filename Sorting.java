package com.capg;
import java.util.Scanner;
	public class Sorting{
		
		public static void main(String[] args)
	    {
	        int n;
	        String temp;
	        @SuppressWarnings("resource")
			Scanner s = new Scanner(System.in);
	        System.out.print("Enter number of items:");
	        n = s.nextInt();
	        String names[] = new String[n];
	        @SuppressWarnings("resource")
			Scanner s1 = new Scanner(System.in);
	        System.out.println("Enter the product names :");
	        for(int i = 0; i < n; i++)
	        {
	            names[i] = s1.nextLine();
	        }
	        for (int i = 0; i < n; i++)
	        {
	            for (int j = i + 1; j < n; j++)
	            {
	                if (names[i].compareTo(names[j])>0)
	                {
	                    temp = names[i];
	                    names[i] = names[j];
	                    names[j] = temp;
	                }
	            }
	        }
	        System.out.print("Names in Sorted Order:");
	        for (int i = 0; i < n - 1; i++)
	        {
	            System.out.print(names[i] + ",");
	        }
	        System.out.print(names[n - 1]);
	    }
	}

