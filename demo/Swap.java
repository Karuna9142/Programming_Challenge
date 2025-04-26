package com.demo;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int x = sc.nextInt();
		
		System.out.println("Enter second number:- ");
		int y = sc.nextInt();
		
		int z;
		System.out.println("Before Swapping \n  x = " +x+ " and y = "+y);
		z = x;
		x = y;
		y = z;
		
		System.out.println("After Swapping  \n x = "+x+ " y = "+y);

	}

}
