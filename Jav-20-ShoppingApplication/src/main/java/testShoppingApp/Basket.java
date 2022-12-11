package testShoppingApp;

import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

public class Basket {

	List<Book> books = new ArrayList<>();
	public Book[] getBookInBasket() {
		Book [] bookArray = new Book[books.size()];
		return bookArray;
	}
	
	
	
	

}
