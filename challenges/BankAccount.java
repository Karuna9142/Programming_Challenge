package com.challenges;

public class BankAccount {
	
	private String accno;
	private String acchname;
	private double balance;
	
	
	
	public BankAccount(String accno, String acchname) {
		super();
		this.accno = accno;
		this.acchname = acchname;
	}

	public void deposite(double money) {
		if(money <= 0) {
			System.out.println("Invalid deposit");
		} else {
			balance += money;
		}
		
	}
	
	public double withdraw(double amount) {
		if(balance >= amount) {
			  balance -= amount;
		} 
		else if (amount <= 0)
		{
		 System.out.println("Invalide Error");
		}
		else 
		{
			amount = balance;
			balance = 0;
		}
		return amount;

	}

}
