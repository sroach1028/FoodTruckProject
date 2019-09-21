package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {

	// FIELDS

	private static final int MAX_TRUCKS = 5;
	FoodTruck[] trucks = new FoodTruck[MAX_TRUCKS];
	private int count = 0;

	// MAIN METHOD
	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		System.out.println("Welcome to the Food Truck App!\n");
		fta.run();
	}
//                     WORKER METHODS

	private void run() {
		Scanner kb = new Scanner(System.in);
		int selection;
		int selection2;
		String name;
		String foodType;
		int rating;
		// TODO OUTSIDE do-while loop, print the menu, while selection is not "quit"
		do {
			displayMenu();
			selection = kb.nextInt();
			if (selection == 1) {
				if(count==trucks.length) {
					System.out.print("Can not hold any more trucks. Press any key to return to main menu: ");
					kb.next();
					continue;
				}
				do {
					System.out.print("Enter name of food truck: ");
					name = kb.next();

					System.out.print("\nWhat type of food does " + name + " serve?: ");
					foodType = kb.next();

					System.out.print("\nWhat would you rate " + name + "?: ");
					rating = kb.nextInt();

					FoodTruck newTruck = new FoodTruck(name, foodType, rating);
					addTruck(newTruck);
					newTruck.setTRUCK_ID();

					if (count < trucks.length) {
						displayMenu2();
						selection2 = kb.nextInt();
						if (selection2 == 1) {
							continue;
						}
						if (selection2 == 2) {
							break;
						}
					} else {
						System.out.print(
								"All full up. Can not add any more trucks. Enter any key to return to main menu: ");
						kb.next();
						break;
					}

				} while (selection2 == 1); // end of inside loop
			}
			if (selection == 2) {
				// TODO Display all foodtrucks, in order of highest rating
				displayTrucks();
				System.out.print("\nPress any key to return to main menu: ");
				kb.next();
				System.out.println("");
				continue;
				// continue to check OUTSIDE loop condition;

			}
			if (selection == 3) {
				System.out.println("Thanks for using the foodtruck app, don't forget to rate us too!");
			}

		} while (selection != 3);

		kb.close();
	}

	private void displayTrucks() {
		System.out.println("");
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				System.out.println("ID: " + truck.getTruckID() + "\tName: " + truck.getTruckName() + "\tFood Type: "
						+ truck.getFoodType() + "\t\tRating: " + truck.getRating());
			}

		}
	}

	private void displayMenu() {
		System.out.print("1. Add New Food Truck\n2. Show Food Trucks\n3. Quit Food Truck App\n: ");
	}

	private void displayMenu2() {
		System.out.println("1. Add another truck\n2. Return to main menu\n");
	}

	private void addTruck(FoodTruck truck) {
		trucks[count] = truck;
		count++;
	}
}
