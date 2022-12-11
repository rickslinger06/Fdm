package com.fdmgroup;

import java.util.List;
import java.util.Optional;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;



public class UserDao implements IUserDao{

	EntityManagerFactory emf;
	
	public void persist(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(user);
		em.getTransaction().commit();
		em.close();
		
	}
	
	
	public UserDao(EntityManagerFactory emf) {
		this.emf = emf;
		
	}



	public Optional<User> findByid(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	public Optional<User> findByUsername(String name) {
		EntityManager em = emf.createEntityManager();
		
		User findUserName = 
				em.createNamedQuery("findByUserName", User.class)
				.setParameter("username", name).getSingleResult();
		
		
		return Optional.ofNullable(findUserName);
	}

	public void deleteById(int id) {
		// TODO Auto-generated method stub
		
	}

	public void update(User user) {
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.merge(user);
		em.getTransaction().commit();
		em.close();
		
		
	}

	public List<User> findAll() {
		
		List<User> findAllUSer;
		EntityManager em = null;
		try {
		 
		em =emf.createEntityManager();
		findAllUSer = em.createNamedQuery("findAllUser", User.class).getResultList();

		}finally {
			em.close();
		}
		
		return findAllUSer;
		
		
	}
	
	
	
	
}
