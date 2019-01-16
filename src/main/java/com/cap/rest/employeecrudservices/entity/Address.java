package com.cap.rest.employeecrudservices.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
	private Integer flatNo;
	private String area;
	private String city;
	private String state;
	private Integer pincode;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatNo, String area, String city, String state, Integer pincode) {
		super();
		this.flatNo = flatNo;
		this.area = area;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
	}
	public Integer getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(Integer flatNo) {
		this.flatNo = flatNo;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
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
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}

}
