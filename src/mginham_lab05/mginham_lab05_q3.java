package mginham_lab05;

import java.util.Scanner;

public class mginham_lab05_q3 {

	// Methods //
	public static void displayStudentInfo() {
		// Display information & question to user
		System.out.println("********************************"
					   + "\nES1036: Lab 05 Q3"
					   + "\n        Rectangle Class"
					   + "\nDate: November 6, 2018"
					   + "\nName: Megan Ginham"
					   + "\nStudent Number: 251029381"
					   + "\nMission: Scale and print a"
					   + "\n         rectangle"
					   + "\n********************************");
	} // end displayStudentInfo
	public static void printMenuOptions() {
		System.out.println("\na. Scale"
						 + "\nb. Print"
						 + "\nc. Exit");
	} // end printMenu
	
	// MAIN //
	public static void main(String[] args) {
		// Declare and initialize variables
		Scanner input = new Scanner(System.in);
		double x1 = 0, y1 = 0, x2 = 0, y2 = 0, scale = 0;
		char menuChoice = 0;
		
		// Prompt user for coordinate input (assume user will input double values)
		System.out.println("\n** Rectangle **");
		System.out.println("Please enter x1: ");
			x1 = input.nextDouble();
		System.out.println("Please enter y1: ");
			y1 = input.nextDouble();
		System.out.println("Please enter x2: ");
			x2 = input.nextDouble();
		System.out.println("Please enter y2: ");
			y2 = input.nextDouble();
		
		// Create object rectangle based on user input
		Rectangle r = new Rectangle(x1, y1, x2, y2);
			
		do {
			// Display menu
			printMenuOptions();
			
			// Prompt user for input
			System.out.println("Please enter a choice: ");
				menuChoice = input.next().charAt(0);
			
			while(menuChoice < 97 || menuChoice > 99) {
				System.out.print("Invalid input! Please try again: ");
					menuChoice = input.next().charAt(0);
			} // loop until input is a valid option
			
			switch (menuChoice) {
				case 'a': // Scale
					System.out.println("\nPlease enter a scale: ");
						scale = input.nextDouble();
			
					r.scale(scale);
				break;
				case 'b': // Print
					r.print();
				break;
				case 'c': // Exit
					System.out.println("\nGoodbye!");
				break;
			}
		} while(menuChoice != 'c');
		
		input.close();
	} // end main

} // end class
