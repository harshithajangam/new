package com.capg;


	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Scanner;
	public class NumberData {

		public static void main(String[] args) throws IOException
		{
			FileReader fr = new FileReader("E:/cap/numbers.txt"); 
				  Scanner sc=new Scanner(fr);
				  while(sc.hasNext())
				  {
					  String str=sc.nextLine();
					  System.out.println(str);
					  String[] s=str.split(",");
					  int i=s.length;
					     int k[]=new int[i];
					     int j;
					     for(j=0;j<i;j++)
					     {
					    	 k[j]=Integer.parseInt(s[j]);
					    	 
					     }
					  //   System.out.println("Integer array:"+Arrays.toString(k));
					     System.out.println("even numbers:");
					     for(j=0;j<i;j++)
					     if(k[j]%2==0)
				    	 {
				    		 System.out.println(k[j]);
				    	 }
				  }
				  sc.close();     
		}
	}

