package com.jersey.shore.rest;

import static com.jersey.shore.config.Constants.APPLICATION_NAME;
import static com.jersey.shore.config.Constants.COUPON;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jersey.shore.service.CouponService;

@Controller
@RequestMapping(value = "/"+ APPLICATION_NAME +"/"+COUPON+"/v1")
public class CouponController {

	
	private final Logger log = Logger.getLogger(CouponController.class);
	
	@Autowired
	CouponService service;
}
