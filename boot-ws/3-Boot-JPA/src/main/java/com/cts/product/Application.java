package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ProductService ps = ac.getBean(ProductService.class);

		Product product = new Product();
		product.setName("Pen");
		product.setPrice(76);
		product.setDescription("Red Ink");

		ps.save(product);

		System.out.println("----- DONE -----");

	}

}
