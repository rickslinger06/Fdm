package com.fdmgroup;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;


@Entity
@DiscriminatorValue(value = "SAVINGS")
@NamedQuery(name = "SavingsAccount.findAll", query = "Select s From SavingsAccount s ")
public class SavingsAccount extends BankAccount{
	
	

public SavingsAccount() {
		super();
		
	}
	


public SavingsAccount(double balance, BankCustomer customer) {
	super(balance, customer);
}



public void withdraw(double amount) {
	
	double balance = getBalance();
	if (balance > amount) {
		setBalance(balance - amount);
	}
		
	}



@Override
public String toString() {
	return "SavingsAccount [getId()=" + getId() + ", getBalance()=" + getBalance() + ", getCustomer()=" + getCustomer()
			+ "]";
}
	


}
