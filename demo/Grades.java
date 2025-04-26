package com.demo;

import java.util.Scanner;

public class Grades {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your percentage:- ");
		float per = sc.nextFloat();
		
		if(per >= 90) {
			System.out.println("Great, you havr got A");
		} else if (per >= 75) {
			System.out.println("Good, you have got B");
		} else if (per >= 60) {
			System.out.println("You have got C, work hard");
		} else if (per >= 30) {
			System.out.println("you have got D ");
		} else {
			System.out.println("Sorry, You have failed");
		}
		
	}

}
