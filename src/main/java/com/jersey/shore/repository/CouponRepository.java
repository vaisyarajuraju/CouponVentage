package com.jersey.shore.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jersey.shore.dao.CouponDAO;

/**
 * 
 * @author User
 *
 */
public interface CouponRepository extends JpaRepository<CouponDAO, Long> {

	public List<CouponDAO> findByStoreId(Long storeId);
}
