package com.synergetics.gladiator.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synergetics.gladiator.Entity.User;
import com.synergetics.gladiator.Repository.UserRepository;

@Service
public class UserServiceImpln implements UserService{

    @Autowired
	private UserRepository userrepository;
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

}
