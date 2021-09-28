package com.honsoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.honsoft.entity.Product;
import com.honsoft.service.ProductService;

@Controller
public class HomeController {
	 @Autowired
	 private ProductService service;
	 
	@GetMapping("/home")
	public String home(Model model) {
		List<Product> listProducts = service.listAll();
        model.addAttribute("products", listProducts);
		return "home";
	}
}
