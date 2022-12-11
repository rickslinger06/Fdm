package Test.ShoppingApp;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class Test_CheckOut {

	@Test
	public void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
	
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		double price = checkout.calculatePrice(basket);
		
		assertEquals(0.0, price);
	}
	
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		basket.addBook(new Book("bn001", 24.88));
		double basketPrice = checkout.calculatePrice(basket);
		
		assertEquals(24.88, basketPrice);
		
		
	}

	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithtwoBook() {
		
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		basket.addBook(new Book("bn002", 24.88));
		basket.addBook(new Book("bn003", 24.88));
		double basketPrice = checkout.calculatePrice(basket);
		
		assertEquals(49.76, basketPrice,001);
		
		
	}
	
	@Test
	public void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWith3BookWith1PercentDiscount() {
		
		Basket basket = new Basket();
		Checkout checkout = new Checkout();
		
		basket.addBook(new Book("bn004", 24.88));
		basket.addBook(new Book("bn005", 24.88));
		basket.addBook(new Book("bn006", 24.88));
		double basketPrice = checkout.calculatePrice(basket);
		
		assertEquals(73.89, basketPrice,001);
		
		
	}
	
	
	

}
