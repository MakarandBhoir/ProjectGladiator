package com.synergetics.gladiator.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mysql.cj.log.Log;
import com.mysql.cj.log.LogFactory;
import com.synergetics.gladiator.Entity.Account;
import com.synergetics.gladiator.Entity.User;
import com.synergetics.gladiator.Service.AccountService;

@RestController
@RequestMapping("/accounts")
public class AccountController  {
	
    
    @Autowired
	private AccountService  accountService;
	
	@PostMapping
	public Account addAccount(@RequestBody Account account)
	{
		return accountService.addAccount(account);
	}

}
