package com.collections;

import java.util.ArrayList;
import java.util.List;

public class TestingList {

	public static void main(String[] args) {
		
		List l1 = new ArrayList();
		l1.add("karuna");
		l1.add("jain");
		
		
		l1.add(1, "Priya");
		l1.remove(0);
		
		if(l1.contains("Priya")) {
			System.out.println(l1.indexOf("Priya"));
		}
		//System.out.println(l1.get(0));
		for(int i = 0; i < l1.size(); i++) {
			System.out.println(l1.get(i));
		}

	}

}
