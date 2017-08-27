package com.jersey.shore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Service;

import com.jersey.shore.dao.CategoryDAO;
import com.jersey.shore.dto.CategoryDTO;
import com.jersey.shore.repository.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	CategoryRepository repository;

	@Autowired
	CategoryDTO categoryDto;

	@Autowired
	CategoryDAO categoryDao;
	
	/**
	 * 
	 * @param headers
	 * @return
	 */
	public List<CategoryDTO> getCategories(HttpHeaders headers)
	{
		List<CategoryDTO> categortDtoList=new ArrayList<CategoryDTO>();
		List<CategoryDAO> categoryDaoList = repository.findAll();
		for(CategoryDAO categoryDao:categoryDaoList)
		{
			categortDtoList.add(convertToDto(categoryDao));
		}
		return categortDtoList;
	}

	
	/**
	 * 
	 * @param headers
	 * @param categoryId
	 * @return
	 */
	public CategoryDTO getCategory(HttpHeaders headers,Long categoryId)
	{
		return convertToDto(repository.getOne(categoryId));
	}
	
	
	/**
	 * 
	 * @param headers
	 * @param categoryId
	 * @return
	 */
	public CategoryDTO addCategory(HttpHeaders headers,CategoryDTO category)
	{
		return convertToDto(repository.getOne(repository.save(convertToDao(category)).getId()));
	}

	/**
	 * 
	 * @param headers
	 * @param categoryId
	 * @return
	 */
	public CategoryDTO updateCategory(HttpHeaders headers,CategoryDTO category)
	{
		return convertToDto(repository.getOne(repository.save(convertToDao(category)).getId()));
	}
	
	/**
	 * 
	 * @param headers
	 * @param category
	 * @return
	 */
	public void deleteCategory(HttpHeaders headers,CategoryDTO category)
	{
		repository.delete(convertToDao(category));
	}

	
	/**
	 * 
	 * @param dao
	 * @return
	 */
	public CategoryDTO convertToDto(CategoryDAO dao)
	{
		categoryDto.setId(dao.getId());
		categoryDto.setName(dao.getName());
		return categoryDto;
	}
	
	/**
	 * 
	 * @param dto
	 * @return
	 */
	public CategoryDAO convertToDao(CategoryDTO dto)
	{
		categoryDao = repository.getOne(dto.getId());
		categoryDao.setName(dto.getName());
		return categoryDao;
	}
}
