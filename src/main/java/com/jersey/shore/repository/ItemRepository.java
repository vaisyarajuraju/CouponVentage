package com.jersey.shore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jersey.shore.dao.ItemDAO;

public interface ItemRepository extends JpaRepository<ItemDAO, Long> {

}
