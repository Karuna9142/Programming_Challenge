package com.recursion;

import java.util.Scanner;

public class FibonacciSeries {
	
	public static int fibonacci(int num) {
		
		if(num == 1) {
			return 0;
		}
		if(num == 2) {
			return 1;
		}
		return fibonacci(num - 1) + fibonacci(num - 2);
	
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        System.out.println("Enter the term -  ");
        int num = sc.nextInt();
        
        for(int i = 1; i<= num; i++) {
        	System.out.print(fibonacci(i) + " ");
        }
	}

}
