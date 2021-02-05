package com.cts.product.dao;

import org.springframework.stereotype.Repository;

import com.cts.product.model.Product;

@Repository
public class StoreUpdateDaoImpl implements ProductDao{
	
	public void save(Product product) {
		System.out.println("DAO: StoreUpdateDaoImpl : "+product.getName()+"Saved to DB");
		
	}

}
