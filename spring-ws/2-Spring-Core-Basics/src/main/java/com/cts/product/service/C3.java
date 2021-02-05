package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class C3 {
	public C3() {
		System.out.println("C3 class object created ");
	}

}
