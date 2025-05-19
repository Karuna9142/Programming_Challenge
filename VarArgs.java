package com.collections.challenges;

public class VarArgs {

	public static String concatenate(String...strs) {
		StringBuilder sb = new StringBuilder();
		for(String str : strs) {
			sb.append(str).append(" ");
		}
		
		return sb.toString();
	}
	public static void main(String[] args) {
		System.out.println(concatenate("Karuna"));
		System.out.println(concatenate("Abhishek", "Mishra"));
		System.out.println(concatenate("Kunal"));

	}

}
