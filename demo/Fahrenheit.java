package com.demo;

import java.util.Scanner;

public class Fahrenheit {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter temperature in fahrenheit:- ");
		float fh = sc.nextFloat();
		float celsius = (fh-32)*5/9;
		
		System.out.println("Your temperature in celsius is:- "+celsius+ "C");

	}

}
