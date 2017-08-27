package com.jersey.shore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jersey.shore.dao.CategoryDAO;


public interface CategoryRepository extends JpaRepository<CategoryDAO, Long> {

	
}
