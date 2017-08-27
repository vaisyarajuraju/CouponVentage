package com.jersey.shore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jersey.shore.dao.StoreDAO;

public interface StoreRepository extends JpaRepository<StoreDAO, Long> {

}
