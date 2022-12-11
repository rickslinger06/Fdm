package com.fdmgroup;

import java.util.ArrayList;
import java.util.List;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;

import jakarta.persistence.OneToMany;
import jakarta.persistence.SequenceGenerator;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class BankCustomer {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "Customer_ID_GEN")
	@SequenceGenerator(name = "Customer_ID_GEN", sequenceName = "Customer_ID_SEQ")
	private int id;
	private String address;
	
	@OneToMany(mappedBy = "customer")
	private List<BankAccount> accounts = new ArrayList<>();
	
	public BankCustomer() {
		
	}
	
	
	public BankCustomer(String address) {
		super();
		this.address = address;
	
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public List<BankAccount> getAccounts() {
		return accounts;
	}


	public void setAccounts(List<BankAccount> accounts) {
		this.accounts = accounts;
	}


	@Override
	public String toString() {
		return "BankCustomer [id=" + id + ", address=" + address + ", accounts=" + accounts + "]";
	}
	

	
	
}
