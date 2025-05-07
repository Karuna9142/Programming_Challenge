package com.string;

import java.util.Scanner;

public class GuessingGame {
	
	int random;
	GuessingGame() {
		random = (int) Math.ceil(Math.random() * 100);
	}
	
	int guess(int guessNumber) {
		return guessNumber - random;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		GuessingGame g1 = new GuessingGame();
		
		System.out.println("Welcome to the guessing game . Guess the number between 1 - 100");
		int guess;
		int result;
		
		do {
			System.out.println("Guess the number :- ");
			guess = sc.nextInt();
			result = g1.guess(guess);
			
			if(result == 0) {
				System.out.println("Congrats, Your guess is correct");
			} else if(result < 0) {
				System.out.println("Please Guess Higher");
			} else {
				System.out.println("Plese guess lower");
			}
		} while(result != 0);

	}

}
