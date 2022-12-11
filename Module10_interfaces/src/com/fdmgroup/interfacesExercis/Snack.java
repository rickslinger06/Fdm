package com.fdmgroup.interfacesExercis;

public class Snack implements BasketItem,Fooditem{
	
	private int fatContent;
	private int sugarContent;
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
		this.calories = calories;
	}
	@Override
	public String getName() {
		// TODO Auto-generated method stub
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
		this.price =price;
		
	}
	public int getFatContent() {
		return fatContent;
	}
	public void setFatContent(int fatContent) {
		this.fatContent = fatContent;
	}
	public int getSugarContent() {
		return sugarContent;
	}
	public void setSugarContent(int sugarContent) {
		this.sugarContent = sugarContent;
	}
	@Override
	public String toString() {
		return "Snack [fatContent=" + fatContent + ", sugarContent=" + sugarContent + ", calories=" + calories
				+ ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	

	
}
