package com.fdmgroup;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.NamedQuery;

@Entity
@NamedQuery(name = "Company.findByName" , query = "Select c From Company c  where c.name = :company")
public class Company extends BankCustomer{
	
	@Column(unique =true, nullable =false)
	private String name;
	@Column(unique =true, nullable =false)
	private long abn;
	
	
	public Company() {
		
	}
	
	public Company(String address, String name, long abn) {
		super(address);
		this.name = name;
		this.abn = abn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getAbn() {
		return abn;
	}
	public void setAbn(long abn) {
		this.abn = abn;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", abn=" + abn + "]";
	}
	
	
	

}
