package com.cts.product.dao;

import java.util.List;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import com.cts.product.entity.Product;

@Repository
public class ProductDaoImpl implements ProductDao {

	@Autowired
	private SessionFactory sf;

	// CRUD operations
	// 1 . save Product
	public Product save(Product product) {
		Session ses = sf.getCurrentSession();
		ses.save(product);
		return product;
	}

	// 2. list all products
	@SuppressWarnings("unchecked")
	public List<Product> findAll() {
		return sf.getCurrentSession().createQuery("from Product").getResultList();
	}

	// 3. find product by ID : Unique ID
	public Product findById(int id) {

		return sf.getCurrentSession().get(Product.class, id);
	}

	// 4. Find all Products with Product Name
	@SuppressWarnings("unchecked")
	public List<Product> findByName(String productName) {
		return sf.getCurrentSession().createQuery("from Product as p where p.name like  '" + productName + "'")
				.getResultList();
	}

	// 5. Update Product
	public Product update(Product newProduct) {

		sf.getCurrentSession().update(newProduct);

		return newProduct;
	}

	// 6. Delete Product by Product Object
	public void delete(Product product) {
		sf.getCurrentSession().delete(product);
	}

	// 7. Delete Product By ID
	public void deleteById(int id) {
		sf.getCurrentSession().delete(findById(id));
	}

}
