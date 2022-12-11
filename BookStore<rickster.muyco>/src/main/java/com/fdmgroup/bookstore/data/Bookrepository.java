package com.fdmgroup.bookstore.data;

import java.util.List;

import com.fdmgroup.bookstore.model.Book;

public interface Bookrepository {
	
	List<Book> findAll();

}
