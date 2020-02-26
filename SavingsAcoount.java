package com.cap;


	class SavingsAccount extends Account {
		private final double minBalance = 1000;
		double bal;

		public void withdraw(double amount) {
			bal = super.getBalance();
			double bal1 = bal - amount;
			if (bal > minBalance && bal1 >= minBalance) {

				bal -= amount;
				super.setBalance(bal);
			} else {

				System.out.println(" You can withdraw upto  " + (bal - minBalance));
			}

		}
	}

