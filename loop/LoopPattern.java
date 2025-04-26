package com.loop;

import java.util.Scanner;

public class LoopPattern {
	
	public static void halfPyramid(int rows) {
		for(int i = 1; i<=rows; i++) {
			for(int j = 1; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void rightHalfPyramid(int rows) {
		for(int i = 1; i<=rows; i++) {
			for(int j = rows; j>=i; j--) {
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
	public static void reversePattern(int rows) {
		for(int i = 1; i<=rows; i++) {
			for(int j = rows-1; j>=i; j--) {
				System.out.print(" ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no. of rows- ");
		int rows = sc.nextInt();
		
		halfPyramid(rows);
		System.out.println();
		rightHalfPyramid(rows);
		
		System.out.println(" ");
		reversePattern(rows);
	}

}
