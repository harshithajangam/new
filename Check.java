package com.capg;
import java.util.Arrays;
import java.util.Scanner;
	public class Check {
	static boolean AlphabeticalOrder(String s) {
		
			int l=s.length();
			char ch[]=new char[l];
			for(int i=0;i<l;i++) {
				ch[i]=s.charAt(i);
			}
			Arrays.sort(ch) ; 
			for(int i=0;i<l;i++)                                                          
				if(ch[i]!=s.charAt(i))
					return false;
				
					return true;		
	 }
		public static void main(String[] args) {
			// TODO Auto-generated method 
			Scanner sc=new Scanner(System.in);
			System.out.println("enter a string");
			String s=sc.next();
			if(AlphabeticalOrder(s))
				System.out.println("true");
			else
				System.out.println("false");
				sc.close();
			
			
		}
	}
