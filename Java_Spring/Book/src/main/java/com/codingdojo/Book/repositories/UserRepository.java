package com.codingdojo.Book.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.codingdojo.Book.models.User;



public interface UserRepository extends CrudRepository<User, Long>{
	
	List<User> findAll();
	
	//find by email
	Optional<User> findByEmail(String email);

}
