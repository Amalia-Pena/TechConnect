package com.techelevator;

/*
 In case you've ever pondered how much you weight on Mars, here's the calculation:
 	Wm = We * 0.378
 	where 'Wm' is the weight on Mars, and 'We' is the weight on Earth
 
Write a command line program which accepts a series of Earth weights from the user  
and displays each Earth weight as itself, and its Martian equivalent.

 $ MartianWeight 
 
Enter a series of Earth weights (space-separated): 98 235 185
 
 98 lbs. on Earth, is 37 lbs. on Mars.
 235 lbs. on Earth, is 88 lbs. on Mars.
 185 lbs. on Earth, is 69 lbs. on Mars. 
 */
public class MartianWeight {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Welcome to the Earth to Mars Conversion Calculator!");

		double weightOne = 0;
		double weightTwo = 0;
		double weightThree = 0;

		String weightInput = "";


		System.out.println("Enter Weight One:");
		weightInput = scanner.nextLine();
		weightOne = Double.parseDouble(weightInput);


		System.out.println("Enter Weight Two:");
		weightInput = scanner.nextLine();
		weightTwo = Double.parseDouble(weightInput);


		System.out.println("Enter Weight Three:");
		weightInput = scanner.nextLine();
		weightThree = Double.parseDouble(weightInput);

		System.out.printf(" %.1f lbs. on Earth is %.1f lbs. on Mars. \n", weightOne, (weightOne * .378) );
		System.out.printf(" %.1f lbs. on Earth is %.1f lbs. on Mars. \n", weightTwo, (weightTwo * .378) );
		System.out.printf(" %.1f lbs. on Earth is %.1f lbs. on Mars. \n", weightThree, (weightThree * .378) );

	}

}
