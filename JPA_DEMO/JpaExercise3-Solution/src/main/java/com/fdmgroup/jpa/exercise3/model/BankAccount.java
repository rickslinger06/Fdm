package com.fdmgroup.jpa.exercise3.model;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@NamedQueries({ @NamedQuery(name = "BankAccount.findAll", query = "select a from BankAccount a") })
@Table(name = "BANK_ACCOUNT")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "ACCOUNT_TYPE", discriminatorType = DiscriminatorType.STRING)
public abstract class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ACC_ID_GEN")
	@SequenceGenerator(name = "ACC_ID_GEN", sequenceName = "ACC_ID_SEQ")
	@Column(name = "ACCOUNT_ID")
	private int id;

	@Column(name = "BALANCE")
	private double balance;

	@ManyToOne
	@JoinColumn(name = "FK_CUSTOMER_ID", nullable = false)
	private BankCustomer customer;

	public BankAccount() {
		super();
	}

	public BankAccount(double balance, BankCustomer customer) {
		super();
		this.balance = balance;
		this.customer = customer;
	}

	public abstract void withdraw(double amount);

	public void deposit(double amount) {
		balance = balance + amount;
	}

	@Override
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + "]";
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public BankCustomer getCustomer() {
		return customer;
	}

	public void setCustomer(BankCustomer customer) {
		this.customer = customer;
	}

}
