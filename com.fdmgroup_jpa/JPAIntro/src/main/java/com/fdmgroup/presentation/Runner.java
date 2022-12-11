package com.fdmgroup.presentation;

import com.fdmgroup.models.Pet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;

public class Runner {
	/*
	 * make sure there is a persistence.xml file in the META-INF folder under the src/main/resource
	 */
	public static final String PERSISTENCE_UNIT_NAME = "JPAIntro";
	
	/*
	 * UNCOMMENT LINE 20 FOR THIS RUNNER TO RUN and UPDATE PERSISTENCE UNIT NAME
	 */
//	public static void main(String[] args) {  
		
		// Creating an EntityManagerFactory (emf)
		/*
		 * 1. create an emf with the Persistence class - you HAVE to pass in the persistence unit name 
		 * 2. The emf is a resource, make sure that you close this resource at the end of your program
		 *  
		 *  - This should be the first object created
		 *  - There should ONLY be one because they are resource expensive 
		 */
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
		// Can create EntityManagers (em) with emf
		EntityManager em = emf.createEntityManager();
		
		// Creating a pet to be persisted to the database
		Pet pet1 = new Pet("Ollie", "Dog", "Border Collie", false);
		Pet pet2 = new Pet("Waffles", "Cat", "Ginger", false);
		
		System.out.println("Pet1 id before persistence: " + pet1.getId() + " *****************");
		
		// Get formal transaction 
		EntityTransaction transaction = em.getTransaction();
		// Begin transaction 
		transaction.begin();
		
		// Persisting with em
		em.persist(pet1); // if the entity exists in the db - it will through an exception
		pet1.setName("Simba"); // Object gains active link to DB 
		System.out.println("Pet1 after persisted " + pet1 + "*******************");
		// Going back and adding Pet2 to the DB 
		em.persist(pet2);
		
		// Have to commit transaction
		transaction.commit();
		
		pet1.setName("Ollie"); // Active link within the same transaction
		
		close(em);
		
		// Drawback to persist, unable to use if object already exists in DB - with regard to a new transaction.
/*		em = emf.createEntityManager();
		transaction = em.getTransaction();
		// Begin transaction 
		transaction.begin();
		
		// Persisting with em
		em.persist(pet1); // if the entity exists in the db - it will through an exception
		
		// Have to commit transaction
		transaction.commit();
		
		close(em); */
		
		// Can only DELETE MANAGED ENTITIES
		// Chain method calls to get transaction - less formal - common
		
		
		em = emf.createEntityManager();
		
		pet1 = em.find(Pet.class, pet1.getId()); // Do not need transaction to look at information in the DB
		
		// getting transaction
		em.getTransaction().begin();
		
		em.remove(pet1); // Can only manipulate MANAGED Entities - Detached
	
		em.getTransaction().commit(); // same transaction - 1 to 1 relationship
		close(em);

		
		// Changing an Entity after we create an active link (find)
		em = emf.createEntityManager(); 
		// Going to find managed entity
		pet2 = em.find(Pet.class, pet2.getId());
		
		em.getTransaction().begin(); // creates staging ground for changes
		
		pet2.setCanProtect(true);
		
		em.getTransaction().commit();
		
		close(em);
		
		// pet2 is currently detached
		pet2.setName("Sunflower"); // Merge can update even if they have different values (need same ID)
		System.out.println("What is currently in java: " + pet2);
		
		// Merge returns a managed instance - AKA can manipulate
		em = emf.createEntityManager();
		Pet foundPet2 = em.find(Pet.class, 2); // foundPet2 - managed
		System.out.println("Before merger: " + foundPet2); // What is in the DB before the merge
		Pet pet3 = new Pet("Green", "Fish", "Swimmer", false);
		
		em.getTransaction().begin();
		
		em.merge(pet3); // Persisting new entity
		pet2 = em.merge(pet2);
		System.out.println("After merger: " + pet2);
//		pet2.setName("Sunflower");
	
		em.getTransaction().commit();
		close(em);
		
		// Making our first Query
		em = emf.createEntityManager();
		
//		Query query = em.createQuery("SELECT p FROM Pet p", Pet.class); // This will get all the information
		String jpql1 = "SELECT p.name FROM Pet p";
		Query query1 = em.createQuery(jpql1, Pet.class); // JPQL - refer to class and to fields
		List<Pet> allPets = query1.getResultList();
		System.out.println("Pets in the database " + allPets);
		
		// Taking in parameters - dynamic / TypedQuery
		String jpql = "SELECT p FROM Pet p WHERE p.species = :species";
		TypedQuery<Pet> dynamicQuery = em.createQuery(jpql, Pet.class); // Type is specified
		dynamicQuery.setParameter("species", "Fish");
		List<Pet> pets = dynamicQuery.getResultList();
		System.out.println("These are my pets of type fish: " + pets);
		
		close(em);
		
		em = emf.createEntityManager();
		List<Pet> theNamedQueryPets = em.createNamedQuery("findPetByName", Pet.class).setParameter("petName", "Sunflower").getResultList();
		System.out.println("THis is sunflower: " + theNamedQueryPets);
		
		close(em);
		// Keep this at the end of the file
		close(emf);
	} 

	private static final void close(EntityManagerFactory emf) {
		if(emf != null & emf.isOpen()) {
			emf.close(); // Defensive coding
		}
	}
	
	private static final void close(EntityManager em) {
		if(em != null & em.isOpen()) {
			em.close(); // Defensive coding
		}
	}
	
	
	
	
	
	
}
