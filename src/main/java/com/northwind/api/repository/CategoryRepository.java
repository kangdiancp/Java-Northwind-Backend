package com.northwind.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.northwind.api.entities.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category,Integer>{
    
}
