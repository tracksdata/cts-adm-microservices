package com;

import com.cts.bill.Billing;
import com.cts.bill.BillingImpl;
import com.cts.pricematrix.PriceMatrix;
import com.cts.pricematrix.PriceMatrixImpl;
public class Customer {

	public static void main(String[] args) {

		String[] cart1 = { "Item1", "Item2", "Item3" };
		String[] cart2 = { "Item1", "Item2" };

		// -------------------------------------------
		PriceMatrix price = new PriceMatrixImpl(); // Dependency class
		// -------------------------------------------

		// Thread t1=new Thread(price);
		// Thread t2=new Thread(price);

		// ----------------------------------------
		Billing biller = new BillingImpl(); // Dependent class
		// -----------------------------------------

		biller.setPrice(price); // Injection dependency object (price) to the dependent object (biller) is
								// called DI

		double total = biller.getCartTotal(cart1);
		System.out.println("Cart1 Total: " + total);

		total = biller.getCartTotal(cart2);
		System.out.println("Cart2 Total: " + total);

	}

}
