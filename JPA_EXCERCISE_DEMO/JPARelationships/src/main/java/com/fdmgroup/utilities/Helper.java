package com.fdmgroup.utilities;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class Helper {

	public static final String persistenceUnitName = "relationshipsJpa";
	
	public static final <T extends Object> List<T> readAll(EntityManager em, Class<T> clazz){
		String jpql = "SELECT p FROM Pet p";
		if(clazz.getSimpleName().equals("PetOwner")) {
			jpql = "SELECT p FROM PetOwner p";
		}
		TypedQuery<T> query = em.createQuery(jpql, clazz);
		return query.getResultList();
	}
	
	public static final <T extends Object> void displayAll(List<T> list) {
		for(T item : list) {
			System.out.println(item);
		}
	}
	public static final void close(EntityManagerFactory emf) {
		if(emf != null && emf.isOpen()) {
			emf.close();
		}
	}
	
	public static final void close(EntityManager em) {
		if(em != null && em.isOpen()) {
			em.close();
		}
	}
}
