package com.demo;

import java.util.Scanner;

public class Numbers {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println(num+" is positive number");
		}
		else if(num<0) {
			System.out.println(num+ " is negtive number");
		}
		else {
			System.out.println(num+" is zero");
		}
	}

}
