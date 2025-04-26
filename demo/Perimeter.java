package com.demo;

import java.util.Scanner;

public class Perimeter {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first side:- ");
		int A = sc.nextInt();
		
		System.out.println("Enter second side:- ");
		int B = sc.nextInt();
		
		System.out.println("Enter third side:- ");
		int C = sc.nextInt();
		
		System.out.println("Enter fourth side:- ");
		int D = sc.nextInt();
		
		int perimeter = A+B+C+D;
		System.out.println("Perimeter of Rectangle is:- "+perimeter);

	}

}
