package Test.ShoppingApp;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Test_Catalogue {
	
	
	ReadItemCommand mockReadItemCommand;
	WriteItemCommand mockWriteItemCommand;
	Catalogue catalouge;
	List<Book> booklist;
	
	@BeforeEach
	void setUp() {
		mockReadItemCommand = mock(ReadItemCommand.class);
		mockWriteItemCommand = mock(WriteItemCommand.class);
		catalouge = new Catalogue(mockReadItemCommand, mockWriteItemCommand);
		booklist = new ArrayList<>();
		
	}

	@Test
	public void getAllBooks_ReturnsEmptyBookList_IfNoBooksAreInTheCatalogue(){
		
	
		List<Book> booklist = catalouge.getAllBooks();

		assertEquals(0, booklist.size());
	
	}
	
	@Test
	public void getAllBooks_CallsReadAllMethodOfReadItemCommand_WhenCalled(){
		
		
		catalouge.getAllBooks();
		verify(mockReadItemCommand,times(1)).readAll();
		
		
	}
	
	@Test
	public void getAllBooks_ReturnsListOfBooksItReceivesFromReadAllMethodOfReadItemCommand_WhenCalled(){
		
		List<Book> mockBookList = mock(List.class);
		
		when(mockReadItemCommand.readAll()).thenReturn(mockBookList);
		
		List<Book> booklist = catalouge.getAllBooks();
		
		assertEquals(booklist, mockBookList);
	}

	

@Test
public void addBook_CallsInsertItemMethodOfWriteItemCommand_WhenCalled(){
	
	
	Book book = new Book();
	catalouge.addBook(book);
	
	verify(mockWriteItemCommand,times(1)).insertItem();
	
}
@Test
void addBook_PassesBookToInsertItemMethodOfWriteItemCommand_WhenCalled() {
	
	Book book = mock(Book.class);
	
	catalouge.addBook(book);
	
	verify(mockWriteItemCommand,times(1)).insertItem();

}

@Test
void overloadAddBookMethod_CallesInsertItemMethodMultipleTimes() {

	Book book = mock(Book.class);
	
	booklist.add(book);
	booklist.add(book);
	
	catalouge.addBook(booklist);
	
	
	verify(mockWriteItemCommand,times(2)).insertItem(book);
	
	
	

}


}
