package com.fdmgroup.week2;

public abstract class Coffee implements iDrink{
	
	String CofeeType;
	double price;
	Order order;
	
	
	
	
	
	
	public Coffee(String cofeeType, double price, Order order) {
		super();
		CofeeType = cofeeType;
		this.price = price;
		this.order = order;
	}


	public abstract void ingredients();


	public String getCofeeType() {
		return CofeeType;
	}


	public void setCofeeType(String cofeeType) {
		CofeeType = cofeeType;
	}


	public double getPrice() {
		return price;
	}


	public void setPrice(double price) {
		this.price = price;
	}


	public Order getOrder() {
		return order;
	}


	public void setOrder(Order order) {
		this.order = order;
	}
	
	
	

}
