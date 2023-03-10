package com.synergetics.gladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.gladiator.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
