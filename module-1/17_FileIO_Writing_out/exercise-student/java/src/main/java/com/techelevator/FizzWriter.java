package com.techelevator;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FizzWriter {

	public static void main(String[] args) {

		try (Scanner input = new Scanner(System.in)) {
			System.out.println("Location for FizzBuzz.txt");
			String filePath = input.nextLine();

			writingFizzBuzz(filePath);
		}

		File filePath = null;
		File fizzBuzz = new File(filePath + "/FizzBuzz.txt");

		String fizzBuzzFile = null;
		try (PrintWriter output = new PrintWriter(fizzBuzzFile)) {
				for (int i = 1; i < 301; i++) {
					if (i % 15 == 0) {
						output.println("FizzBuzz");
					} else if (i % 5 == 0) {
						output.println("Buzz");
					} else if (i % 3 == 0) {
						output.println("Fizz");
					} else if ((Integer.toString(i).contains("3")) && (Integer.toString(i).contains("5"))) {
						output.println("FizzBuzz");
					} else if (Integer.toString(i).contains("3")) {
						output.println("Fizz");
					} else if (Integer.toString(i).contains("5")) {
						output.println("Buzz");
					} else {
						output.println(i);
					}
					output.println(output);
				}
			} catch (FileNotFoundException e) {
				System.out.println("");
				System.exit(1);
			}

		}

	private static void writingFizzBuzz(String filePath) {
	}

}
