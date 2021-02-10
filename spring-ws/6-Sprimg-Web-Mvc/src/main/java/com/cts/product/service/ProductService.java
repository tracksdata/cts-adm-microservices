package com.cts.product.service;

import java.util.List;

import com.cts.product.entity.Product;

public interface ProductService {

	// 1 . save Product
	Product save(Product product);

	// 2. list all products
	List<Product> findAll();

	// 3. find product by ID : Unique ID
	Product findById(int id);

	// 4. Find all Products with Product Name
	List<Product> findByName(String productName);

	// 5. Update Product
	Product update(Product newProduct);

	// 6. Delete Product by Product Object
	void delete(Product product);

	// 7. Delete Product By ID
	void deleteById(int id);


}
