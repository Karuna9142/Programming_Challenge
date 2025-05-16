package com.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListTraversing {

	public static void main(String[] args) {
		
		List<Integer> l1 = new ArrayList<Integer>();
		l1.add(5);
		l1.add(7);
		l1.add(9);
		l1.add(8);
		
		System.out.println("Loop through an ArrayList using a for loop:- ");
		for(int i = 0; i<l1.size(); i++) {
			System.out.println(l1.get(i));
		}
		
		System.out.println("Loop throght an arraylist using while loop ");
		int i = 0;
		while(i<l1.size()) {
			System.out.println(l1.get(i));
			i++;
		}
		System.out.println("Loop through an ArrayList using a  advanced for loop:- ");
		for(Integer in:l1) {
			System.out.println(in);
		}
		
		System.out.println("Loop through an array list using iterator");
		Iterator it = l1.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
