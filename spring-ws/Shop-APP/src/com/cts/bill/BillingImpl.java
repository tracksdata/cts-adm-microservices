package com.cts.bill;

import com.cts.pricematrix.PriceMatrixImpl;
//Dependent
public class BillingImpl {
	
	
	private PriceMatrixImpl price; // reference object declaration
	
	public void setPrice(PriceMatrixImpl price) {
		this.price = price;
	}
	
	//public BillingImpl(PriceMatrixImpl price) {
	//	this.price=price;
	//}
	
	/*
	 * --------------------
	 * 	Design Issues
	 * --------------------
	 * 
	 * -> Too many dependency class object creations
	 * 		-> per of application goes down
	 * 		-> issues with memory management
	 * 
	 * 	Why this issue happened?
	 * -----------------------------
	 * -> Dependent class itself creating dependency class object diretly.
	 * 
	 * What is the solution?
	 * -----------------------
	 * -> Do not create dependency class objects in dependent class directly
	 * -> Instead, use techniques like JNDI (Java Naming Directory Interface)
	 * -> JNDI location is tightly coupled with dependent class
	 * 
	 * What is the best solution?
	 * ----------------------------
	 * -> Do not create, or find/lookup instead ask some (container) one to inject/pass. (IoC)-> Inversion of Control
	 *
	 *	How to Implement IoC? : using dependency injection principle
	 *	
	 *	What is Dependency Injection(DI)? 
	 *	-> Injecting Dependency object to the dependent is called DI.
	 *  
	 *  How many ways DI can be implemented? : 2 ways
	 *  1. Setter based injection : multiple times injections
	 *  2. Constructor based injection : single time injection
	 *  
	 *  Setter based injection
	 *  ------------------------
	 *  -> define dependency class object reference at class level
	 *  -> create setter for the above defined class reference
	 *  
	 *  
	 *
	 *
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
