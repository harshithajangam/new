package com.cap;


	public class Accountant extends Account{

		public static void main(String[] args) {
			Person1 p1 = new Person1();
			p1.setName("Smith");
			p1.setAge(30);
			Person1 p2 = new Person1();
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
			 kathyAcc.withdraw(0);
			smithAcc.withdraw(6000);
			System.out.println(smithAcc.toString());
			System.out.println(kathyAcc.toString());

		}

		@Override
		public void withdraw(double amount) {
			// TODO Auto-generated method stub
			balance -=amount;
		}
	}


