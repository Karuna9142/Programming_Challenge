package com.ternaryoperator;

import java.util.Scanner;

public class StudentScoresTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your marks : - ");
		int marks = sc.nextInt();
		
		String result = marks >= 80 ? "High" : (marks > 50 ? "Moderate" : "Low");
		System.out.println("Your category is :- "+result);
		

	}

}
