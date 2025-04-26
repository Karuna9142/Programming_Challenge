package com.loop;

import java.util.Scanner;

public class Factorial {
	
	public static long factNum(int num) {
		if(num<2) {
			return 1;
		}
		long fact = 1;
		int i = 2;
		while(i<=num) {
			fact *= i;
			i++;
		}
		return fact;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		long result = factNum(num);
		System.out.println("factorial of " +num+ " is:- "+result);
		
		

	}

}
