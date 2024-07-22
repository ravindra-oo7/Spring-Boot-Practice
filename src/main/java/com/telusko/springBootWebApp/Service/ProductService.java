package com.telusko.springBootWebApp.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.telusko.springBootWebApp.models.Product;
import com.telusko.springBootWebApp.repository.ProductRepo;

@Service
public class ProductService {
	
	@Autowired
	ProductRepo prodRepo;
	
//	List<Product> products = new ArrayList<>(Arrays.asList(
//			
//			new Product(101,"Motorola",14000),
//			new Product(102,"Iphone",125000),
//			new Product(103,"Samsung",10000)
//			));
	
//--------------------------------------------------------------------
	//Get All Products
	
	public List<Product> getProduct()
	{
		return prodRepo.findAll();
	}
	
//--------------------------------------------------------------------
	//Get Product by ID
		
	public Product getProductById(int prodId) 
	{		
		return prodRepo.findById(prodId).orElse(new Product());
	}

//--------------------------------------------------------------------
	// Add Product
	
	public void addProduct(Product prod)
	{
		prodRepo.save(prod);
	}
	
//-------------------------------------------------------------------
	//Update Existing Product
	
	public void updateProduct(Product prod) 
	{
		prodRepo.save(prod);
	}
//-------------------------------------------------------------------
	//Delete Existing Product
	
	public void deleteProduct(int prodId) 
	{
		prodRepo.deleteById(prodId);
	}
			
	
	
	
}
