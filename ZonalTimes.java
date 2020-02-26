package com.capg;


	import java.time.LocalDateTime;
import java.time.ZoneId;

	import java.util.Scanner;

	 

	public class ZonalTimes {

	 

	              public static void main(String[] args) {

	                           // TODO Auto-generated method stub

	                           System.out.println("Enter zone id in terms of Conteinent/Place");

	@SuppressWarnings("resource")
	Scanner sc=new Scanner(System.in);

	String s=sc.next();

	 

	zoneid(s);

	              }

	              public static void zoneid(String s){

	                           LocalDateTime l=LocalDateTime.now(ZoneId.of(s));

	                           System.out.println(l);

	              }

	 

	}

