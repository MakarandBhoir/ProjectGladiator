package com.synergetics.gladiator.Service;

import com.synergetics.gladiator.Entity.User;

public interface UserService {

	public User addUser(User user);
	public boolean loginUser(long loginId, String pwd );
     	
}
