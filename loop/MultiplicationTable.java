package com.loop;

import java.util.Scanner;

public class MultiplicationTable {
	
	public static void printTable(int num) {
		int i = 1;
		while(i<=10) {
			System.out.println(num+ " x " +i+ " = " +num*i);
			i++;
		}

	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int num = sc.nextInt();
		
		printTable(num);
		

	}

}
