package com.collections;

import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		
		//Creating a map
		TreeMap<Integer, String> tmp = new TreeMap<Integer,String>();
		tmp.put(4, "Priya");
		tmp.put(5, "baby");
		tmp.put(6, "Neha");
		tmp.put(7, "Priti");
		
		System.out.println("TreeMap:- "+tmp);
		
		//Retrieve value
		String value = tmp.get(5);
		System.out.println("Value for key 5:- "+value);
		
		//Removing an entry
		tmp.remove(4);
		System.out.println("TreeMap after removing key 5:- "+tmp);

		//Iterating through keySet
		System.out.println("Keys");
		for(Integer key: tmp.keySet()) {
			System.out.println(key);
		}
	}

}
