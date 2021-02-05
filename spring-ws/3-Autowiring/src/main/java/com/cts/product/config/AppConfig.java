package com.cts.product.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.cts.product.service,com.cts.product.dao")
public class AppConfig { }
