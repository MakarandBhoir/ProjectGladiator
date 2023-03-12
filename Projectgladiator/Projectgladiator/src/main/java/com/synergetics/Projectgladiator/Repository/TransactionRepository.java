package com.synergetics.Projectgladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.Projectgladiator.Entity.Transaction;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
