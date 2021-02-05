package com.cts.product.service;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.cts.product.dao.ProductDao;
import com.cts.product.model.Product;

@Service
//dependent
public class ProductServiceImpl implements ProductService { // dependent
	/*
	 * Who needs whom
	 * ---------------
	 * -> Dependents need Depdendencies
	 * -> When You want to inject a dependency in the dependent class, the use Autowire
	 * 
	 * When to use @Qualifier annotation?
	 * -----------------------------------
	 * -> When dependency Autowired interface has more than 1 implementation classes.
	 * 
	 * 
	 * How many ways a dependency can be autowired? : 2 ways
	 * 
	 * way 1: by type (class or interface name)
	 * way 2: by constructor
	 * 
	 * 
	 */
	
	@Autowired 
	@Qualifier(value = "storeUpdateDaoImpl")
	private ProductDao prodDao; // dependency // by class/interface type
	
	//@Autowired 
	//@Qualifier(value = "productDaoImpl")
	//private ProductDao prodDao1;
	
	
	//@Autowired
   // public ProductServiceImpl(ProductDao prodDao) {
	//	this.prodDao=prodDao;
	//}
	
	

	public void save(Product product) {
		
		System.out.println("Service: - ProductService ");
		prodDao.save(product); // whose class save method gets called?
		//prodDao1.save(product);
	}
	
	
	
	
	

}
