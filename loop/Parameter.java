package com.loop;

public class Parameter {
	
	public static int sumTwoNumber(int first, int second) {
		System.out.println("First number received:- "+first);
		System.out.println("Second number received:- "+second);
		int sum = first + second;
		return sum;
	}

	public static void main(String[] args) {
		System.out.println(sumTwoNumber(4,6));
		System.out.println(sumTwoNumber(5,2));
		System.out.println(sumTwoNumber(34,9));

	}

}
