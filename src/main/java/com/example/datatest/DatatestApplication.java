package com.example.datatest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

@SpringBootApplication
public class DatatestApplication {

	public static void main(String[] args) {
		SpringApplication.run(DatatestApplication.class, args);
		writeLogToFile();
	}

	public static void writeLogToFile() {
		try {
			FileWriter myWriter = new FileWriter("filename.txt");
			myWriter.write("\n");
			myWriter.write("Files in Java might be tricky, but it is fun enough!!");
			myWriter.write("\n");
			myWriter.close();
			System.out.println("Successfully wrote to the file.");
		} catch (IOException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
	}
}
