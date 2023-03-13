package com.synergetics.gladiator.Service;

import com.synergetics.gladiator.Entity.User;

public interface UserService {

	public User addUser(User user);
	public boolean loginUser(long loginId, String pwd );
	public  User approve(User user, long id); 
	public User forgotPwd(User user, long loginId, long phoneNo);

     	
}
