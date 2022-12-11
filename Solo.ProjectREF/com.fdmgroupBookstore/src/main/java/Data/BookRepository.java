package Data;

import java.util.List;

import Model.Book;

public interface BookRepository {
	
	List<Book> findAll();

}
