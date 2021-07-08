package com.techelevator;

import java.io.File;
import java.util.Scanner;
import java.io.FileNotFoundException;

public class WordSearch {

	public static void main(String[] args) throws FileNotFoundException {

		printApplicationBanner();

		File inputFile = getInputFileFromUser();
		String word = wordToSearch();
		searchItem(inputFile, word);
	}


		private static void printApplicationBanner () {
			System.out.println("********************");
			System.out.println("WordSearch Validator");
			System.out.println("********************");
			System.out.println();

		}

		private static File getInputFileFromUser () {
			@SuppressWarnings("resource")
			Scanner userInput = new Scanner(System.in);
			System.out.println("What is the fully qualified name of the file that should be searched?");
			String path = userInput.nextLine();

			File inputFile = new File(path);
			if (inputFile.exists() == false) {  // checks for existence of a file
				System.out.println(path + " does not exist");
				System.exit(1); // ends the program
			} else if (inputFile.isFile() == false) {
				System.out.println(path + " is not a file");
				System.exit(1); // ends the program
			}
			return inputFile;
		}

		public static String wordToSearch () {
			@SuppressWarnings("resource")

			Scanner wordInput = new Scanner(System.in);
			System.out.println("Please enter a word to search");
			String searchWord = wordInput.nextLine();

			return searchWord;

		}

		public static String searchItem(File inputFile, String searchWord){

			Scanner caseSensitiveQ = new Scanner(System.in);
			System.out.println("Would you like your search to be case sensitive? (Y)es or (N)o ");
			String yesOrNo = caseSensitiveQ.nextLine().toLowerCase().substring(0, 1);

			try (Scanner input = new Scanner(inputFile)) {
				int x = 0;

				while (input.hasNextLine()) {
					if (yesOrNo.equals("n")) {
						x++;
						String line = input.nextLine();
						if (line.toLowerCase().contains(searchWord.toLowerCase())) {
							System.out.println(x + ") " + line);
						} else {
						}
					} else {
						String line = input.nextLine();
						if (line.contains(searchWord)) {
							System.out.println(x + ") " + line);
						}
					}

				}
			} catch (FileNotFoundException e) {
				System.out.println("File doesn't exist");
			}
			return "";
		}
	}



















