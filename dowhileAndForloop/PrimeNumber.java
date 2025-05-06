package com.dowhileAndForloop;

import java.util.Scanner;

public class PrimeNumber {
	
	public static boolean isPrime(int num) {
		
		for(int i = 2; i<num ; i++) {
			if(num % i == 0) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number :- ");
		int num = sc.nextInt();
		
		boolean isPrime = isPrime(num);
		System.out.println("Your number is :- " +(isPrime(num) ? "Prime" : " not Prime"));

	}

}
