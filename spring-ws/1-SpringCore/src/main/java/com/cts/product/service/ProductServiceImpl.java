package com.cts.product.service;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@Service
//@Repository
//@Configuration
//@Controller
//@Component
public class ProductServiceImpl {

	public ProductServiceImpl() {
		System.out.println("-- ProductServiceImpl class object created...");
	}

	public void loadProducts() {
		System.out.println("--- loadProducts method of ProductServiceImpl class..");
	}

	
	@Bean
	public void f2() {
		System.out.println("--- f2 method");
	}
	
	@Bean
	public void f1() {
		System.out.println("--- f1 method");
	}

	
	
	
	
}
