package com.ederJava.WebService.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ederJava.WebService.entity.Category;

public interface CategoryRepository extends JpaRepository<Category, Long>{
}
