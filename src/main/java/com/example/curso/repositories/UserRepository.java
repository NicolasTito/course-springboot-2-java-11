package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {
	
	

}
