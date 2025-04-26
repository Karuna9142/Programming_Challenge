package com.demo;

import java.util.Scanner;

public class CompoundInterest {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter principle, rate of interest,and time");
		int p = sc.nextInt();
		float rate = sc.nextFloat();
		float years = sc.nextFloat();
		
		double CI = p*Math.pow((1 + rate/100),years);
		System.out.println("Your compound interest is:- "+CI);
		

	}

}
