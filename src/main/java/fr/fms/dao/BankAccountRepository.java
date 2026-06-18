package fr.fms.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.BankAccount;

public interface BankAccountRepository extends JpaRepository<BankAccount, Long> {
	// public List<BankAccount> findByName(String name);

	// public List<BankAccount> findByOrderByNameAsc();

	// public List<BankAccount> findByOrderByNameDesc();

}
