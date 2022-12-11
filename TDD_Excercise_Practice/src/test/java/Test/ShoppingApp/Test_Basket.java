package Test.ShoppingApp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_Basket {
	
	Basket basket;
	Book book;
	
	@BeforeEach
	void setUp() {
		basket = new Basket();
		
	}
	
	

	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		
	
		List<Book> books = basket.getBooksInBasket();
		
		assertEquals(0, books.size());
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		
	
		basket.addBook(book);
		List<Book> books = basket.getBooksInBasket();
		
		assertEquals(1, books.size());
		
	}
	
	@Test
	public void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithOtwoBook() {
		
	
		basket.addBook(book);
		basket.addBook(book);
		List<Book> books = basket.getBooksInBasket();
		
		assertEquals(2, books.size());
		
	}
	
	



}
