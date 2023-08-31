package com.canara;

public class BankImpl implements Bank{

	double balance;

	public BankImpl(double balance) {
		
		this.balance = balance;
	}

	@Override
	public void deposit(int amount) {
		System.out.println("Depositing Rs."+amount);
		balance = balance+amount;
		System.out.println("Amount Deposited successfully..!!!!!!!!!");

	}

	@Override
	public void withdrawn(int amount) {
		if(amount<=balance) {
		System.out.println("withdrawing amount Rs."+amount);
		balance = balance-amount;
		System.out.println("Amount Withdrawn successfully..!!!!!!!!!");
		}
		else {
			try {
				throw new InsufficientBalanceException("insufficient fund");
			}
			catch(InsufficientBalanceException e) {
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public String getBalance() {
		return "Total Amount "+balance;
	}


}
