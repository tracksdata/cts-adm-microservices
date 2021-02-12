package com.cts.product.dao;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductDao {

	void save(Product product);

	List<Product> findAll();

	Product findById(int id);

}