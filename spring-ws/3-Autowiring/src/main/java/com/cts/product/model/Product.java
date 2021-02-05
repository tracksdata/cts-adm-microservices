package com.cts.product.model;

public class Product {

	private int id;
	private String name;
	private String descripttion;
	private double price;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescripttion() {
		return descripttion;
	}

	public void setDescripttion(String descripttion) {
		this.descripttion = descripttion;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
