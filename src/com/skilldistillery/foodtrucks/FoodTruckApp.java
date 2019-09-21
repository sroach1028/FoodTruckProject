package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		FoodTruckApp fta = new FoodTruckApp();
		System.out.println("Welcome to the Food Truck App! Make a selection\n");
	
		
		//TODO OUTSIDE do-while loop, print the menu, while selection is not "quit"
		fta.displayMenu();
		int selection = kb.nextInt();
			
			if (selection == 1) {
				//TODO INSIDE do-while loop for adding new trucks to array
				// 
				// if array is full, notify the user, "enter any key to return to main menu", BREAK to check OUTSIDE condition
				// setTRUCK_ID
				// while array is not full, ask the user if they want to add another truck, or return to main menu
				//if they want to return, BREAK and check condition of OUTSIDE
				// 
			}
			if (selection == 2) {
				//TODO Display all foodtrucks, in order of highest rating
				System.out.print("Press any key to return to main menu: ");
				kb.nextLine();
				//continue to check OUTSIDE loop condition;
				
			
			
			}
			if (selection == 3) {
				System.out.println("Thanks for using the foodtruck app, don't forget to rate us too!");
			}
	// TODO OUTSIDE while condition--while selection is not 3
	
	
	
	
		kb.close();
	}
	
	
	
	
	// TODO add displaytrucks to show all the trucks curently in the array, DONT DISPLAY NULLS
	
	
	private void displayMenu() {
		System.out.print("1. Add New Food Truck\n2. Show Food Trucks\n3. Quit Food Truck App\n: ");
	}
	
	//TODO add another displaymenu, to prompt for adding another truck or returning to main menu

}
