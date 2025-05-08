package com.challenges;

import java.util.Scanner;

public class Customer {

	public static void main(String[] args) {
		

		BankAccount b1 = new BankAccount("1108889", "karuna");
		b1.deposite(500);
		System.out.println(b1.withdraw(200));
		
		b1.deposite(-50);
		b1.withdraw(0);

	}

}
