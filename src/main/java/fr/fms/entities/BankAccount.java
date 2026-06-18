package fr.fms.entities;

import java.io.Serializable;
import java.util.Collection;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

import jakarta.persistence.Entity;

@Entity
public class BankAccount implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double balance;

	@ManyToOne
	private Client client;

	@OneToMany(mappedBy = "bankAccount")
	private Collection<Transaction> transactions;

	public BankAccount() {

	}

	public BankAccount(Long id, Double balance) {
		this.id = id;
		this.balance = balance;
	}

	public BankAccount(Double balance) {
		this.balance = balance;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the balance
	 */
	public Double getBalance() {
		return balance;
	}

	/**
	 * @param balance the name to set
	 */
	public void setBalance(Double balance) {
		this.balance = balance;
	}

	@Override
	/*
	 * Article not displayed to avoid errors
	 */
	public String toString() {
		return "BankAccount [id=" + id + ", balance=" + balance + "]";
	}

}
