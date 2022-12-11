package com.fdmgroup.jpa.exercise3.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
@NamedQueries({
	@NamedQuery(name = "SavingsAccount.findAll", query = "select a from SavingsAccount a")
})
@DiscriminatorValue(value = "SAVINGS")
public class SavingsAccount extends BankAccount {

	public SavingsAccount() {
		super();
	}

	public SavingsAccount(double balance, BankCustomer customer) {
		super(balance, customer);
	}

	@Override
	public void withdraw(double amount) {
		double balance = getBalance();
		if (balance > amount) {
			setBalance(balance - amount);
		}
	}

}
