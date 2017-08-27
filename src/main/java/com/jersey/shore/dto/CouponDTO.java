package com.jersey.shore.dto;

import java.util.Date;
import java.util.UUID;

import org.springframework.stereotype.Component;

@Component
public class CouponDTO {

	private Long Id;
	private String type;
	private UUID couponCode;
	private Date startDate;
	private Date endDate;
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
