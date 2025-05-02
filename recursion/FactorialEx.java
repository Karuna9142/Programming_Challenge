package com.recursion;

import java.util.Scanner;

public class FactorialEx {
	
	public static int factorial(int num) {
		if(num == 1) {
			return 1;
		}
		return num * factorial(num - 1);
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: - ");
		int num  = sc.nextInt();
		
		int fact = factorial(num);
		System.out.println("Factorial of " +num+ " is:- "+fact);

	}

}
