package com.telusko.springBootWebApp.Controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.springBootWebApp.Models.Product;
import com.telusko.springBootWebApp.Service.ProductService;

@RestController
public class ProductController {
	
	@Autowired
	ProductService productService;
	
//------------------------------------------------------------------	
	@GetMapping("/products")
	public List<Product> getProducts()
	{
		return productService.getProduct();             
	}

//------------------------------------------------------------------	
	@GetMapping("/products/{prodId}")
	public Product getProductById(@PathVariable int prodId)
	{
		return productService.getProductById(prodId);
	}
	
//------------------------------------------------------------------
	@PostMapping("/products")
	public void addProduct(@RequestBody Product prod)
	{
		System.out.println(prod);
		productService.addProduct(prod);
	}

//-------------------------------------------------------------------
	@PutMapping("/products")
	public void updateProduct(@RequestBody Product prod)
	{
		productService.updateProduct(prod);
	}

//--------------------------------------------------------------------
	@DeleteMapping("/products/{prodId}")
	public void deleteProduct(@PathVariable int prodId)
	{
		productService.deleteProduct(prodId);
	}

	

}
                      