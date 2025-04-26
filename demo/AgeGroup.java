package com.demo;

import java.util.Scanner;

public class AgeGroup {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Age :- ");
		int age = sc.nextInt();
		
		if(age>=65) {
			System.out.println("you are senior citizen");
		} else if (age >= 20) {
			System.out.println("You are Adult");
		} else if (age >= 13) {
			System.out.println("You are teenager");
		} else {
			System.out.println("You are child");
		}
	}

}
