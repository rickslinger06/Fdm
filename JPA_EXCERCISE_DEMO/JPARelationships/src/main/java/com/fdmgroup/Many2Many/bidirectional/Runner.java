package com.fdmgroup.Many2Many.bidirectional;

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
		
		// To avoid Transient exception - persist dependencies first
		// Setting petOwners 

		pet.getOwners().add(owner);
		pet.getOwners().add(owner2);
		pet2.getOwners().add(owner);
		pet2.getOwners().add(owner2);
		pet3.getOwners().add(owner3);
		pet3.getOwners().add(owner4);
		pet4.getOwners().add(owner3);
		pet4.getOwners().add(owner4);
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(pet);
		em.persist(pet2);
		em.persist(pet3);
		em.persist(pet4);
		em.getTransaction().commit();
		
		System.out.println("*************** All initial pet owners");
		List<PetOwner> owners = Helper.readAll(em, PetOwner.class);
		Helper.displayAll(owners);
		
		System.out.println("*************** All initial pets");
		List<Pet> pets = Helper.readAll(em, Pet.class);
		Helper.displayAll(pets);
		Helper.close(em);
		
		/*
		 * Cannot remove inverse that is known to owning
		 */
//		em = emf.createEntityManager();
//		PetOwner foundOwner = em.find(PetOwner.class, owner2.getId());
//		em.getTransaction().begin();
//		em.remove(foundOwner);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/* 
		 * To remove inverse no owning side should have its information
		 */
//		pet.getOwners().remove(1);
//		pet2.getOwners().remove(1);
//		em = emf.createEntityManager();
//		PetOwner foundOwner = em.find(PetOwner.class, owner2.getId());
//		em.getTransaction().begin();
//		em.merge(pet);
//		em.merge(pet2);
//		em.remove(foundOwner);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 * Owning side can be deleted immediately
		 */
//		em = emf.createEntityManager();
//		Pet foundPet = em.find(Pet.class, pet.getId());
//		em.getTransaction().begin();
//		em.remove(foundPet);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 * Changing owning information through an managed inverse
		 */
//		em = emf.createEntityManager();
//		PetOwner foundOwner = em.find(PetOwner.class, owner2.getId());
//		em.getTransaction().begin();
//		foundOwner.getPets().get(0).setName("Changed by inverse");
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
