package testShoppingApp;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.print.Book;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;


class test_Basket {
	
	Book book;
	Basket basket;
	
	@BeforeEach
void setVal() {
		basket = new Basket();
		book = new Book();
	
	}
	
	
	@Test
	public void test_GetBooksInBasket_ReturnsEmptyBookList_IfNoBooksHaveBeenAdded(){
		
		Book [] bookArray = basket.getBookInBasket();
		assertEquals(0, bookArray.length);
		
	}



}
