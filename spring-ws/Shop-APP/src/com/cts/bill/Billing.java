package com.cts.bill;

import com.cts.pricematrix.PriceMatrix;

public interface Billing {

	void setPrice(PriceMatrix price);
	double getCartTotal(String[] cart);

}