package com.fdmgroup.week2;

public abstract class Order {
	
	int id;
	String type;
	OrderStatus status;
	public Order(int id, String type, OrderStatus status) {
		super();
		this.id = id;
		this.type = type;
		this.status = status;
	}
	
	
	
	
	
	public Order(int id, String type) {
		super();
		this.id = id;
		this.type = type;
	}





	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public OrderStatus getStatus() {
		return status;
	}
	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	
	

}
