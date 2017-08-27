package com.jersey.shore.rest;

import static com.jersey.shore.config.Constants.APPLICATION_NAME;
import static com.jersey.shore.config.Constants.ITEM;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jersey.shore.service.ItemService;

@Controller
@RequestMapping(value = "/"+ APPLICATION_NAME +"/"+ITEM+"/v1")
public class ItemController {

	private final Logger log = Logger.getLogger(ItemController.class);
	
	@Autowired
	ItemService service;
}
