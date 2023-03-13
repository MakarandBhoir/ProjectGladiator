package com.synergetics.gladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.synergetics.gladiator.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	@Query("select password from User where phoneNo=?1")
	String findPwd(long phoneNo);
	
/*	@Query("Update User SET password=pwd")
   String pwd=changePwd(); */
}
