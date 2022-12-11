package com.fdmgroup.castingExericses;

import java.util.ArrayList;

public class Runner{

	public static void main(String[] args) {
		
		Toy toy1 = new Toy(2, 10, "Toy Car", 15.99);
		
//		
		Laptop laptop1 = new Laptop();
		laptop1.setName("Macbook");
		laptop1.setPrice(1200);
//		
		Snack snack1 = new Snack();
		snack1.setName("Chips");
		snack1.setCalories(600);
//		
		
		Snack snack2 = new Snack();
		snack2.setName("Fruits");
		snack2.setCalories(200);
		
		
//		
		ReadyMeal readyMeal1 = new ReadyMeal();
		readyMeal1.setName("Fries");
		readyMeal1.setCalories(700);
		
		
		ReadyMeal readyMeal2 = new ReadyMeal();
		readyMeal2.setName("Fried Chicken");
		readyMeal2.setCalories(150);
		
		Basket basket1 = new Basket();
		CalorieCounter calorieCounter = new CalorieCounter();
//		
		//adding objects to Basket ArrayList
		basket1.addItem(toy1);
		basket1.addItem(laptop1);
		basket1.addItem(snack1);
		basket1.addItem(snack2);
		basket1.addItem(readyMeal1);
		basket1.addItem(readyMeal2);
		
	
		for(BasketItem item : basket1.getAllItems()){
		System.out.println(item);
		}
		
		System.out.println("========================================================1");
		
//		basket1.removeItem(laptop1);
		
		//looping again after removing 1 object from basket list
		for(BasketItem item : basket1.getAllItems()){
			System.out.println(item);
			}
		
		System.out.println("========================================================2");
		//Calling addLowCalorieFood() 
		
		calorieCounter.addLowCalorieFood(readyMeal1);
		calorieCounter.addLowCalorieFood(readyMeal2);
		calorieCounter.addLowCalorieFood(snack1);
		calorieCounter.addLowCalorieFood(snack2);
		
		//adding toy and laptop object// will not compile because it 
		//doesnt implement fooditem food item interface
		
//		calorieCounter.addLowCalorieFood(toy1);
//		calorieCounter.addLowCalorieFood(laptop1);
//		
		
		//calling  getAllLowCalorieFoods() and looping list oflowcalorieFood and adding it to the ArrayList of lowcaLorieFood object
		
		 ArrayList<Fooditem> lowCaloriefood = new ArrayList<>();
		
		lowCaloriefood.addAll(calorieCounter.getAllLowCalorieFoods());
		
		for(Fooditem food : lowCaloriefood) {
			if(food instanceof Snack) {
				Snack snack = (Snack) food;
				
			System.out.println(snack);
			
			}else if(food instanceof ReadyMeal) {
				ReadyMeal meal = (ReadyMeal) food;
				
			System.out.println("Name: "+ meal.getName()+ "," +"Cuisine Type: "+ meal.getCuisineType());
			
			}
		}

		System.out.println("========================================================3");
		
		//calling the removeHighCalorieFoodsFromBasket() method, passing in your Basket object and the number 500.
		
		calorieCounter.removeHighcalorieFoodsFromBasket(basket1, 500);
		
		ArrayList<BasketItem> sortedBasketItem = new ArrayList<>();
		
		sortedBasketItem.addAll(basket1.getAllItems());
		
		for(BasketItem item : sortedBasketItem) {
			
			System.out.println(item);
		}
	}
}
