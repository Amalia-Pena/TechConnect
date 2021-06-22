package com.techelevator;

// A command-line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number:

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci sequence calculator!");


		int sumOfAll = 0;
		int numberOne = 0;
		int numberTwo = 0;

		String upperBoundSequence = "0, 1";

		System.out.println("Please enter a number (Fibonacci):");
		int numberUpperBound = input.nextInt();

		System.out.print(upperBoundSequence);
		while (sumOfAll < numberUpperBound) {
			sumOfAll = numberOne + numberTwo;

		}

	}
}
