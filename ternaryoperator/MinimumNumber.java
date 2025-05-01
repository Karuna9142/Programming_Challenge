package com.ternaryoperator;

import java.util.Scanner;

public class MinimumNumber {
	
	public static int findMin(int num1, int num2) {
		
		return  num1 < num2 ? num1 : num2;
	
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : - ");
		int num = sc.nextInt();
		
		System.out.println("Enter a second number - ");
		int num1 = sc.nextInt();
		
		int min = findMin(num, num1);
		System.out.println("Minimum number is - " +min);

	}

}
