package com.fdmgroup.UserDao;

import java.util.List;
import java.util.Optional;

public interface IUserDao {
	
	void persist(User user);
	Optional<User> findById(Integer id);
	Optional<User> findByUserName(String username);
	void deleteById(int id);
	void update(User user);
	List<User> findAll();
}
