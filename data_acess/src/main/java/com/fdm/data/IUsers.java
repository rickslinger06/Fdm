package com.fdm.data;

import java.util.List;

public interface IUsers {
	void addUser (User user);
	User getUser (String username);
	void removeUser(String username);
	void updateUser (User user);
	List<User> listUsers();

	

}
