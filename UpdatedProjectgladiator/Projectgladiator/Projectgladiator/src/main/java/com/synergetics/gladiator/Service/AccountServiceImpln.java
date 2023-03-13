package com.synergetics.gladiator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.synergetics.gladiator.Entity.Account;
import com.synergetics.gladiator.Repository.AccountRepository;

@Service
public class AccountServiceImpln implements AccountService {
	
	@Autowired(required=false)
	private AccountRepository accountrepository;
	
	public Account addAccount(Account account)
	{
		return accountrepository.save(account);
	}
}
