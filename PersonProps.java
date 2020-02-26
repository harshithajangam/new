package com.capg;


	import java.io.FileReader;
	import java.io.IOException;
	import java.util.Properties;


	public class PersonProps {
		
		public static void main(String args[]) throws IOException
		{
			FileReader fr=new FileReader("E:\\cap\\hello.txt");
			Properties p=new Properties();
			p.load(fr);
			System.out.println("Properties after loading : \n"+p);
			System.out.println("\nafter using getproperty :");
			System.out.println(p.getProperty("Name"));
			System.out.println(p.getProperty("Phno"));
		}

	}




