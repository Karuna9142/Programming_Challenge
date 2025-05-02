package com.dowhileAndForloop;

import java.util.Scanner;

import com.array.ArrayUtility;

public class OccurancesForEach {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Welcome to finding occurances");
		int arr[] = ArrayUtility.inputArray();
		
		System.out.println("Enter a number to search");
		int num = sc.nextInt();
		int occ = countOccurences(arr, num);
		System.out.println("your element was found " + occ + " times");

	}
	public static int countOccurences(int arr[], int nums) {
		int occ = 0;
		for(int num : arr) {
			if(num == nums) {
				occ++;
			}
		}
		return occ;
	}

}
