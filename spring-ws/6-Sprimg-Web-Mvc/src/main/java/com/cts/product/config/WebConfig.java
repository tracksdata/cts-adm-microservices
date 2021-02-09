package com.cts.product.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;
import org.thymeleaf.templateresolver.ITemplateResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.cts.product.controller")
public class WebConfig implements WebMvcConfigurer {

	// View layer thymeleaf configuration

	@Bean
    public ITemplateResolver templateResolver() {
        SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
        templateResolver.setPrefix( "/WEB-INF/templates/" );
        templateResolver.setSuffix( ".html" );
        templateResolver.setTemplateMode( "HTML5" );
 
        return templateResolver;
    }
 
    @Bean
    public SpringTemplateEngine templateEngine() {
        SpringTemplateEngine templateEngine = new SpringTemplateEngine();
        templateEngine.setTemplateResolver( templateResolver() );
         
        return templateEngine;
    }
 
    @Bean
    public ViewResolver viewResolver() {
        ThymeleafViewResolver viewResolver = new ThymeleafViewResolver();
        viewResolver.setTemplateEngine( templateEngine() );
        viewResolver.setOrder( 1 );
 
        return viewResolver;
    }
}
