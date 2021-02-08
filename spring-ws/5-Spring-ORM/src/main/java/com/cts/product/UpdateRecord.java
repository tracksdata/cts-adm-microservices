package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class UpdateRecord {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		//Product p1=new Product("Laptop", "Dell Intel Core I7 11th Gen 32GB/512GB SSD M.2", 92000);
	
		ProductService ps = ac.getBean(ProductService.class);
		
		Product p1=ps.findById(1);
		
		p1.setName("Dell Laptop");
		p1.setDescription("Dell Intel Core I7 11th Gen 32GB/512GB SSD M.2");
		p1.setPrice(92000);
	
		ps.update(p1);
		
		System.out.println("Product Object is updated ....");
	}

}
