package fr.fms.entities;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Transaction implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private Double amount;

	@ManyToOne
	private BankAccount bankAccount;

	public Transaction() {

	}

	public Transaction(Long id, Double amount) {
		this.id = id;
		this.amount = amount;
	}

	public Transaction(Double amount) {
		this.amount = amount;
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
	 * @return the amount
	 */
	public Double getAmount() {
		return amount;
	}

	/**
	 * @param amount the amount to set
	 */
	public void setAmount(Double amount) {
		this.amount = amount;
	}

	@Override
	/*
	 * Article not displayed to avoid errors
	 */
	public String toString() {
		return "Transaction [id=" + id + ", amount=" + amount + "]";
	}

}
