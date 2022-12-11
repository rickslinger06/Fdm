package com.fdmgroup.interfacesExercis;

import java.util.ArrayList;

public class CalorieCounter {
	
	private ArrayList<Fooditem> foodItems = new ArrayList<>();
	
	public void addLowCalorieFood(Fooditem fooditem) {
		if(fooditem.getCalories() < 500) {
		foodItems.add(fooditem);}
	}
	
	public ArrayList<Fooditem> getAllLowCalorieFoods() {
		return foodItems;
		
	}
	
}
