package com.techelevator;

// A command line program that converts meters to feet and vice-versa.
// The foot to meter conversion formula is:
// m = f * 0.3048
// The meter to foot conversion formula is:
// f = m * 3.2808399

import java.sql.SQLOutput;

import java.util.Scanner;

public class LinearConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the meters/feet conversion calculator!");

		System.out.println("Please enter the length:");
		int length = input.nextInt();
		input.nextLine();

		System.out.println("Is the measurement in (m)eter, or (f)eet? f");
		String unitOfLength = input.nextLine();
		input.nextLine();

		double resultLength = 0;

		if(unitOfLength.equalsIgnoreCase("M") ) {
			// convert from meters to feet
			resultLength = length * 3.2808399;

		} else if (unitOfLength.equalsIgnoreCase("F")) {
			// convert from feet to meters
			resultLength = length * 0.3048;

		} else {
			// The input was invalid
			System.out.println("You messed up!");
		}

		System.out.println(resultLength);

	}

}
