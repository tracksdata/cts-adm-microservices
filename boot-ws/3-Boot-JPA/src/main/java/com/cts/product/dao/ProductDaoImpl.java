package com.cts.product.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@PersistenceContext
	private EntityManager em;

	@Override
	public void save(Product product) {
		em.persist(product);
	}

	@Override
	public List<Product> findAll() {
		return em.createQuery("from Product").getResultList();
	}

	@Override
	public Product findById(int id) {
		return em.find(Product.class, id);
	}

}
