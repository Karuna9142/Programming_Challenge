package com.loop;

import java.util.Scanner;

public class SumOfDigit {
	
	public static int sumOfDigit(int num) {
		if(num<10) 
			return num;
		
		int sum = 0;

		while(num>0) {
		sum += num%10;
		num = num/10;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		int result = sumOfDigit(num);
		System.out.println("Sum of digit is:- "+result);
		

	}

}
