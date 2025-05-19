package com.oops.exception.challenges;

import java.util.Scanner;

public class TestException {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter two integer - ");
		int fst = sc.nextInt();
		int scnd = sc.nextInt();
		
		try
		{
			int div = fst/scnd;
			System.out.println("Result is - "+div);
		}
		catch(ArithmeticException e) {
			if(e.getMessage().equals("/ by zero")) {
				System.out.println("Divide by zero occured.");
			} else {
				throw e;
			}
		}
				

	}

}
