package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entites.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	

}
