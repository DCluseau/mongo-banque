package fr.fms.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.fms.entities.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

}
