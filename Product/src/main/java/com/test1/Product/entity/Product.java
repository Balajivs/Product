package com.test1.Product.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="ProductInformation")
public class Product {

	@Id
	@Column(name = "productId")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="productName")
	private String productName;
	
	@Column(name="productDesc")
	private String productDesc;
	
	@Column(name="quatity")
	private String quatity;
	
	@Column(name="price")
	private double price;
	
	
	
	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Product(Integer id, String productName, String productDesc, String quatity, double price) {
		super();
		this.id = id;
		this.productName = productName;
		this.productDesc = productDesc;
		this.quatity = quatity;
		this.price = price;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getQuatity() {
		return quatity;
	}
	public void setQuatity(String quatity) {
		this.quatity = quatity;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
}
