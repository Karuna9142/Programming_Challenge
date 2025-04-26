package com.demo;

import java.util.Scanner;

public class Triangle {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your base and perpendicular in cms:- ");
		double base = sc.nextDouble();
		double height = sc.nextDouble();
		
		double triangle = (base*height)/2;
		System.out.println("Area of triangle is:- "+triangle+ " cms");

	}

}
