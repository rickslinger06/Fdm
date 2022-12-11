package com.fdmgroup.castingExericses;

public class Toy implements BasketItem {
	
	private int minAge;
	private int maxAge;
	private String name;
	private double price;
	
	
	
	public Toy(int minAge, int maxAge, String name, double price) {
		super();
		this.minAge = minAge;
		this.maxAge = maxAge;
		this.name = name;
		this.price = price;
	}
	//implemented methods inherited from BasketItem interface
	
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
		this.price =price;
		
	}
	public int getMinAge() {
		return minAge;
	}
	public void setMinAge(int minAge) {
		this.minAge = minAge;
	}
	public int getMaxAge() {
		return maxAge;
	}
	public void setMaxAge(int maxAge) {
		this.maxAge = maxAge;
	}
	@Override
	public String toString() {
		return "Toy [minAge=" + minAge + ", maxAge=" + maxAge + ", name=" + name + ", price=" + price + "]";
	}
	
	
	
	
	
	
	

}
