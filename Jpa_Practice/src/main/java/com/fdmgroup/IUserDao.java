package com.fdmgroup;

import java.util.List;
import java.util.Optional;

public interface IUserDao {
	
	public void persist(User user);
	public Optional<User> findByid(int id);
	public Optional<User> findByUsername(String name);
	public void deleteById(int id);
	public void update(User user);
	public List<User> findAll();


}
