package com.wipro.mvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.wipro.mvc.model.ProductVO;
import com.wipro.mvc.service.ProductManager;

@Controller
@RequestMapping("/products")
@SessionAttributes("product")
public class ProductController {
	
	@Autowired
	private ProductManager productManager;
	
	@RequestMapping(method = RequestMethod.GET)
	public String displayAllProducts(Model model) {
		List<ProductVO> products = productManager.getAllProducts();
		model.addAttribute("products", products);
		return "displayProducts";
	}
	
	@RequestMapping(method = RequestMethod.GET)
	public String setupForm(Model model) {
		ProductVO product = new ProductVO();
		model.addAttribute("product", product);
		return "addProduct";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String submitForm(@ModelAttribute("product") ProductVO productVO,
                            BindingResult result, SessionStatus status) {
		boolean error = false;
		
		if(productVO.getProductName().isEmpty()) {
			result.rejectValue("productName", "error.productName");
		}
		
		if(productVO.getProductPrice() == 0.00) {
			result.rejectValue("productPricee", "error.productPrice");
		}
		
		if(error) {
            return "addProduct";
        }
		
		status.setComplete();
		return "redirect:addNew/success";
	}

}
