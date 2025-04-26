package com.loop;

import java.util.Scanner;

public class SumOddNumber {
	
	public static int sumOfOddNum(int num) {
		
		int sum = 0;
		int i = 1;
		while(i<=num) {
			sum += i;
			i += 2;
		}
		return sum;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		int sum = sumOfOddNum(num);
		System.out.println("Sum of " +num+ " is:- "+sum);
		

	}

}
