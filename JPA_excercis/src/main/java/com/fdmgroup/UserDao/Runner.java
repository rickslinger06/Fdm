package com.fdmgroup.UserDao;

import java.util.List;
import java.util.Optional;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {
	
	public static final String PERSISTENCE_UNIT_NAME = "JPAExcercise1";

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
		UserDao dao = new UserDao(emf);
		
		User user1 = new User("john.smith","apple123","john","Smith");
		User user2 = new User("jane.doe","banana456","jane","Doe");
		User user3 = new User("joe.bloggs","orange789","Joe","Bloggs");
		
		dao.persist(user1);
		dao.persist(user2);
		dao.persist(user3);
		
		System.out.println(user1 + "************************");
		
		List<User> users = dao.findAll();
		
		System.out.println(users + "*****************************");
		
		
		
		Optional<User> result = dao.findByUserName("john.smith");
		
		
		user1.setPassword("updatedpass098");
		dao.update(user1);

		
		System.out.println(result);
		
		System.out.println(user1 + "************************");
	
		
		
		
		

	}

}
