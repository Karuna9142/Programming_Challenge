package com.dowhileAndForloop;

import java.util.Scanner;

public class DoWhileEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int age = -1;
		do {
			System.out.print("Enter your age : - ");
			age = sc.nextInt();
		} while(age < 0 || age >100);
		System.out.print("Your age is:- "+age);
		

	}

}
