package com.jersey.shore.rest;

import static com.jersey.shore.config.Constants.APPLICATION_NAME;
import static com.jersey.shore.config.Constants.STORE;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jersey.shore.service.StoreService;

@Controller
@RequestMapping(value = "/"+ APPLICATION_NAME +"/"+STORE+"/v1")
public class StoreController {

	private final Logger log = Logger.getLogger(StoreController.class);
	
	@Autowired
	StoreService service;
}
