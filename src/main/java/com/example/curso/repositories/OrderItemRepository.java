package com.example.curso.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.curso.entites.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
	
	

}
