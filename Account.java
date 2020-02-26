package com.cap;

abstract class Account extends Person {
private static long count = 0;
private long accNum;
private double balance;
private Person accHolder;

public long getAccNum() {
return accNum;
}

public void setAccNum(long accNum) {
this.accNum = accNum;
}

public Person getAccHolder() {
return accHolder;
}

public void setAccHolder(Person accHolder) {
this.accHolder = accHolder;
}

public void setBalance(double balance) {
this.balance = balance;
}

public void deposit(double amount) {
balance += amount;
}

public abstract void withdraw(double amount);
/*{
balance -= amount;
}
*/
public double getBalance() {
return balance;
}

public Account() {
accNum = ++count;
}


}
