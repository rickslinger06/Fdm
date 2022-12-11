package com.fdmgroup.one2one.bidirectional;

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
		
		em = emf.createEntityManager();
		/*
		 * Can change the properties of managed instances and their dependents 
		 */
		em.getTransaction().begin();
//		Pet foundPet = em.find(Pet.class, pet.getId());
//		foundPet.setOwner(owner2);
		pet.getOwner().setName("Howdy"); // changing property of inverse side (unmanaged)
		pet = em.merge(pet); // merging the changes
		pet.setName("Hello World"); // changing properties on a managed entity
		
		pet4 = em.merge(pet4); // removing managed owning entity
		em.remove(pet4);
		
		em.getTransaction().commit();
		Helper.close(em);
		
		
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
