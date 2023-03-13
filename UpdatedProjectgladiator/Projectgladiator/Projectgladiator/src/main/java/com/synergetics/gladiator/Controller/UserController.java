package com.synergetics.gladiator.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.synergetics.gladiator.Entity.Account;
import com.synergetics.gladiator.Entity.User;
import com.synergetics.gladiator.Service.AccountService;
import com.synergetics.gladiator.Service.UserService;

@RestController
@RequestMapping("/accountcreation")
public class UserController {

	@Autowired
	private UserService userService;

	//http://localhost:8080/employees  -Post
	@RequestMapping("/users")
	@PostMapping
	public User addUser(@RequestBody User user)
	{
		return userService.addUser(user);
	}
	@Autowired
	private AccountService  accountService;

	@RequestMapping("/accounts")
	@PostMapping
	public Account addAccount(@RequestBody Account account)
	{

		return accountService.addAccount(account);
	}

	@RequestMapping("/logs")
	@PutMapping(path="/{loginId}/{password}")
	public  boolean loginUser(@PathVariable long loginId,@PathVariable String password)
	{
		return userService.loginUser(loginId,password);
	}
	@RequestMapping("/approvals")
	@PutMapping(path="/{id}") 
	public User approve(@RequestBody User user, @PathVariable int id)
	{
		return userService.approve(user,id);  
	}
	@RequestMapping("/forgetpwd")
	@PutMapping(path="/{Id}/{phNo}")
	public User findPwd(@RequestBody User user,@PathVariable long Id, @PathVariable long phNo)
	{
		return userService.forgotPwd(user,Id,phNo);
	}
				
}

	
	 

