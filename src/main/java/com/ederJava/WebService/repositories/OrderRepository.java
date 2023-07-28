package com.ederJava.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederJava.WebService.entity.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{
	
}
