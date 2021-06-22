package com.techelevator;

// A command-line program which prompts the user for an integer value and display the Fibonacci sequence leading up to that number:

import java.util.Scanner;

public class Fibonacci {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Fibonacci sequence calculator!");


		System.out.println("Please enter a number:");
		int count, numberOne = 0, numberTwo = 1;

		count = input.nextInt();
		input.close();

		System.out.println("Fibonacci Series of " + count + " numbers:");

		int i = 1;
		while (i <= count) {
			System.out.print(numberOne + " ");
			int sum = numberOne + numberTwo;
			numberOne = numberTwo;
			numberTwo = sum;
			i++;
		}

	}
}






