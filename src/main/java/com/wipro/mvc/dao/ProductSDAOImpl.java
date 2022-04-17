package com.wipro.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.wipro.mvc.model.ProductVO;

@Repository
public class ProductSDAOImpl implements ProductDAO {

	public List<ProductVO> getAllProducts() {
		
		List<ProductVO> products = new ArrayList<ProductVO>();
		
		products.add(new ProductVO(100L, "Sausage", 15.99));
		products.add(new ProductVO(101L, "Burger", 13.99));
		products.add(new ProductVO(102L, "Milk Bread", 8.99));
		products.add(new ProductVO(103L, "Moon Donut", 7.99));
		products.add(new ProductVO(105L, "Fried Chicken", 21.99));
		
		return products;
	}
	
}
