package com.ederJava.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederJava.WebService.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{
}
