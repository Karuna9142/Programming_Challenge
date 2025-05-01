package com.ternaryoperator;

import java.util.Scanner;

public class AbsoluteTernary {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number : - ");
		int num = sc.nextInt();
		
		int absolute = num >= 0? num : -num;
		System.out.println("Absolute value is:- "+absolute);

	}

}
