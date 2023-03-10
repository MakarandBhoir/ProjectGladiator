package com.synergetics.Projectgladiator.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.synergetics.Projectgladiator.Entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

}
