package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.model.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		ProductService ps = ac.getBean(ProductService.class);

		Product product = new Product(); // Business logic class / model / DTO

		product.setId(10);
		product.setName("Pen");
		product.setPrice(76);
		product.setDescripttion("red ink");

		// ps.setProdDao(prodDao); // DI

		ps.save(product);

	}

}
