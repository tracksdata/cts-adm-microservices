package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.cts.product.config.AppConfig;
import com.cts.product.service.ProductServiceImpl;

public class Test {

	public static void main(String[] args) {
		
		
		// Spring to Store All beans in the context object
		
		// Load all beans from context
		
		ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
		
		ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		
		
		//ProductServiceImpl prodService = new ProductServiceImpl();
		
		ps.loadProducts();
		

	}

}
