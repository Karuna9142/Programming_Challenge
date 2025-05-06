package com.dowhileAndForloop;

import com.array.ArrayUtility;

public class PrintEvenContinueEx {

	public static void main(String[] args) {
		
		int arr[] = ArrayUtility.inputArray();
		
		int sum = 0;
		
		for(int num:arr) {
			if(num % 2 != 0) {
				continue;
			}
			else
			{
				sum += num;
			}
		}

		System.out.println("Sum of all even number is:- "+sum);
	}

}
