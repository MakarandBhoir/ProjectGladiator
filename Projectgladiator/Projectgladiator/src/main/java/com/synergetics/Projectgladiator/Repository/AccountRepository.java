package com.synergetics.Projectgladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.Projectgladiator.Entity.Account;

public interface AccountRepository extends JpaRepository<Account, Long> {

}
