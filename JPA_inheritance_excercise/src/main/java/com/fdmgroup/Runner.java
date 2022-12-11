package com.fdmgroup;

import java.util.List;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;
import jakarta.persistence.TypedQuery;
import utilities.Helper;

public class Runner {
	
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory(Helper.PERSISTENCE_UNIT_NAME);
		
		
		Person person1 =  new Person("123 Fake Street","John", "Smith");
		
		Company company1 = new Company("456 Real Street", "google" , 123456789);
		
		SavingsAccount acct1 = new SavingsAccount(1234.50, person1);
		CheckingAccount acct2  = new CheckingAccount (-250.00, company1);
		CheckingAccount acct3  = new CheckingAccount (-525.25, person1);
		SavingsAccount acct4 = new SavingsAccount(10500.00, company1);
		
		
		EntityManager em = emf.createEntityManager();
		em = emf.createEntityManager();
		em.getTransaction().begin();
		em.persist(person1);
		em.persist(company1);
		em.persist(acct1);
		em.persist(acct2);
		em.persist(acct3);
		em.persist(acct4);
		em.getTransaction().commit();
		
		
		List<BankAccount> accounts  = em.createNamedQuery("FindAllBankAccount", BankAccount.class).getResultList();
		
		accounts.forEach(a -> System.out.println(a));
		
		
		//TypedQuery<Company> findCompanyQuery = em.createNamedQuery("Company.findByName", Company.class);
		//Company company = findCompanyQuery.setParameter("company", "google").getSingleResult();
		
		Company company = em.createNamedQuery("Company.findByName",Company.class).setParameter("company", "google").getSingleResult();
		
		System.out.println(company);
		
		
		List<SavingsAccount> savings = em.createNamedQuery("SavingsAccount.findAll" , SavingsAccount.class).getResultList();
		
		savings.forEach(a -> System.out.println(a));
				
		
		em.getTransaction().begin();
		
		savings.forEach(a -> {
			a.deposit(100);
		
		
		});
		
		em.getTransaction().commit();
		
		savings.forEach(a -> System.out.println(a));
		
		Helper.close(em);	
		Helper.close(emf);		
		
	}

}
