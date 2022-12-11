package com.fdmgroup;

import jakarta.persistence.Entity;

@Entity
public class CheckingAccount extends BankAccount{
	
	

	
	
public CheckingAccount() {
		super();

	}

	public CheckingAccount(double balance, BankCustomer customer) {
		super(balance, customer);
		
	}

public void withdraw(double amount) {
	setBalance(getBalance() - amount);
		
	}

@Override
public String toString() {
	return "CheckingAccount [getId()=" + getId() + ", getBalance()=" + getBalance() + ", getCustomer()=" + getCustomer()
			+ "]";
}



}
