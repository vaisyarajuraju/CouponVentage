package com.jersey.shore.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jersey.shore.dao.CouponDAO;

public interface CouponRepository extends JpaRepository<CouponDAO, Long> {

}
