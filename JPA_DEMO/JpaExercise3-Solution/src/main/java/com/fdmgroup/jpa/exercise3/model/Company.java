package com.fdmgroup.jpa.exercise3.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "Company.findByName", query = "select c from Company c where c.name = :name") })
@Table(name = "COMPANY")
public class Company extends BankCustomer {

	@Column(name = "COMPANY_NAME", unique = true, nullable = false)
	private String name;

	@Column(name = "COMPANY_ABN", unique = true, nullable = false)
	private long abn;

	public Company() {
		super();
	}

	public Company(String address, String name, long abn) {
		super(address);
		this.name = name;
		this.abn = abn;
	}

	@Override
	public String toString() {
		return "Company [name=" + name + ", abn=" + abn + ", toString()=" + super.toString() + "]";
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

}
