package com.oops.polymorphism.challenges;

public class Calculator {
	
	public int add(int a, int b) {
		return a +b;
	}

	public int add(int a, int b, int c) {
		return a + b + c;
	}
	
	public double add(double a, double b) {
		return a + b;
	}
	
	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		
		System.out.println(c1.add(4, 30));
		System.out.println(c1.add(6, 15, 30));
		System.out.println(c1.add(5.5, 4.6));
	}
}
