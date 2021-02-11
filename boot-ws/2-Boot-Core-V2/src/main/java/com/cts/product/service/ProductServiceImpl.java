package com.cts.product.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDaoImpl;

@Service
@PropertySource("abc.properties")
public class ProductServiceImpl {
	
	@Autowired
	private ProductDaoImpl dao;
	
	@Value("${name}")
	private String personName;
	
	@Value("${aname}")
	private String associateName;
	
	
	
	public void save() {
		System.out.println("Person: "+personName);
		System.out.println("Associate: "+associateName);

		System.out.println("-- save method from ProductServiceImpl class");
		dao.save();
	}
}
