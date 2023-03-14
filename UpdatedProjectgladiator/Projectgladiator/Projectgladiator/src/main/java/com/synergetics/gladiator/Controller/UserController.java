package com.synergetics.gladiator.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.synergetics.gladiator.Entity.Account;
import com.synergetics.gladiator.Entity.Benefeciary;
import com.synergetics.gladiator.Entity.User;
import com.synergetics.gladiator.Service.AccountService;
import com.synergetics.gladiator.Service.BenefeciaryService;
import com.synergetics.gladiator.Service.UserService;

@RestController

@RequestMapping("/accountcreation")
public class UserController {

	@Autowired
	private UserService userService;

	@Autowired
	private BenefeciaryService beneficiaryService;
	//http://localhost:8080/employees  -Post

	
	
	@RequestMapping("/users")
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	@Autowired
	private AccountService  accountService;

	
	@PostMapping(path="/accounts")
	public Account addAccount(@RequestBody Account account)
	{

		return accountService.addAccount(account);
	}


	@PutMapping(path="/logs/{loginId}/{password}")
	public  boolean loginUser(@PathVariable long loginId,@PathVariable String password)
	{
		return userService.loginUser(loginId,password);
	}

	@PutMapping(path="/approvals/{id}") 
	public User approve(@RequestBody User user, @PathVariable int id)
	{
		return userService.approve(user,id);  
	}

	@PutMapping(path="/forgetpwd/{Id}/{phNo}")
	public User forgotPwd(@RequestBody User user,@PathVariable long Id, @PathVariable long phNo)
	{
		return userService.forgotPwd(user,Id,phNo);
	}
				

	@GetMapping(path="/balance/{accNo}")
	public long balanceEnquiry(@PathVariable long accNo)
	{
		
		return accountService.balanceEnquiry(accNo);
	}
	

	
@PostMapping(path="/createbeneficiary")
public Benefeciary createBeneficiary(@RequestBody Benefeciary beneficiary)
{
   		return beneficiaryService.createBeneficiary(beneficiary);
}

	
}

	
//Field beneficiaryService in com.synergetics.gladiator.Controller.UserController required a 
//bean of type 'com.synergetics.gladiator.Service.BenefeciaryService' that could not be found.

