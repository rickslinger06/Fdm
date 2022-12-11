package com.fdmgroup.jpa.exercise3.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value = "CHECKING")
public class CheckingAccount extends BankAccount {

	public CheckingAccount() {
		super();
	}

	public CheckingAccount(double balance, BankCustomer customer) {
		super(balance, customer);
	}

	@Override
	public void withdraw(double amount) {
		setBalance(getBalance() - amount);
	}

}
