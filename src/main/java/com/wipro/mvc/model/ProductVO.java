package com.wipro.mvc.model;

import java.io.Serializable;

public class ProductVO implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Long productId;
	
	private String productName;
	
	private double productPrice;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public ProductVO(Long productId, String productName, double productPrice) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public ProductVO() {
	}
	
}
