package com.synergetics.gladiator.Service;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import com.synergetics.gladiator.Entity.Account;
import com.synergetics.gladiator.Entity.User;
import com.synergetics.gladiator.Repository.AccountRepository;
import com.synergetics.gladiator.Repository.UserRepository;

@Service
public class UserServiceImpln implements UserService{

    @Autowired
	private UserRepository userrepository;
    
    @Autowired
	private AccountRepository accountrepository;
    
	@Override
	public User addUser(User user) {
		return userrepository.save(user);	
	}

	@Override
	public boolean loginUser(long Id, String pwd ) {
		User user=userrepository.findById(Id).get();
		if (Id==user.getLoginId()&&pwd.equals(user.getPassword()))
			return true;
		else		
			return false;
	}
	public  User approve(User user, long Id)
	{
		//Account account=accountrepository.findById(Id).get();
		User user1=userrepository.findById(Id).get();
		user1.setAccount(user.getAccount());
		return userrepository.save(user1);	
	
	}
	public User forgotPwd(User user, long loginId, long phoneNo)
	{
		User user1=userrepository.findById(loginId).get();
		if(phoneNo==user1.getPhoneNo())
		user1.setPassword(user.getPassword());
		return userrepository.save(user1);
		
	}
	
    
	}
