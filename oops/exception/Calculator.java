package com.oops.exception;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to division calculator");
		System.out.println("\nPlease enter two numbers");
		int first = sc.nextInt();
		int second = sc.nextInt();
		
		try
		{
		  int result = first/second;
		  System.out.println(result);
		}
		catch (ArithmeticException e)
		{
		  System.out.printf("Divide by zero, enter valid values" );
		}
	}

}
