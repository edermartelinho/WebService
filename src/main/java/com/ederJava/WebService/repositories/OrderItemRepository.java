package com.ederJava.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederJava.WebService.entity.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
}
