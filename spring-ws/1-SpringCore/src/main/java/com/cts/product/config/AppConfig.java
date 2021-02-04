package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(value = {"com.cts.product.dao,com.cts.product.service,com.cts.product.controller"})
/*
@ComponentScans(value = { 
		@ComponentScan("com.cts.product.service"), 
		@ComponentScan("com.cts.product.dao"),
		@ComponentScan("com.cts.product.controller") })*/
public class AppConfig {
	

}
