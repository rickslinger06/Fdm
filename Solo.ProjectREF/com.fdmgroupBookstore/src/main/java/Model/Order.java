package Model;

import java.time.LocalDateTime;
import java.util.Objects;



public class Order {
	private int orderId;
	private Book bookOrdered;
	private User user;
	private LocalDateTime orderDateTime;
	
	public Order() {
		
	}
	
	public Order(int orderId, Book bookOrdered, User user, LocalDateTime orderDateTime) {
		this.orderId = orderId;
		this.bookOrdered = bookOrdered;
		this.user = user;
		this.orderDateTime = orderDateTime;
	}
	
	
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public Book getBookOrdered() {
		return bookOrdered;
	}
	public void setBookOrdered(Book bookOrdered) {
		this.bookOrdered = bookOrdered;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public LocalDateTime getOrderDateTime() {
		return orderDateTime;
	}
	public void setOrderDateTime(LocalDateTime orderDateTime) {
		this.orderDateTime = orderDateTime;
	}
	
	@Override
	public String toString() {
		return "Order [orderId=" + orderId + ", bookOrdered=" + bookOrdered + ", user=" + user + ", orderDateTime="
				+ orderDateTime + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(bookOrdered, orderDateTime, orderId, user);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Order other = (Order) obj;
		return Objects.equals(bookOrdered, other.bookOrdered) && Objects.equals(orderDateTime, other.orderDateTime)
				&& orderId == other.orderId && Objects.equals(user, other.user);
	}
	

}
