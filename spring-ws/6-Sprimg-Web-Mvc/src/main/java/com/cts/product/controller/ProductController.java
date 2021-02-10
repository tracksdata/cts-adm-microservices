package com.cts.product.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.cts.product.entity.Product;
import com.cts.product.service.ProductService;

@Controller
public class ProductController {
	
	
	@Autowired
	private ProductService ps;
	
	@RequestMapping(value = "/s1")
	public void f1() {
		System.out.println(">>>> ProductController f1 method");
	}
	
	
	@RequestMapping("/s2")
	public String f2() {
		System.out.println(">>>> ProductController f2 method");

		return "one";
	}
	
	
	@RequestMapping("/s3")
	public String f3(Model model) {
		System.out.println(">>>> ProductController f3 method");
		
		String s1="Praveen";
		String[] cities= {"Chennai","Kolkata","Hyderabad","Pune"};
		
		model.addAttribute("name", s1);
		model.addAttribute("mycities",cities);
		
		return "two";
	}
	
	
	//  load form
	
	@RequestMapping("/")
	public String loadForm() {
		return "form";
	}
	
	
	
	@RequestMapping("/s5")
	public String processForm(@RequestParam("id")int id,
			@RequestParam("name")String name,
			@RequestParam("price")double price,
			@RequestParam("description")String description) {
		System.out.println(">>>>>> Form Submited.... ");
		System.out.println("Product ID: "+id);
		System.out.println("Product Name: "+name);
		System.out.println("Product Price: "+price);
		System.out.println("Product Description: "+description );

		return "form";
	}
	
	
	// list all records 
	
	@RequestMapping("/findAll")
	public String findAll(Model model) {
		model.addAttribute("products", ps.findAll());
		
		return "products";
	}
	
	
	// write data to db
	@RequestMapping("/s6")
	public String processFormV1(@ModelAttribute Product product) {
		
		
		ps.save(product);
	

		return "redirect:/findAll";
	}
	
	
	
	@RequestMapping("/s4")
	public ModelAndView f4() {
		System.out.println(">>>> ProductController f4 method");
		
		ModelAndView mav=new ModelAndView();
		
		String s1="Praveen S";
		String[] cities= {"Chennai","Kolkata","Hyderabad","Pune"};
		
		mav.setViewName("two");
		mav.addObject("name", s1);
		mav.addObject("mycities", cities);

		return mav;
	}
	
	
	
	
	

}
