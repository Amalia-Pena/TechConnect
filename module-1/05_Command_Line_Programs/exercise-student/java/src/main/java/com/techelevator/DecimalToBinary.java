package com.techelevator;

// A command-line program which prompts the user for a series of decimal integer values separated by spaces. Each decimal integer is displayed along with its equivalent binary value.
//Please enter in a series of decimal values
//
//460 in binary is 111001100
//8218 in binary is 10000000011010
//1 in binary is 1
//31313 in binary is 111101001010001
//987654321 in binary is 111010110111100110100010110001

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Binary representation of 460:");
		System.out.println(Integer.toBinaryString(460));

		System.out.println("Binary representation of 8218:");
		System.out.println(Integer.toBinaryString(8218));

		System.out.println("Binary representation of 1:");
		System.out.println(Integer.toBinaryString(1));

		System.out.println("Binary representation of 31313:");
		System.out.println(Integer.toBinaryString(31313));

		System.out.println("Binary representation of 987654321:");
		System.out.println(Integer.toBinaryString(987654321));


	}

}
