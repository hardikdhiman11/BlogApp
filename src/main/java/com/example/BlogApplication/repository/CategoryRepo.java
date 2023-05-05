package com.example.BlogApplication.repository;

import com.example.BlogApplication.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;



public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
