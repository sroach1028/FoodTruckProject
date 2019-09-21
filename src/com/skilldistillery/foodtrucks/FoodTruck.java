package com.skilldistillery.foodtrucks;

public class FoodTruck {
	private static int TRUCK_ID = 1;
	private String truckName;
	private String foodType;
	private int rating;
	
	public FoodTruck() {
		
	}
	public FoodTruck(String truckName, String foodType, int rating) {
		this.truckName = truckName;
		this.foodType = foodType;
		this.rating = rating;
	
	}
	public static int getTRUCK_ID() {
		return TRUCK_ID;
	}
	public static void setTRUCK_ID() {
		TRUCK_ID ++;
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
	
	// TODO s
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("FoodTruck [truckName=").append(truckName).append(", foodType=").append(foodType)
				.append(", rating=").append(rating).append("]");
		return builder.toString();
	}
	
	
	
	



}
