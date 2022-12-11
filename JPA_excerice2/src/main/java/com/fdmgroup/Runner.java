package com.fdmgroup;

import java.util.Arrays;
import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import utilities.Helper;

public class Runner {

	
	public static void main(String[] args) {
		
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Helper.PERSISTENCE_UNIT_NAME);
		
		Module m1 = new Module("SQL");
		Module m2 = new Module("OOD");
		
		
		Stream s1 = new Stream("Software Development",  Arrays.asList(m1,m2));
		Stream s2 = new Stream("BABI", Arrays.asList(m1));
		
		m1.setStreams(Arrays.asList(s1,s2));
		m1.setStreams(Arrays.asList(s1));
		
		
		Trainee t1 = new Trainee("John", "Doe");
		Trainee t2 = new Trainee("James", "Smith");
		Trainee t3 = new Trainee("Jane", "Doe");
		
		/*
		
		s1.getModules().add(m1);
		s1.getModules().add(m2);
		s2.getModules().add(m1);
		
		m1.getStreams().add(s1);
		m1.getStreams().add(s2);
		m2.getStreams().add(s1);

	*/
		
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();
		
		//Stream object
		em.persist(s1);
		em.persist(s2);
		//Trainee object
		em.persist(t1);
		em.persist(t2);
		em.persist(t3);
		
		//Module object
		em.persist(m1);
		em.persist(m2);
		em.getTransaction().commit();
		
		Helper.close(em);
		
	
		em = emf.createEntityManager();
		em.getTransaction().begin();
		t1.setStream(s1);
		t2.setStream(s2);
		t3.setStream(s1);
		
		em.merge(t1);
		em.merge(t2);
		em.merge(t3);

		em.getTransaction().commit();
		
		Helper.close(em);
		
		em = emf.createEntityManager();
		TypedQuery<Stream> query = em.createNamedQuery("findByStream", Stream.class);
		Stream stream = query.setParameter("streamName", "BABI").getResultList().get(0);
		
		System.out.println(stream);
		
		Helper.close(em);
	
		Helper.close(emf);
	}

}
