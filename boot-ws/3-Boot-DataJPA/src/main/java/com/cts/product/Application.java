package com.cts.product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ApplicationContext ac = SpringApplication.run(Application.class, args);

		ProductDao prodDao = ac.getBean(ProductDao.class);

		Product product = new Product();
		
		product.setName("Mobile");
		product.setPrice(120000);
		product.setDescription("Samsung S21 Ultra");

		// prodDao.save(product);
		
		Product p = prodDao.findById(3).orElse(null);
		p.setDescription("Intel I7 11th Gen with 8 MB cache, 16 GB DDR4 Ram");
	
		prodDao.save(p);

		prodDao.findAll().forEach(prod -> {
			System.out.println(prod.getId());
			System.out.println(prod.getName());
			System.out.println(prod.getPrice());
			System.out.println(prod.getDescription());

			System.out.println("-------------------------");

		});

	}

}
