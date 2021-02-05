package com.cts.product.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

@Service
@Scope("prototype")
public class C1 {

	public C1() {
		System.out.println("C1 class object created with " + System.identityHashCode(this) + " hash code");
	}

	public void f1() {
		System.out.println("f1 method by " + System.identityHashCode(this) + " hashcode object");

	}

}
