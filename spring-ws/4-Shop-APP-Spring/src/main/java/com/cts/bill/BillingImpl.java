package com.cts.bill;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cts.pricematrix.PriceMatrix;
//Dependent
@Service
public class BillingImpl implements Billing {
	
	@Autowired
	private PriceMatrix price; // reference object declaration
	
	/*
	@Override
	public void setPrice(PriceMatrix price) {
		this.price = price;
	}
	*/

	
	public double getCartTotal(String[] cart) {

		double total = 0.0;

		//PriceMatrixImpl price = new PriceMatrixImpl();

		for (String itemCode : cart) {
			total = total + price.getItemPrice(itemCode);
		}

		return total;

	}

}
