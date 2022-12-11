package testShoppingApp;

import java.util.ArrayList;
import java.util.List;

public class Catalogue {

	private List<Book> books = new ArrayList<>();

	private ReadItemCommand readItemCommand;
	private WriteItemCommand writeItemCommand;
	

	public Catalogue(ReadItemCommand readItemCommand, WriteItemCommand writeItemCommand) {
		this.readItemCommand = readItemCommand;
		this.writeItemCommand = writeItemCommand;
		
		
	}
	
	public List<Book> getBooks() {
		return books;
	}

	public ReadItemCommand getReadItemCommand() {
		return readItemCommand;
	}
	
	public List<Book> getAllBooks() {
		
		return readItemCommand.readAll();
	}

	public List<Book> addBook() {
		
		return writeItemCommand.insertItem();
		
	}

}
