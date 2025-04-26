package com.loop;

import java.util.Scanner;

public class ReturnEx {
	
	public static int addition(int num1, int num2) {
		
		int sum = num1+num2;
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int num = sc.nextInt();
		
		System.out.println("Enter second number:- ");
		int num1 = sc.nextInt();
		
		System.out.println("Sum of two number is:- "+addition(num, num1));
		
	}

}
