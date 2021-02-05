package com.cts.product.service;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Service;

@Service
@Lazy
public class C4 {
	public C4() {
		System.out.println("C4 class object created ");
	}

}
