package com.fdmgroup.data;

import java.util.List;
import java.util.Optional;

import com.fdmgroup.models.Pet;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.TypedQuery;

public class PetDao implements Persistable<Pet, Long>{

	private EntityManagerFactory emf;
	
	// Dependency Injection 
	public PetDao(EntityManagerFactory emf) {
		super();
		this.emf = emf;
	}
	
	@Override
	public Pet create(Pet pet) {
		EntityManager em = null;
		Pet returnedPet = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			returnedPet = em.merge(pet);
			em.getTransaction().commit();
		} finally {
			close(em);
		}
		return returnedPet;
	}

	@Override
	public List<Pet> readAll() {
		EntityManager em = null;
		List<Pet> returnedPets = null;
		try {
			em = emf.createEntityManager();
			TypedQuery<Pet> query = em.createNamedQuery("readAllPets", Pet.class);	
			returnedPets = query.getResultList();
		} finally {
			close(em);
		}
		return returnedPets;
	}

	@Override
	public Optional<Pet> read(Long id) {
		Pet retrievedPet = null;
		EntityManager em = null;
		try {
			em = emf.createEntityManager();
			retrievedPet = em.find(Pet.class, id);
		}finally {
			close(em);
		}
		return Optional.ofNullable(retrievedPet);
	}

	@Override
	public Pet update(Pet pet) {
		EntityManager em = null;
		Pet returnedPet = null;
		try {
			em = emf.createEntityManager();
			em.getTransaction().begin();
			returnedPet = em.merge(pet);
			em.getTransaction().commit();
		} finally {
			close(em);
		}
		return returnedPet;
	}

	@Override
	public void delete(Long id) {
		EntityManager em = null;
		Pet managedPet = null;
		try {
			em = emf.createEntityManager();
			managedPet = em.find(Pet.class, id);
			em.getTransaction().begin();
			em.remove(managedPet);
			em.getTransaction().commit();
		} finally {
			close(em);
		}
		
	}
	
	private static final void close(EntityManager em) {
		if(em != null & em.isOpen()) {
			em.close(); // Defensive coding
		}
	}

}
