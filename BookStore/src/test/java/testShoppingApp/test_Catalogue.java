package testShoppingApp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

class test_Catalogue {
	
	Catalogue catalogue;
	ReadItemCommand readItemCommand;
	WriteItemCommand writeItemCommand;

	List<Book> books;
	
	@BeforeEach
	void SetUp() {
		readItemCommand =mock(ReadItemCommand.class);
		writeItemCommand = mock(WriteItemCommand.class);
		catalogue = new Catalogue(readItemCommand, writeItemCommand);
		
		books = new ArrayList<>();
		
	
		
	}
	
	@Test
	public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		
		catalogue = mock(Catalogue.class);
		when(catalogue.getAllBooks()).thenReturn(books);
		
		assertEquals(0 , books.size());
		
	}
	
	@Test
	public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		
		catalogue.getAllBooks();
	
		verify(readItemCommand,times(1)).readAll();
	}
	
	@Test
	public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		
		when(readItemCommand.readAll()).thenReturn(books);
		
		List<Book> actual = catalogue.getAllBooks();
		
		
		assertEquals(actual,books);
	}

	@Test
	public void addBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
		
		when(writeItemCommand.insertItem()).thenReturn(books);
		
		List<Book> actual = catalogue.addBook();;
		
		assertEquals(actual,books);
		

	
	}
	

	
	
	}
