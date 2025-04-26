package com.loop;

import java.util.Scanner;

public class ArmstrongNumber {
	public static void checkArmstrong(int num) {
		
		int temp = num;
		int sum = 0;
		
		while(num > 0) {
			int rem  = num % 10;
			sum = sum + rem * rem * rem;
			num /= 10;
		}
		if(sum == temp) {
			System.out.println(" Armstrong Number");
		}
		else 
		{
			System.out.println(" Not Armstrong number");
		}
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		checkArmstrong(num);

	}

}
