package com.jersey.shore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;

import com.jersey.shore.dao.CouponDAO;
import com.jersey.shore.dto.CouponDTO;
import com.jersey.shore.repository.CouponRepository;

@Service
public class CouponService {

	@Autowired
	CouponRepository repository;

	@Autowired
	CouponDAO daoAuto;
	
	@Autowired
	CouponDTO dtoAuto;
	
	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @return
	 */
	public List<CouponDTO> getCoupons(HttpHeaders headers,Long storeId)
	{
		List<CouponDAO> couponeDaoList = repository.findByStoreId(storeId);
		List<CouponDTO> couponDtoList = new ArrayList<CouponDTO>();
		for(CouponDAO daoObj:couponeDaoList)
		{
			couponDtoList.add(CouponDAOToDTO(dtoAuto,daoObj));
		}
		return couponDtoList;
	}

	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @param dto
	 * @return
	 */
	public CouponDTO addCoupons(HttpHeaders headers,Long storeId,CouponDTO dtoObj)
	{
		CouponDAO daoObj= CouponDTOToDAO(daoAuto,dtoObj);
		daoObj = repository.save(daoObj);
		
		dtoObj.setId(daoObj.getId());
		
		return dtoObj;
	}
	
	
	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @param dto
	 * @return
	 */
	public CouponDTO updateCoupon(HttpHeaders headers,Long couponId,CouponDTO dto)
	{
		daoAuto = repository.findOne(couponId);
		dto.setId(daoAuto.getId());
		CouponDAO daoObj = CouponDTOToDAO(daoAuto,dto);
		daoObj = repository.save(daoObj);
		
		return CouponDAOToDTO(dto,daoObj);
	}
	
	/**
	 * 
	 * @param dao
	 * @return
	 */
	public CouponDTO CouponDAOToDTO(CouponDTO dto, CouponDAO dao)
	{
		dto.setCouponCode(dao.getCouponCode());
		dto.setId(dao.getId());
		dto.setType(dao.getType());
		dto.setStartDate(dao.getStartDate());
		dto.setEndDate(dao.getEndDate());
		
		return dto;
	}

	/**
	 * 
	 * @param dto
	 * @return
	 */
	public CouponDAO CouponDTOToDAO(CouponDAO dao,CouponDTO dto)
	{
		dao.setCouponCode(dto.getCouponCode());
		dao.setId(dto.getId());
		dao.setType(dto.getType());
		dao.setStartDate(dto.getStartDate());
		dao.setEndDate(dto.getEndDate());
		
		return dao;
	}

}

