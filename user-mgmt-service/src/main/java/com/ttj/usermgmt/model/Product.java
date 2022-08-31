package com.ttj.usermgmt.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.Table;


@Entity
@Table(name="product")
public class Product{
	
	@Id
	@Column(name="id", nullable = false)
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="price", nullable = false)
	private Double price;
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}
	
	
}
