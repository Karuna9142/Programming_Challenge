package com.demo;

import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Principle amount:- ");
		double p = sc.nextDouble();
		
		System.out.println("Enter  your Rate of interest:- ");
		double r = sc.nextDouble();
		
		System.out.println("Enter  your time :- ");
		double t = sc.nextDouble();
		
		double SI = p*r*t/100;
		System.out.println("Simple Interest is Rs:- "+SI);
		

	}

}
