package com.recursion;

import java.util.Scanner;

public class Polndrome {
	
	public static boolean isPalindrome(String str) {
		if(str.length() <= 1)
			return true;
		
		int lastPos = str.length() - 1;
		if(str.charAt(0) != str.charAt(lastPos)) {
			return false;
		}
		String newStr = str.substring(1, lastPos);
		return isPalindrome(newStr);
	}

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a String - ");
		String str  = sc.nextLine();
		
		System.out.print(isPalindrome(str)? "is palindrome" : " not palindrome");
		
		
		
	}

}
