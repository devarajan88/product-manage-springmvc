package com.wipro.mvc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wipro.mvc.dao.ProductDAO;
import com.wipro.mvc.model.ProductVO;

@Service
public class ProductManagerImpl implements ProductManager {

	@Autowired
	private ProductDAO productDao;
	
	public List<ProductVO> getAllProducts(){
		return productDao.getAllProducts();
	}
}
