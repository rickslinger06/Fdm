package Data;

import java.util.List;

import Model.Book;



public interface Persistable {
	
	List<Book> findAll();

}
