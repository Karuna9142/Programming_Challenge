package com.collections;

import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {
		
		Vector<String> v1 = new Vector<String>();
		v1.add("A");
		v1.add("B");
		v1.add("C");
		v1.add("D");
		
		System.out.println(v1);
		v1.addElement("X");
		v1.addElement("Y");
		v1.addElement("Z");
		
		System.out.println("Elements are : - "+v1);

	}

}
