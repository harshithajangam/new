package com.capg;


	import java.io.FileReader;
	public class Number
	{
		   public static void main(String[] args)
		     {
		       try
		       {
		         FileReader fr = new FileReader("E:/cap/hello.txt");
		         String str = "";
		         int ch;
		         while ((ch = fr.read()) != -1)
		         {
		        	 str += Character.toString((char) ch);
		         }
		         System.out.println("Original String : " + str);
		         StringBuilder sb = new StringBuilder(str);
		         System.out.println("Reverse order : " + sb.reverse());
		         fr.close();
		       }
		         catch(Exception e)
		       {
		             System.out.println("error"+e.getMessage());
		       }
		     }
	}

