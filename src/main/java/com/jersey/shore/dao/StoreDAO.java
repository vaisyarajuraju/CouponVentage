package com.jersey.shore.dao;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Store")
public class StoreDAO {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "Id")
	private Long Id;
    
    @Column(name = "name")
	private String name;
    
    @Column(name = "categoryId")
	private Long categoryId;
    
    @Column(name = "stree1")
	private String street1;
    
    @Column(name = "stree2")
	private String street2;
    
    @Column(name = "city")
	private String city;
    
    @Column(name = "state")
	private String state;
    
    @Column(name = "zip")
	private Integer zip;
    
    
//	private Set<Long> items;
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
	public Long getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(Long categoryId) {
		this.categoryId = categoryId;
	}
	public String getStreet1() {
		return street1;
	}
	public void setStreet1(String street1) {
		this.street1 = street1;
	}
	public String getStreet2() {
		return street2;
	}
	public void setStreet2(String street2) {
		this.street2 = street2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Integer getZip() {
		return zip;
	}
	public void setZip(Integer zip) {
		this.zip = zip;
	}
//	public Set<Long> getItems() {
//		return items;
//	}
//	public void setItems(Set<Long> items) {
//		this.items = items;
//	}
}
