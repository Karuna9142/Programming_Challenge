package com.dowhileAndForloop;

import java.util.Scanner;

public class PasswordChecker {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to Set your password\n");
		System.out.println("Please enter a password");
		String password;
		
		do {
			password = sc.next();
			
			if(!isValidPassword(password)) {
				System.out.println("Sorry, your password is not valid.\nEnter a valid password");
			}
			
		} while(!isValidPassword(password));
		System.out.println("Thanks for entering a valid password");
	}
	public static boolean isValidPassword(String pass) {
		return pass.length() > 6;
		
	}

}
