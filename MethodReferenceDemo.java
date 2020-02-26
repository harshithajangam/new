package com.capg;

public  class MethodReferenceDemo
{
	public static void main(String args[])
	{
		MethodReferenceInterface mr=MethodReferenceEx::new;
		mr.display("karthik", "shegu");
	}
}