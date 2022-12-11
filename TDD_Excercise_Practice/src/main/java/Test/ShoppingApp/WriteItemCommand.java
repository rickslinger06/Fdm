package Test.ShoppingApp;

import java.util.List;

public interface WriteItemCommand {

	List<Book> insertItem();
	List<Book> insertItem(Book book);

}
