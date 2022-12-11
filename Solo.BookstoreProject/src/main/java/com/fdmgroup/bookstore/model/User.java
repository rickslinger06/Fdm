package com.fdmgroup.bookstore.model;

import java.util.List;

public class User {

	int usedId;
	String firstName;
	String lastName;
	String userName;
	String password;
	String email;
	List<Order> orders;
	
	
	public User(int usedId, String firstName, String lastName, String userName, String password, String email,
			List<Order> orders) {
		super();
		this.usedId = usedId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.userName = userName;
		this.password = password;
		this.email = email;
		this.orders = orders;
	}
	public int getUsedId() {
		return usedId;
	}
	public void setUsedId(int usedId) {
		this.usedId = usedId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public List<Order> getOrders() {
		return orders;
	}
	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}
	
	@Override
	public String toString() {
		return "User [usedId=" + usedId + ", firstName=" + firstName + ", lastName=" + lastName + ", userName="
				+ userName + ", password=" + password + ", email=" + email + ", orders=" + orders + "]";
	}
	
	
	
	
}
