package com.fdmgroup.castingExericses;

public class ReadyMeal implements BasketItem, Fooditem {

	private String cuisineType;
	private int calories;
	private String name;
	private double price;

	@Override
	public int getCalories() {
		// TODO Auto-generated method stub
		return calories;
	}

	@Override
	public void setCalories(int calories) {
		this.calories =calories;
		
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public void setName(String name) {
		this.name =name;
		
	}

	@Override
	public double getPrice() {
		// TODO Auto-generated method stub
		return price;
	}

	@Override
	public void setPrice(double price) {
		this.price = price;
		
	}

	public String getCuisineType() {
		return cuisineType;
	}

	public void setCuisineType(String cuisineType) {
		this.cuisineType = cuisineType;
	}

	@Override
	public String toString() {
		return "ReadyMeal [cuisineType=" + cuisineType + ", calories=" + calories + ", name=" + name + ", price="
				+ price + "]";
	}

	
	

}
