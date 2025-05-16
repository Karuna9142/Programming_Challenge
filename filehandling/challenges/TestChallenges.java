package com.filehandling.challenges;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class TestChallenges {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter the name of the file you wish");
		String fileName = sc.next();
		
		try (FileReader reader = new FileReader(fileName)) {
			int read;
			while ((read = reader.read()) != -1) {
				System.out.print((char)read);
			}
		}
		catch(FileNotFoundException e) {
			System.out.printf("%s not found", fileName);
		}
		catch(IOException e) {
			System.out.printf("Exception Occured : %s", e);
			e.getMessage();
		}

	}

}
