package com.synergetics.gladiator.Service;

import com.synergetics.gladiator.Entity.Account;

public interface AccountService {
	
	public Account addAccount(Account account);
	
	public long balanceEnquiry(long accNo);
}
