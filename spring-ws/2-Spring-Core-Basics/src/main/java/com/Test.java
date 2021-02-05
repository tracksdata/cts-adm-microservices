package com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.cts.product.config.AppConfig;
import com.cts.product.service.C1;

public class Test {

	public static void main(String[] args) {

		System.out.println("-- main");

		ApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);

		// ProductServiceImpl ps = ac.getBean(ProductServiceImpl.class);
		// ProductServiceImpl ps=(ProductServiceImpl) ac.getBean("s1");
		// C1 c1=ac.getBean(C1.class);
		// ps.f1();
		// c1.f2();

		C1 c1 = ac.getBean(C1.class);
		C1 c2 = ac.getBean(C1.class);
		C1 c3 = ac.getBean(C1.class);

		c1.f1();
		c2.f1();
		c3.f1();

	}

}
