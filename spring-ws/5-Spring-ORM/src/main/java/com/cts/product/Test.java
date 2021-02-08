package com.cts.product;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.dao.ProductDao;
import com.cts.product.dao.ProductDaoImpl;
import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		
		Product p1=new Product("Laptop", "Intel Core I7 11th Gen 32GB/512GB SSD M.2", 89000);
		Product p2=new Product("Mobile", "Samgung s22 ultra", 110000);
		Product p3=new Product("Watch", "Apple Watch", 56000);
		Product p4=new Product("Mac Book", "Mac Book Pro 15 Inch", 260000);
		Product p5=new Product("Pen-Drive", "HP 32 GB USB 3.1", 1200);
		

		// ?? where to save it.. > info session factory

		ProductService ps = ac.getBean(ProductService.class);
		
		ps.save(p1);
		ps.save(p2);
		ps.save(p3);
		ps.save(p4);
		ps.save(p5);
		
		

		System.out.println("Product Object is saved ....");
	}

}
