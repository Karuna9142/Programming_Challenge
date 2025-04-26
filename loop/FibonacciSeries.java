package com.loop;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static  void fibonaci(int num) {
		
		if(num < 0) return;
		System.out.println("0 ");
		if(num == 0) return;
		System.out.println("1 ");
		
		int first  = 0, second = 1;
		while(first + second <= num) {
		    int third = first + second;
		    System.out.println(third+ " ");
		    first = second;
		    second = third;
		}
		
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a term:- ");
		int num = sc.nextInt();
		
		fibonaci(num);

	}

}
