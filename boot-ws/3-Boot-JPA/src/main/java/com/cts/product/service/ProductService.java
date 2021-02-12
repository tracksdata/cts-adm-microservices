package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	void save(Product product);

	List<Product> findAll();

	Product findById(int id);

}
