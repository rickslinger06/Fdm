package com.fdmgroup.Many2One.bidirectional;

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
		Pet pet = new Pet("Tex", "German Shepard", true);
		Pet pet2 = new Pet("Tommy", "Pomeranian", false);
		Pet pet3 = new Pet("Pinky", "Aspin", true);
		Pet pet4 = new Pet("Yoshi", "Cat", true);
		
		// ManyToOne Relationship - Many Pets can have the same (one) owner
		pet.setOwner(owner);
		pet2.setOwner(owner2);
		pet3.setOwner(owner);
		pet4.setOwner(owner2);
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
		 * CanNOT remove a pet (the owning class) when inverse instances know about it - When CASCADE ALL
		 * Can remove when Cascasde.MERGE and Cascade.PERSIST
		 */
		em = emf.createEntityManager();
		pet = em.find(Pet.class, pet.getId());
		em.getTransaction().begin();
		em.remove(pet);
		em.getTransaction().commit();
		Helper.close(em);
		
		/*
		 * When cascade is set to ALL
		 * Removing all owners removes the inverse (PetOwner)
		 */
//		em = emf.createEntityManager();
//		pet = em.find(Pet.class, pet.getId());
//		pet3 = em.find(Pet.class, pet3.getId());
//		em.getTransaction().begin();
//		em.remove(pet);
//		em.remove(pet3);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 *  Cannot remove inverse class while owning class instances know about it
		 *  This block of code will fail
		 */
//		em = emf.createEntityManager();
//		owner = em.find(PetOwner.class, owner.getId());
//		em.getTransaction().begin();
//		em.remove(owner);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 * When no one knows about the inverse side, it can be removed 
		 * This block of code passes 
		 */
//		em = emf.createEntityManager();
//		pet.setOwner(null);
//		pet3.setOwner(null);
//		owner = em.find(PetOwner.class, owner.getId());
//		em.getTransaction().begin();
//		em.merge(pet);
//		em.merge(pet3);
//		em.remove(owner);
//		em.getTransaction().commit();
//		Helper.close(em);
		
		/*
		 * NOW
		 * Can access and change things about owning side from the inverse
		 */
		em = emf.createEntityManager();
		owner = em.find(PetOwner.class, owner.getId()); // have managed inverse side
		em.getTransaction().begin();
		owner.getPets().get(0).setName("Changed from owner");
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
