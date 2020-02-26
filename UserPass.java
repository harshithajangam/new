package com.capg;

import java.util.Scanner;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

@SuppressWarnings("unused")
public class UserPass 
{
public static void check(String user,String pwd)
{
BiPredicate<String,String> bp= (u,p)->{
if(user.equals("karthik") && pwd.equals("karu"))
return true;
else
return false;
};
System.out.println(bp.test(user, pwd));
}
public static void main(String[] args) {
// TODO Auto-generated method stub
@SuppressWarnings("resource")
Scanner sc=new Scanner(System.in);
System.out.println("Enter user name");
String uname=sc.next();
System.out.println("Enter password");
String pwd=sc.next();
check(uname,pwd);
}
}

