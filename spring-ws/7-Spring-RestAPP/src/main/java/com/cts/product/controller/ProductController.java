package com.cts.product.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@RestController
@CrossOrigin()
@RequestMapping("/api/products")
public class ProductController {

	@Autowired
	private ProductService ps;

	@GetMapping
	public List<Product> f1() {
		return ps.findAll();
	}

	@GetMapping("/v1")
	public String f6() {
		return "Welcome to Spring rest application: GET-V1";
	}

	@GetMapping("/v2")
	public String f7() {
		return "Welcome to Spring rest application: GET-V2";
	}

	@GetMapping("/{mydata}")
	public String f8(@PathVariable("mydata") Object obj) {
		return "Welcome to Spring rest application: " + obj;
	}

	@GetMapping("/{mydata1}/{mydata2}")
	public String f9(@PathVariable("mydata1") Object obj1, @PathVariable("mydata2") Object obj2) {
		return "Welcome to Spring rest application: " + obj1 + " and " + obj2;
	}

	@PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
	public Product f2(@RequestBody Product product) {

		return ps.save(product);
	}

	@PutMapping
	public Product f3(@RequestBody Product product) {
		
		ps.update(product);
		
		return  product;
	}

	@PatchMapping
	public String f4() {
		return "Welcome to Spring rest application: PATCH";
	}

	@DeleteMapping
	public String f5() {
		return "Welcome to Spring rest application: DELETE";
	}

}
