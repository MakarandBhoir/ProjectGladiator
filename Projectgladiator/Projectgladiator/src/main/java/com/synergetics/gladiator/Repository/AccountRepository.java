package com.synergetics.gladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.gladiator.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
