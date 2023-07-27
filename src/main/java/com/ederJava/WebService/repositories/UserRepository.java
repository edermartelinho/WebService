package com.ederJava.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederJava.WebService.entity.User;

public interface UserRepository extends JpaRepository<User, Long>{
	
}
