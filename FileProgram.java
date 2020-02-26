package com.capg;


	import java.io.FileReader;
	import java.io.FileWriter;

	public class FileProgram extends Thread 
	{
		public static void main(String[] args)throws Exception 
		{
			FileReader fi = new FileReader("F:\\cap\\source.txt");
			FileWriter fw = new FileWriter("F:\\cap\\target.txt");
			@SuppressWarnings("unused")
			CopyDataThread c = new CopyDataThread(fi,fw);
		}
	}

