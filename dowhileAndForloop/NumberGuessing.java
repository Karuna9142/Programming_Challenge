package com.dowhileAndForloop;

import java.util.Scanner;

public class NumberGuessing {

	public static void main(String[] args) {
		
		System.out.println("Welcome to number guessing game:- ");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		int num = sc.nextInt();
		int guess;
		
		do {
			System.out.println("Please guess a number:- ");
			guess = sc.nextInt();
		} while (guess != num);
		System.out.println("Your have successfully guessed a number.");

	}

}
