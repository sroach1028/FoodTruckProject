package com.skilldistillery.foodtrucks;

import java.util.Scanner;

public class FoodTruckApp {


	private static final int MAX_TRUCKS = 5;
	FoodTruck[] trucks = new FoodTruck[MAX_TRUCKS];
	private int count = 0;

	public static void main(String[] args) {
		FoodTruckApp fta = new FoodTruckApp();
		System.out.println("\nWelcome to the Food Truck App!\n" + "-----------------------------------");
		fta.run();
	}
//                     WORKER METHODS

	private void run() {
		Scanner kb = new Scanner(System.in);
		String selection;

		do {
			displayMenu();
			selection = kb.nextLine();

			switch (selection) {
			case "1":
				if (count == trucks.length) {
					System.out.println("Can not hold any more trucks. Press any key to return to main menu: ");
					kb.nextLine();
					break;
				} else {
					newTruck(kb);
					break;
				}
			case "2":
				displayTrucks();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.nextLine();
				System.out.println("");
				break;
			case "3":
				displayAverage();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.nextLine();
				break;
			case "4":
				displayHighestRated();
				System.out.print("\nEnter any key to return to main menu: ");
				kb.nextLine();
				break;
			case "5":
				System.out.println("Thanks for using the foodtruck app, don't forget to rate us, too!");
				break;
			default:
				System.out.print("\nDid not recognize choice. Enter any key to return to main menu: ");
				kb.nextLine();
			}
		} while (!selection.equals("5"));

		kb.close();
	} // END OF RUN()

	private void displayMenu() {
		System.out.print(
				"\n1. Add New Food Truck\n2. Show All Food Trucks\n3. Show Average Rating for All Trucks\n4. Show Highest Rated Truck(s)\n5. Quit Food Truck App\n--->");
	}

	private void displayMenu2() {
		System.out.print("\n1. Add another truck\n2. Return to main menu\n--->");
	}

	private void newTruck(Scanner kb) {
		int selection2;
		String name;
		String foodType;
		int rating;
		do {
			System.out.println("Enter name of food truck, or enter 'q' to return to the main menu: ");
			name = kb.nextLine();
			if (checkForQuit(name)) {
				break;
			}

			System.out.println("What type of food does " + name + " serve?: ");
			foodType = kb.nextLine();

			System.out.print("What would you rate " + name + "?: ");
			rating = kb.nextInt();
			kb.nextLine();

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
				}
			} else {
				System.out.print("All full up. Can not add any more trucks. Enter any key to return to main menu: ");
				kb.nextLine();
				break;
			}
		} while (selection2 == 1); // end of loop
	} // END OF NEWTRUCK()

	private void addTruck(FoodTruck truck) {
		trucks[count] = truck;
		count++;
	}

	private void displayTrucks() {
		System.out.println("");
		for (FoodTruck truck : trucks) {
			if (truck != null) {
				System.out.println(truck.toString());
			}

		}
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

	boolean checkForQuit(String name) {
		boolean result = false;
		switch (name) {
		case "q":
			result = true;
			break;
		case "Q":
			result = true;
			break;
		case "quit":
			result = true;
			break;
		case "Quit":
			result = true;
			break;
		case "QUIT":
			result = true;
			break;
		}

		return result;
	}
}
