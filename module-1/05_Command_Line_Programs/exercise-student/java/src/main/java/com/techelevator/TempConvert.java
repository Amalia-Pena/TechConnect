package com.techelevator;

import java.util.Scanner;

// A command line program which prompts the user to enter the temperature and whether it is Celsius or Fahrenheit
// The Fahrenheit to Celsius conversion formula is:
//Tc = (Tf - 32) / 1.8
//The Celsius to Fahrenheit conversion formula is:
//Tf = Tc * 1.8 + 32

public class TempConvert {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Welcome to the Temperature Conversion Calculator!");

		System.out.println("Please enter the temperature:");
		int temperature = input.nextInt();
		input.nextLine();

		System.out.print("Is the temperature in (C)elsius, or (F)ahrenheit?");
		String unitOfTemp = input.nextLine();
		double resultTemp = 0.0;

		if(unitOfTemp.equalsIgnoreCase("C") ){
			// convert from celsuis to Fahrenheit
			resultTemp = temperature * 1.8 + 32;

		} else if(unitOfTemp.equalsIgnoreCase("F")) {
			// convert from F to C
			resultTemp = (temperature - 32) / 1.8;

		} else {
			// The input was invalid
			System.out.println("You messed up!");
		}

		System.out.println(resultTemp);

	}

}
