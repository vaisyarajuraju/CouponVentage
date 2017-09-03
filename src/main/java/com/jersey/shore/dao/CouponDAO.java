package com.jersey.shore.dao;

import java.util.Date;
import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name = "Coupon")
@Component
public class CouponDAO {

	private static final long serialVersionUID = 1L;
	
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE)
    @Column(name = "Id")
	private Long Id;
    
    @Column(name = "type")
	private String type;
    
    @Column(name = "couponCode")
	private UUID couponCode;
	
    @Column(name = "startDate")
    private Date startDate;
	
    @Column(name = "endDate")
    private Date endDate;

    @Column(name="storeId")
    private Long storeId;
    
    public Long getStoreId() {
		return storeId;
	}
	public void setStoreId(Long storeId) {
		this.storeId = storeId;
	}
	public Long getId() {
		return Id;
	}
	public void setId(Long id) {
		Id = id;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public UUID getCouponCode() {
		return couponCode;
	}
	public void setCouponCode(UUID couponCode) {
		this.couponCode = couponCode;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
}
