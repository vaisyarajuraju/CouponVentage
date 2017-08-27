package com.jersey.shore.dao;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Category")
@Component
public class CategoryDAO {
	
	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "Id")
	private Long Id;
    
    @Column(name = "name")
	private String name;
    
    
//	private Set<Long> storeId;
	
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
//	public Set<Long> getStoreId() {
//		return storeId;
//	}
//	public void setStoreId(Set<Long> storeId) {
//		this.storeId = storeId;
//	}
//	
}
