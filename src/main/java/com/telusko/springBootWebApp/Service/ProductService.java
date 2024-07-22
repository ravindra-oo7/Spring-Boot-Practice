package com.telusko.springBootWebApp.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Service;

import com.telusko.springBootWebApp.Models.Product;

@Service
public class ProductService {
	
	List<Product> products = new ArrayList<>(Arrays.asList(
			
			new Product(101,"Motorola",14000),
			new Product(102,"Iphone",125000),
			new Product(103,"Samsung",10000)
			));
	
//--------------------------------------------------------------------
	//Get All Products
	
	public List<Product> getProduct()
	{
		return products;
	}
	
//--------------------------------------------------------------------
	//Get Product by ID
		
	public Product getProductById(int prodId) 
	{
		for (Product product : products) 
		{
			if(product.getProdId()==prodId)
			{
				return product;
			}
		}
		
		return new Product(000,"No Item",00000);
	}

//--------------------------------------------------------------------
	//Get Add Product
	
	public void addProduct(Product prod)
	{
		products.add(prod);
	}
	
//-------------------------------------------------------------------
	//Update Existing Product
	
	public void updateProduct(Product prod) 
	{
		for (Product product : products) 
		{
			if(prod.getProdId()==product.getProdId())
			{
				product.setProdName(prod.getProdName());
				product.setProdPrice(prod.getProdPrice());
			}
		}
			
	}
//-------------------------------------------------------------------
	//Delete Existing Product
	
	public void deleteProduct(int prodId) 
	{
		int counter = 0;
		for(Product product:products)
		{
			if(prodId==product.getProdId())
			{
				break;
			}
			counter++;
		}
		
		products.remove(counter);
	}
			
	
	
	
}
