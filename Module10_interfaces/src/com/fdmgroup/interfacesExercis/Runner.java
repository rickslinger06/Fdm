package com.fdmgroup.interfacesExercis;


public class Runner{

	public static void main(String[] args) {
		
		Toy toy1 = new Toy();
		toy1.setName("Car");
		toy1.setPrice(20.0);
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
		
		//looping List of objects from 3 classes
		for(BasketItem item : basket1.getAllItems()){
		System.out.println(item);
		}
		
		System.out.println("========================================================");
		
		basket1.removeItem(laptop1);
		
		//looping again after removing 1 object from basket list
		for(BasketItem item : basket1.getAllItems()){
			System.out.println(item);
			}
		
		System.out.println("========================================================");
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
		
		//calling  getAllLowCalorieFoods() and looping list of food items
		
		for(Fooditem item : calorieCounter.getAllLowCalorieFoods()) {
			System.out.println(item);
	}
	}
}
