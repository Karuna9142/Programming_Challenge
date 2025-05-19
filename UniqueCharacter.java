package com.collections.challenges;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class UniqueCharacter {

	public static void main(String[] args) {
		
		Set<Character> u1 = new HashSet<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your string - ");
		String userStr = sc.next();
		
		for(char ch : userStr.toCharArray()) {
			u1.add(ch);
		}
        System.out.printf("Your String has %d unique character ", u1.size());
	}

}
