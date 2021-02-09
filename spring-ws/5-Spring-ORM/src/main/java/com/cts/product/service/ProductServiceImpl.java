package com.cts.product.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.cts.product.dao.ProductDao;
import com.cts.product.entity.Product;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductDao prodDao;

	@Transactional
	public Product save(Product product) {
		return prodDao.save(product);
	}

	@Transactional
	public List<Product> findAll() {

		return prodDao.findAll();
	}

	@Transactional
	public Product findById(int id) {

		return prodDao.findById(id);
	}

	@Transactional
	public List<Product> findByName(String productName) {
		return prodDao.findByName(productName);
	}

	@Transactional(propagation = Propagation.NESTED)
	@Override
	public Product update(Product newProduct) {
		return prodDao.update(newProduct);
	}

	@Transactional
	public void delete(Product product) {
		prodDao.delete(product);

	}

	@Transactional
	public void deleteById(int id) {
		prodDao.deleteById(id);

	}



}
