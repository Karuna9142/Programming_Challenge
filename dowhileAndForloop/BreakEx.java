package com.dowhileAndForloop;

import java.util.Scanner;

public class BreakEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("Enter a command");
			String cmd = sc.next();
			
			if(cmd.equals("exit")) {
				break;
			}
		}
		System.out.println("You have successfully exited");

	}

}
