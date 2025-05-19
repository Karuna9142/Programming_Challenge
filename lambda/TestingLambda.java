package com.lambda;

public class TestingLambda {

	public static void main(String[] args) {
	
		TestingLambda l1 = new TestingLambda();
		int sum = l1.sum(8, 40);
		
		l1.printString("This is the best course");

	}

	public void printString(String toPrint) {
		System.out.println(toPrint);
	}
	public int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}
}
