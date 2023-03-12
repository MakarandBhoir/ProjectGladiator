package com.synergetics.gladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.gladiator.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
