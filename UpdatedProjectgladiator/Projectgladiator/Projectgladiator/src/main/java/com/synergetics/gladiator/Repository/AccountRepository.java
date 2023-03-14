package com.synergetics.gladiator.Repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.synergetics.gladiator.Entity.Account;
@Transactional
@Repository
public interface AccountRepository extends JpaRepository<Account, Long> {

	
//	@Query( "select a.balance from Account a where a.accNo=:accNO")
//		public long findBalance(@Param("accNo") long accNo);
}
