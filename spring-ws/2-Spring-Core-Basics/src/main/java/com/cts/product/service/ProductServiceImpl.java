package com.cts.product.service;

import org.springframework.stereotype.Service;

//@Service(value = "s1")
public class ProductServiceImpl {

	public ProductServiceImpl() {
		System.out.println("ProductServiceImpl class object created...");
	}
	
	public void f1() {
		System.out.println("-- f1 ");
	}

}
