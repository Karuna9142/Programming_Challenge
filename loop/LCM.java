package com.loop;

import java.util.Scanner;

public class LCM {
	public static int lcm(int first, int second) {
		int i = 1;
		while(true) {
			int factor = first*i;
			if(factor % second == 0) {
				return factor;
			}
			i++;
		}
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number:- ");
		int first = sc.nextInt();
		
		System.out.println("Enter second number:- ");
		int second = sc.nextInt();
		
		int lcm = lcm(first, second);
		System.out.println("LCM pf the two number is:- "+lcm);
	}

}
