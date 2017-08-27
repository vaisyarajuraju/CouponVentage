package com.jersey.shore.rest;

import static com.jersey.shore.config.Constants.APPLICATION_NAME;
import static com.jersey.shore.config.Constants.CATEGORY;

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
import com.jersey.shore.service.CategoryService;


@Controller
@RequestMapping(value = "/"+ APPLICATION_NAME +"/"+CATEGORY+"/v1")
public class CategoryController {

	private final Logger log = Logger.getLogger(CategoryController.class);
	
	@Autowired
	CategoryService service;

	/**
	 * 
	 * @param headers
	 * @return
	 */
	@RequestMapping(method=RequestMethod.GET,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<CategoryDTO>> getCategories(@RequestHeader HttpHeaders headers)
	{
		List<CategoryDTO> categoryDto = service.getCategories(headers);
		return new ResponseEntity<List<CategoryDTO>>(categoryDto,HttpStatus.OK);
	}
	

	/**
	 * 
	 * @param headers
	 * @param category
	 * @return
	 */
	@RequestMapping(method=RequestMethod.POST,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryDTO> addCategory(@RequestHeader HttpHeaders headers,@RequestParam CategoryDTO category)
	{
		CategoryDTO categoryDto = service.addCategory(headers,category);
		return new ResponseEntity<CategoryDTO>(categoryDto,HttpStatus.OK);
	}
	
	
	/**
	 * 
	 * @param headers
	 * @param category
	 * @return
	 */
	@RequestMapping(method=RequestMethod.PUT,produces= MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<CategoryDTO> updateCategory(@RequestHeader HttpHeaders headers,@RequestParam CategoryDTO category)
	{
		CategoryDTO categoryDto = service.updateCategory(headers,category);
		return new ResponseEntity<CategoryDTO>(categoryDto,HttpStatus.OK);
	}

	/**
	 * 
	 * @param headers
	 * @param category
	 * @return
	 */
	@RequestMapping(method=RequestMethod.DELETE,produces= MediaType.APPLICATION_JSON_VALUE)
	public HttpStatus deleteCategory(@RequestHeader HttpHeaders headers,@RequestParam CategoryDTO category)
	{
		service.deleteCategory(headers,category);
		return HttpStatus.OK;
	}
}
