package com.loop;

import java.util.Scanner;

public class Prime {
	
	public static boolean isPrime(int num) {
		int i = 2;
		while(i < num) {
			if(num % i == 0) {
				return false;
			}
			i++;
		}
		return true;
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		boolean isPrime  = isPrime(num);
		if(isPrime)
		{
			System.out.println("Prime number");
		}
		else 
		{
			System.out.println("Not Prime Number");
		}

	}

}
