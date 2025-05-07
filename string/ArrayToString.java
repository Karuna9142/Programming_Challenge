package com.string;

public class ArrayToString {

	public static void main(String[] args) {
		String [] arr = {"This", "is", "the","best", "Java","course", " in", "the","Internet"};

		StringBuilder sb = new StringBuilder();
		for(String s1: arr) {
			sb.append(s1).append(" ");
		}
		System.out.println(sb);
	}

}
