package com.fdmgroup.jpa.exercise3;

import java.util.Arrays;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.fdmgroup.jpa.exercise3.model.BankAccount;
import com.fdmgroup.jpa.exercise3.model.CheckingAccount;
import com.fdmgroup.jpa.exercise3.model.Company;
import com.fdmgroup.jpa.exercise3.model.Person;
import com.fdmgroup.jpa.exercise3.model.SavingsAccount;
import com.fdmgroup.jpa.properties.DatabaseProperties;

public class Runner {

	public static void main(String[] args) {
		Person customer = new Person("123 Fake Street", "John", "Smith");
		Company company = new Company("456 Real Street", "Google", 123456789);

		SavingsAccount account1 = new SavingsAccount(1500.25, customer);
		SavingsAccount account2 = new SavingsAccount(2500000.50, company);

		CheckingAccount account3 = new CheckingAccount(-150.35, customer);
		CheckingAccount account4 = new CheckingAccount(105000.90, company);

		customer.setAccounts(Arrays.asList(account1, account3));
		company.setAccounts(Arrays.asList(account2, account4));

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("JpaExercise3-Solution",
				DatabaseProperties.getProperties());
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		et.begin();

		em.persist(customer);
		em.persist(company);

		em.persist(account1);
		em.persist(account2);
		em.persist(account3);
		em.persist(account4);

		et.commit();

		List<BankAccount> accounts = em.createNamedQuery("BankAccount.findAll", BankAccount.class).getResultList();
		accounts.forEach(a -> System.out.println(a));

		Company foundCompany = em.createNamedQuery("Company.findByName", Company.class).setParameter("name", "Google")
				.getSingleResult();
		System.out.println(foundCompany);

		List<SavingsAccount> savingsAccounts = em.createNamedQuery("SavingsAccount.findAll", SavingsAccount.class)
				.getResultList();
		
		et.begin();
		savingsAccounts.forEach(account -> {
			account.deposit(100);
		});
		et.commit();
		
		em.close();
		emf.close();

	}

}
