package com.ternaryoperator;

import java.util.Scanner;

public class EvenOrOddTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : - ");
		int num = sc.nextInt();
		
		String evenOdd = num % 2 == 0 ? "even" : "odd";
				
		System.out.println("Your number is :- "+evenOdd);

	}

}
