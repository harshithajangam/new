package com.cap;
public class AccountMain{
public static void main(String[] args) {
Person p1 = new Person();
p1.setName("Smith");
p1.setAge(21);
Person p2 = new Person();
p2.setName("Kathy");
p2.setAge(21);
CurrentAccount smithAcc = new CurrentAccount();
smithAcc.setAccHolder(p1);
SavingsAccount kathyAcc = new SavingsAccount();
kathyAcc.setAccHolder(p2);
smithAcc.setBalance(2000);
kathyAcc.setBalance(5000);
smithAcc.deposit(2000);
System.out.println("The updated smith account balance is " + smithAcc.getBalance());
System.out.println("The updated kathy account balance is " + kathyAcc.getBalance());
kathyAcc.withdraw(2000);
kathyAcc.withdraw(4500);
 kathyAcc.withdraw(0.0);
smithAcc.withdraw(6000);
System.out.println(smithAcc.toString());
System.out.println(kathyAcc.toString());
}

}