package com.ternaryoperator;

import java.util.Scanner;

public class SwitchStatementEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the name of weak - ");
		String weak = sc.nextLine();
		
		switch(weak) {
		case "1" : System.out.println("Monday");
		           break;
		case "2" : System.out.println("Tuesday");
                   break;
		case "3" : System.out.println("Wednesday");
                   break;
	    case "4" : System.out.println("Thrusday");
                   break;
        case "5" : System.out.println("Friday");
                   break;
        case "6" : System.out.println("Saturday");
                   break;
        case "7" : System.out.println("Sunday");
                   break;
        default: System.out.println("Invalid input");
        


		}

	}

}
