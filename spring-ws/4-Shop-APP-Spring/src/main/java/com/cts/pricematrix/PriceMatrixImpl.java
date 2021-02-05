package com.cts.pricematrix;

import org.springframework.stereotype.Repository;

//Dependency
@Repository
public class PriceMatrixImpl implements PriceMatrix{
	
	public PriceMatrixImpl() {
		System.out.println("-- PriceMatrixImpl object created...");
	}

	public double getItemPrice(String itemCode) {

		// code to fetch price of a given item-code from DB

		return 100.00;

	}

}
