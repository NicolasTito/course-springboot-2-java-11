package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entites.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	
	

}
