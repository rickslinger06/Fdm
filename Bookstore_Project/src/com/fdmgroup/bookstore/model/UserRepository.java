package com.fdmgroup.bookstore.model;

public interface UserRepository {
	
	boolean validate(String username, String password);

}
