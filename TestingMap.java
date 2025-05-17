package com.collections;

import java.util.HashMap;
import java.util.Map;

public class TestingMap {

	public static void main(String[] args) {
		
		Map<String, Integer> map = new HashMap<>();
		map.put("karuna", 700);
		map.put("Smriti", 501);
		map.put("harshit", 250);
		map.put("abhishek", 800);
		
		System.out.println(map.size());
		System.out.println(map.get("karuna"));
		System.out.println(map.containsKey("harshit"));
		System.out.println(map.remove(1));

	}

}
