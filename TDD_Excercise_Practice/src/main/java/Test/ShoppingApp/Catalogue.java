package Test.ShoppingApp;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {
	
	ReadItemCommand mockReadItemCommand;
	WriteItemCommand mockWriteItemCommand;
	
	
	
	public Catalogue(ReadItemCommand mockReadItemCommand, WriteItemCommand mockWriteItemCommand) {
		super();
		this.mockReadItemCommand = mockReadItemCommand;
		this.mockWriteItemCommand = mockWriteItemCommand;
	}

	List<Book> books = new ArrayList<>();
	
	public List<Book> getAllBooks() {
		
		return mockReadItemCommand.readAll();
	}

	public void addBook() {
		
		mockWriteItemCommand.insertItem();
	}

	public void addBook(Book book) {
		
		 mockWriteItemCommand.insertItem();
	}
public void addBook(List<Book> books) {
		
		for(Book book : books) {
			mockWriteItemCommand.insertItem(book);
			
			
		}
	}
	
	

}
