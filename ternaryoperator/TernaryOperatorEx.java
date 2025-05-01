package com.ternaryoperator;

import java.util.Scanner;

public class TernaryOperatorEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number - ");
		int num = sc.nextInt();
		
		System.out.println("Enter a second number");
		int num1 = sc.nextInt();
		
		int greatest = num > num1 ? num : num1;
		System.out.println("Greatest number is - "+greatest);

	}

}
