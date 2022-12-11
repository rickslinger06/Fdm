package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class CalorieCounter {
	
	
	private ArrayList<Fooditem> lowCalorieFoods = new ArrayList<>();
	
	
	public void addLowCalorieFood(Fooditem fooditem) {
		if(fooditem.getCalories() < 500) {
		lowCalorieFoods.add(fooditem);}
	}
	
	public ArrayList<Fooditem> getAllLowCalorieFoods() {
		return lowCalorieFoods;
		
	}
	
	
	public void removeHighcalorieFoodsFromBasket(Basket basket, int calories) {
		
		ArrayList<BasketItem> basketItem = new ArrayList<>();
		basketItem.addAll(basket.getAllItems());
		
		for(BasketItem item : basketItem){
		if(item instanceof Fooditem) {
			Fooditem food = (Fooditem) item;	
			if(food.getCalories() > calories) {
				basket.removeItem(item);
			}
			
		}				
	
		}
	}
}