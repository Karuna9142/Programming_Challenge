package com.filehandling;

import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriter {

	public static void main(String[] args) {
		
		String fileName = "java-course.txt";
		try (FileWriter writer = new FileWriter(fileName))
		{
			writer.write("This is the best java course ");
			writer.flush();
			System.out.println("File written successfully");
		}
		catch(IOException e) {
			System.out.printf("Exception occurred %s \n");
			e.getMessage();
		}

	}

}
