package com.dowhileAndForloop;

import com.array.ArrayUtility;

public class SumPositive {

	public static void main(String[] args) {
		
		System.out.println("Welcome to adding positive number:- ");
		int arr[]= ArrayUtility.inputArray();
		
		int sum = 0;
		for(int num : arr) {
			if(num < 0) {
				continue;
			}
			else {
				sum = sum +num;
			}
		}
		
		System.out.println("Sum of all positive number is:- "+sum);

	}

}
