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
		String selection;

		do {
			displayMenu();
			selection = kb.next();

			switch (selection) {
			case "1":
				if (count == trucks.length) {
					System.out.print("Can not hold any more trucks. Press any key to return to main menu: ");
					kb.next();
					break;
				} else {
					newTruck(kb);
					break;
				}
			case "2":
				displayTrucks();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.next();
				System.out.println("");
				break;
			case "3":
				displayAverage();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.next();
				break;
			case "4":
				displayHighestRated();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.next();
				break;
			case "5":
				System.out.println("Thanks for using the foodtruck app, don't forget to rate us, too!");
				break;
			default:
				System.out.print("\nDid not recognize choice. Enter any key to return to main menu: ");
				kb.next();
			} // END OUTSIDE SWITCH
		} while (!selection.equals("5"));

		kb.close();
	}

	private void newTruck(Scanner kb) {
		int selection2;
		String name;
		String foodType;
		int rating;
		do {
			System.out.print("Enter name of food truck: ");
			name = kb.nextLine();

			System.out.print("\nWhat type of food does " + name + " serve?: ");
			foodType = kb.nextLine();

			System.out.print("\nWhat would you rate " + name + "?: ");
			rating = kb.nextInt();

			FoodTruck newTruck = new FoodTruck(name, foodType, rating);
			addTruck(newTruck);
			newTruck.setTRUCK_ID();

			if (count < trucks.length) {
				displayMenu2();
				selection2 = kb.nextInt();
				kb.nextLine();
				switch (selection2) {
				case 1:
					continue;
				case 2:
					break;
				} // END INSIDE SWITCH
			} else {
				System.out.print("All full up. Can not add any more trucks. Enter any key to return to main menu: ");
				kb.next();
				break;
			}
		} while (selection2 == 1); // end of loop
	}

	private void displayTrucks() {
		System.out.println("");
		for (FoodTruck truck : trucks) {
			if (truck != null) {
//				System.out.println("ID: " + truck.getTruckID() + "\tName: " + truck.getTruckName() + "\tFood Type: "
//						+ truck.getFoodType() + "\t\tRating: " + truck.getRating());
				System.out.println(truck.toString());
			}

		}
	}

	private void displayMenu() {
		System.out.print(
				"1. Add New Food Truck\n2. Show All Food Trucks\n3. Show Average Rating for All Trucks\n4. Show Highest Rated Truck(s)\n5. Quit Food Truck App\n--->");
	}

	private void displayMenu2() {
		System.out.print("1. Add another truck\n2. Return to main menu\n--->");
	}

	private void addTruck(FoodTruck truck) {
		trucks[count] = truck;
		count++;
	}

	private void displayAverage() {
		double totalRatings = 0.0;
		double averageRating = 0.0;
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				totalRatings += truck.getRating();
			}
		}
		averageRating = (totalRatings) / (count);
		System.out.println("Average rating for all food trucks is " + averageRating);

	}

	private void displayHighestRated() {
		int highest = 0;
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				if (truck.getRating() > highest) {
					highest = truck.getRating();
				}
			}
		}
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				if (truck.getRating() == highest) {
					System.out.println(truck.toString());
				}
			}
		}
	}
}
