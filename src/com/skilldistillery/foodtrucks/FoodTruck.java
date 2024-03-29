package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private static int TRUCK_ID = 1001;
	private String truckName;
	private String foodType;
	private int rating;
	private int truckID;

	public FoodTruck() {

	}

	public FoodTruck(String truckName, String foodType, int rating) {
		this(truckName, foodType, rating, TRUCK_ID);

	}

	public FoodTruck(String truckName, String foodType, int rating, int truckId) {
		this.truckID = truckId;
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	}

	public int getTruckID() {
		return truckID;
	}

	public void setTruckID(int truckID) {
		this.truckID = truckID;
	}

	public void setTRUCK_ID() {
		TRUCK_ID++;

	}

	public String getTruckName() {
		return truckName;
	}

	public void setTruckName(String truckName) {
		this.truckName = truckName;
	}

	public String getFoodType() {
		return foodType;
	}

	public void setFoodType(String foodType) {
		this.foodType = foodType;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	// TODO

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck# ").append(truckID).append("\t Truck Name: ").append(truckName)
				.append("\t Food Type: ").append(foodType).append("\t Rating: ").append(rating);
		return builder.toString();
	}

}
