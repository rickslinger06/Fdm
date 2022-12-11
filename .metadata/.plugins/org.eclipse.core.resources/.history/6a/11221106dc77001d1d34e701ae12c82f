package com.fdmgroup.presentation;

import java.util.List;
import java.util.Optional;

import com.fdmgroup.data.PetDao;
import com.fdmgroup.models.Pet;

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class RefactoredRunner {

	public static final String PERSISTENCE_UNIT_NAME = "JPAIntroRefactor";
	
	/*
	 * Make sure to comment out main if you do not want this runner to run
	 */
	public static void main(String[] args) {
		
		// First thing you need
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(PERSISTENCE_UNIT_NAME);
		
		// Create DAO
		PetDao dao = new PetDao(emf);
		
		// Create a new pet to be persisted 
		Pet pet1 = new Pet("Ollie", "dog", "Border Collie", true);
		Pet pet2 = new Pet("Oscar", "goose", "white", true);
		Pet pet3 = new Pet("Charlie", "reptile", "green", false);
		System.out.println("No id " + pet1);
		
		// Testing create method of DAO
		pet1 = dao.create(pet1);
		System.out.println("Persisted Pet: " + pet1);
		
		pet2 = dao.create(pet2);
		pet3 = dao.create(pet3);
		
		// Testing ReadAll
		List<Pet> pets = dao.readAll();
		System.out.println("All the pets: " + pets);
		
		// Changing Ollie to Simba - testing dao update method
		pet1.setName("Simba");
		dao.update(pet1);
		System.out.println("Updated pet 1000: " + pet1);
		
		// Test that pet3 is deleted with DAO
		dao.delete(pet3.getId());
		pets = dao.readAll();
		System.out.println("All the pets: " + pets);

		// Finding pet by ID
		Optional<Pet> optPet = dao.read(pet1.getId());
		if(optPet.isPresent()) {
			pet1 = optPet.get();
		}
		
		System.out.println("Found pet using id " + pet1);
		
		close(emf);
	}
	
	private static final void close(EntityManagerFactory emf) {
		if(emf != null & emf.isOpen()) {
			emf.close(); // Defensive coding
		}
	}
	

}
