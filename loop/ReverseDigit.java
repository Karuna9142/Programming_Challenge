package com.loop;

import java.util.Scanner;

class ReverseDigit {
	
	public static int revNum(int num) {
		int newNum = 0;
		while(num>0) {
			int rem = num%10;
			newNum = newNum*10+rem;
			num = num/10;
		}
		return newNum;
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a digit:- ");
		int num = sc.nextInt();
		
		int revNum = revNum(num);
		System.out.println("Reversed Number is:- "+revNum);
		
		

	}

}
