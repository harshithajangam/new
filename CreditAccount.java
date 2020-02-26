package com.cap;


	class CurrentAccount extends Account {
		public double overdraftLimit = -1000;
		double bal;

		public void withdraw(double amount) {
			bal = super.getBalance();
			double bal1 = bal - amount;
			if (bal > overdraftLimit && bal1 >= overdraftLimit) {

				bal -= amount;
				super.setBalance(bal);
				System.out.println("false");
			} else {

				System.out.println(" You can withdraw upto  " + (bal - overdraftLimit));
				System.out.println("overdraft amount reached");
			}

		}
}
