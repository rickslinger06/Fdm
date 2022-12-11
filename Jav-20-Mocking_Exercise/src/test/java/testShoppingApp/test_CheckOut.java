package testShoppingApp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test_CheckOut {


	Checkout checkout;
	Basket basket;
	
	@BeforeEach
	void SetUp() {
		checkout = new Checkout();
		basket = new Basket();
	}
	
	
	@Test
	void test_CalculatePrice_ReturnsDoubleZeroPointZeroWhenPassedAnEmptyBasket() {
		
		double EmptyBasketPrice = checkout.calculatePrice(basket);
		assertEquals(0.0, EmptyBasketPrice);
		
	}

	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithOneBook() {
		
		basket.addBook(new Book("book1",2.34));
		double Basket1BookPrice = checkout.calculatePrice(basket);
		assertEquals(2.34, Basket1BookPrice);
	}
	
	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithTwoBook() {
		
		basket.addBook(new Book("book2",2.34));
		basket.addBook(new Book("book3",2.01));
		double Basket1BookPrice = checkout.calculatePrice(basket);
		assertEquals(4.35, Basket1BookPrice);
	}
	
	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithThreeBookMinus1PercentDiscount() {
		Book book = new Book("book100",12.00);
		basket.addBook(book);
		basket.addBook(book);
		basket.addBook(book);
		double Basket1BookPrice = checkout.calculatePrice(basket);
		assertEquals(35.64, Basket1BookPrice,001);
	}
	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWithSevenBookMinus2PercentDiscount() {
		
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		
		double Basket1BookPrice = checkout.calculatePrice(basket);
		assertEquals(171.50, Basket1BookPrice,001);
	}
	@Test
	void test_CalculatePrice_ReturnsPriceOfBookInBasket_WhenPassedBasketWiththirteenBookMinus13PercentDiscount() {
		
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",32.00));
		basket.addBook(new Book("book5",25.00));
		basket.addBook(new Book("book5",25.00));
		
		double Basket1BookPrice = checkout.calculatePrice(basket);
		assertEquals(266.22, Basket1BookPrice, .001 );
	}
	


	


	
	
	
	
	
	
	
	

}
