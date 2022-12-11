package testShoppingApp;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class test_Basket {
	
	Basket basket;
	Book book;
	
@BeforeEach
void SetUp() {
	basket = new Basket();

}
//=================================Test1=========================================
	@Test
	void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		List<Book>  books = basket.getBooksInBasket();
		assertEquals(0,books.size());
	}
	
	//==============================Test2=========================================
	@Test
	void test_GetBooksInBasket_ReturnsArrayOfLengthOne_AfterAddBookMethodIsCalledWithOneBook() {
		
			basket.addBook(book);
			List<Book> books = basket.getBooksInBasket();
			assertEquals(1,books.size());
			
	}
	//==============================Test3=========================================
	@Test
	void test_GetBooksInBasket_ReturnsArrayOfLengthTwo_AfterAddBookMethodIsCalledWithtwoBook() {
		
		basket.addBook(book);
		basket.addBook(book);
		List<Book> books = basket.getBooksInBasket();
		assertEquals(2,books.size());
		
	}

	


}
