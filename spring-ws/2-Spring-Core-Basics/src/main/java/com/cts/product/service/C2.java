package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class C2 {
	
	public C2() {
		System.out.println("C2 class object created ");
	}
	

}
