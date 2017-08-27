package com.jersey.shore.dto;

import java.util.Set;

import org.springframework.stereotype.Component;

@Component
public class CategoryDTO {

	private Long Id;
	private String name;
	private Set<Long> storeId;
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Set<Long> getStoreId() {
		return storeId;
	}
	public void setStoreId(Set<Long> storeId) {
		this.storeId = storeId;
	}
}
