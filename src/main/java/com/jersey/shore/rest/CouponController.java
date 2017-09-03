package com.jersey.shore.rest;

import static com.jersey.shore.config.Constants.APPLICATION_NAME;
import static com.jersey.shore.config.Constants.COUPON;

import java.util.List;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.jersey.shore.dto.CategoryDTO;
import com.jersey.shore.dto.CouponDTO;
import com.jersey.shore.service.CouponService;

@Controller
@RequestMapping(value = "/"+ APPLICATION_NAME +"/"+COUPON+"/v1")
public class CouponController {

	
	private final Logger log = Logger.getLogger(CouponController.class);
	
	@Autowired
	CouponService service;

	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CouponDTO>> getCoupons(@RequestHeader HttpHeaders headers,@RequestParam Long storeId)
	{
		List<CouponDTO> couponDtos= service.getCoupons(headers,storeId);
		return new ResponseEntity<List<CouponDTO>>(couponDtos,HttpStatus.OK);
	}
	
	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CouponDTO> addCoupons(@RequestHeader HttpHeaders headers,@RequestParam Long storeId, @RequestParam CouponDTO dto)
	{
		CouponDTO couponDto= service.addCoupons(headers,storeId,dto);
		return new ResponseEntity<CouponDTO>(couponDto,HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CouponDTO> updateCoupon(@RequestHeader HttpHeaders headers,@RequestParam Long couponId,@RequestParam CouponDTO dto)
	{
		CouponDTO couponDto= service.updateCoupon(headers,couponId,dto);
		return new ResponseEntity<CouponDTO>(couponDto,HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * @param headers
	 * @param storeId
	 * @return
	 */
	@RequestMapping(method=RequestMethod.DELETE,produces= MediaType.APPLICATION_JSON_VALUE)
	public HttpStatus deleteCoupon(@RequestHeader HttpHeaders headers,@RequestParam Long couponId)
	{
//		service.deleteCoupon(headers,couponId);
		return HttpStatus.OK;
	}

	
	@RequestMapping(value= "/all", method=RequestMethod.DELETE, produces= MediaType.APPLICATION_JSON_VALUE)
	public HttpStatus deleteAllStoreCoupons(@RequestHeader HttpHeaders headers,@RequestParam Long storeId)
	{
//		service.deleteAllStoreCoupons(headers,storeId);
		return HttpStatus.OK;
	}

}
