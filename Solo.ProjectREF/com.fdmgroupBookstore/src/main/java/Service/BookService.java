package Service;

import java.util.ArrayList;
import java.util.List;


import Data.BookRepository;
import Model.Book;
import Model.BookGenre;

public class BookService {
	
	private BookRepository bookRepository;
	List<Book> listOfBooks;

	public BookService(BookRepository bookRepository) {
		// TODO Auto-generated constructor stub
		this.bookRepository = bookRepository;
		listOfBooks = new ArrayList<>();
	}

	public List<Book> getAllBooks() throws ItemNotFoundException {
		// TODO Auto-generated method stub
		listOfBooks = bookRepository.findAll();
		
		if(listOfBooks.size() > 0) {
			return listOfBooks;
		} else {
			throw new ItemNotFoundException("No book found.");
		}
	}

	public List<Book> getBooksOfGenre(BookGenre bookGenre) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		listOfBooks = bookRepository.findAll();
		ArrayList<Book> result = new ArrayList<>();
		
		for(Book book : listOfBooks) {
			if(book.getBookGenre() == bookGenre) {
				result.add(book);
			}
		}
		
		if(result.size() > 0) {
			return result;
		} else {
			throw new ItemNotFoundException("Book genre not found");
		}
	}

	public List<Book> searchBooksByTitle(String title) throws ItemNotFoundException {
		// TODO Auto-generated method stub
		listOfBooks = bookRepository.findAll();
		ArrayList<Book> result = new ArrayList<>();
		
		for(Book book : listOfBooks) {
			if(book.getTitle() == title) {
				result.add(book);
			}
		}
		
		if(result.size() > 0 ) {
			return result;
		} else {
			throw new ItemNotFoundException("Book title not found.");
		}
	}

	public List<Book> searchBooksByAuthorName(String author) throws ItemNotFoundException{
		// TODO Auto-generated method stub
		listOfBooks = bookRepository.findAll();
		ArrayList<Book> result = new ArrayList<>();
		
		for(Book book : listOfBooks) {
			if(book.getAuthor() == author) {
				result.add(book);
			}
		}
		
		if(result.size() > 0 ) {
			return result;
		} else {
			throw new ItemNotFoundException("Book with author name not found.");
		}
	}

}
