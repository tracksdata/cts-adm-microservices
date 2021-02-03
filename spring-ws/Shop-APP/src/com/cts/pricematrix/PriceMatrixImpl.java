package com.cts.pricematrix;

//Dependency
public class PriceMatrixImpl implements PriceMatrix{
	
	/*
	 * Types of objects: 2 types
	 * 1. Dependency class object : Never depends on any other objects
	 * 2. Dependent class object :  Always depends on dependency object
	 */
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl object created...");
	}

	@Override
	public double getItemPrice(String itemCode) {

		// code to fetch price of a given item-code from DB

		return 100.00;

	}

}
