package com.fdmgroup.one2one.unidirectional;

import java.util.List;

import com.fdmgroup.utilities.Helper;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Runner {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Helper.persistenceUnitName);

		PetOwner owner = new PetOwner("Garrett");
		PetOwner owner2 = new PetOwner("Krish");
		PetOwner owner3 = new PetOwner("Claudette");
		PetOwner owner4 = new PetOwner("Brian");
		Pet pet = new Pet("Tex", "German Shepard", true);
		Pet pet2 = new Pet("Tommy", "Pomeranian", false);
		Pet pet3 = new Pet("Pinky", "Aspin", true);
		Pet pet4 = new Pet("Yoshi", "Cat", true);
		
		
		
		// OneToOne Relationship
		pet.setOwner(owner);
		pet2.setOwner(owner2);
		pet3.setOwner(owner3);
		pet4.setOwner(owner4);
		// To avoid Transient exception - persist dependencies first
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pet);
		em.persist(pet2);
		em.persist(pet3);
		em.persist(pet4);
		em.getTransaction().commit();
		Helper.close(em);
		
		em = emf.createEntityManager();
		System.out.println("*************** All initial pet owners");
		List<PetOwner> owners = Helper.readAll(em, PetOwner.class);
		Helper.displayAll(owners);
		
		System.out.println("*************** All initial pets");
		List<Pet> pets = Helper.readAll(em, Pet.class);
		Helper.displayAll(pets);
		Helper.close(em);
		
		/*
		 * Step 2 example: inverse can be deleted if no one knows about it.
		 */
//		em = emf.createEntityManager();
//		pet= em.find(Pet.class, pet.getId());
//		em.getTransaction().begin();
//		pet.setOwner(null);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 * Inverse cannot be removed with owning knows about it
		 */
//		em = emf.createEntityManager();
//		// no transaction needed for .find()
//		owner = em.find(PetOwner.class, owner.getId());
//		em.getTransaction().begin();
//		em.remove(owner);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		em = emf.createEntityManager();
		System.out.println("*************** All pet owners after update");
		owners = Helper.readAll(em, PetOwner.class);
		Helper.displayAll(owners);
		
		System.out.println("*************** All pets after update");
		pets = Helper.readAll(em, Pet.class);
		Helper.displayAll(pets);
		Helper.close(em);
		
		Helper.close(em);
		Helper.close(emf);
	}

}
