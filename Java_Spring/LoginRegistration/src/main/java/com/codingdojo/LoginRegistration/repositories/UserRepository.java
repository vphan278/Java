package com.codingdojo.LoginRegistration.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.codingdojo.LoginRegistration.models.User;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    
	
	List<User> findAll();
	
	//find by email 
    Optional<User> findByEmail(String email);
    
}