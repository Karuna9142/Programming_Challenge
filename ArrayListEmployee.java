package com.collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEmployee {

	public static void main(String[] args) {
		
		ArrayList<Employee> e1 = new ArrayList<Employee>();
		Scanner sc = new Scanner(System.in);
		
		e1.add(new Employee(1,"Pihu", "Delhi"));
		e1.add(new Employee(2,"Ritu", "Patna"));
		e1.add(new Employee(3,"china", "Ranchi"));
		
		for(Employee emp:e1) {
			System.out.println(e1);
		}

	}

}
