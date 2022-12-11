package Test.ShoppingApp;

import java.util.ArrayList;
import java.util.List;

public class Basket {
	
	List<Book> books = new ArrayList<>();

	public List<Book> getBooksInBasket() {
		return books;
		
		
	}

	public void addBook(Book book) {
		books.add(book);
	}

	

}
