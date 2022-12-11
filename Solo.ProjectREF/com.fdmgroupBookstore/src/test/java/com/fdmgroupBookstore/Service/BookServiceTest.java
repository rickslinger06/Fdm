package com.fdmgroupBookstore.Service;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Data.BookRepository;
import Model.Book;
import Model.BookGenre;
import Service.BookService;
import Service.ItemNotFoundException;



public class BookServiceTest {
	
	BookRepository mockBookRepository;
	BookService bookService;
	
	@BeforeEach
	public void init() {
		mockBookRepository = mock(BookRepository.class);
		bookService = new BookService(mockBookRepository);
	}
	
	@Test
	public void test_getAllBooksMethodReturnsListOfBooks() throws ItemNotFoundException{
		List<Book> books = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			books.add(new Book());
		}
		
		List<Book> actualBooks = new ArrayList<>();
		
		when(mockBookRepository.findAll()).thenReturn(books);
		
		actualBooks = bookService.getAllBooks();
		
		assertEquals(books, actualBooks);
	}
	
	@Test
	public void test_getBooksFromGenreMethodTakesGenreAndReturnsListOfBooks() throws ItemNotFoundException{
		BookGenre bookGenreComedy = BookGenre.Comedy;
		BookGenre bookGenreRomance = BookGenre.Romance;
		BookGenre bookGenreHistory = BookGenre.History;
		
		Book book1 = new Book();
		Book book2 = new Book();
		Book book3 = new Book();
		Book book4 = new Book();
		
		book1.setBookGenre(bookGenreComedy);
		book2.setBookGenre(bookGenreComedy);
		book3.setBookGenre(bookGenreRomance);
		book4.setBookGenre(bookGenreHistory);
		
		List<Book> allBooks = new ArrayList<>();
		allBooks.add(book1);
		allBooks.add(book2);
		allBooks.add(book3);
		allBooks.add(book4);
		
		List<Book> expectedBooks = new ArrayList<>();
		expectedBooks.add(book1);
		expectedBooks.add(book2);
		
		List<Book> actualBooks = new ArrayList<>();
		
		when(mockBookRepository.findAll()).thenReturn(allBooks);
		
		actualBooks = bookService.getBooksOfGenre(bookGenreComedy);
		
		assertEquals(expectedBooks, actualBooks);
	}
	
	@Test
	public void test_searchBooksByTitleMethodReturnsListofBooksMatchingTitleSearch() throws ItemNotFoundException{
		
		Book Java = new Book();
		Book SQL = new Book();
		Book UNIX = new Book();
		Book Python = new Book();
		
		Java.setTitle("How to Program using JAVA.");
		SQL.setTitle("How to Program using SQL.");
		UNIX.setTitle("How to Program using UNIX.");
		Python.setTitle("How to Program using Python.");
		
		String bookTitle = "How to Program using JAVA.";
		
		List<Book> listOfTitles = new ArrayList<>();
		listOfTitles.add(Python);
		listOfTitles.add(UNIX);
		listOfTitles.add(SQL);
		listOfTitles.add(Java);
		
		List<Book> expectedBookTitles = new ArrayList<>();
		expectedBookTitles.add(Java);
		
		List<Book> actualBookTitles = new ArrayList<>();
		
		when(mockBookRepository.findAll()).thenReturn(listOfTitles);
		
		actualBookTitles = bookService.searchBooksByTitle(bookTitle);
		
		assertEquals(expectedBookTitles, actualBookTitles);
		
	}
	
	@Test
	public void test_searchBooksByAuthorNameMethodReturnsListOfBooksMatchingAuthorSearch() throws ItemNotFoundException{
		
		Book CleanCode = new Book();
		Book IntroductionToAlgorithms = new Book();
		Book CodeComplete = new Book();
		Book Refactoring = new Book();
		
		CleanCode.setAuthor("Robert Martin");
		IntroductionToAlgorithms.setAuthor("Thomas Cormen");
		CodeComplete.setAuthor("Steve McConnell");
		Refactoring.setAuthor("Martin Fowler");
		
		String authorName = "Martin Fowler";
		
		List<Book> listOfBooksByAuthor = new ArrayList<>();
		listOfBooksByAuthor.add(Refactoring);
		listOfBooksByAuthor.add(CodeComplete);
		listOfBooksByAuthor.add(CleanCode);
		listOfBooksByAuthor.add(IntroductionToAlgorithms);
	
		
		List<Book> expectedBookTitles = new ArrayList<>();
		expectedBookTitles.add(Refactoring);
		
		List<Book> actualBookTitles = new ArrayList<>();
		
		when(mockBookRepository.findAll()).thenReturn(listOfBooksByAuthor);
		
		actualBookTitles = bookService.searchBooksByAuthorName(authorName);
		
		assertEquals(expectedBookTitles, actualBookTitles);
	}

}
