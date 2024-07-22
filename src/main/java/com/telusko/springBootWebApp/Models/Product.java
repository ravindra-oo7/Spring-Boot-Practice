package com.telusko.springBootWebApp.Models;

import org.springframework.stereotype.Component;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Component
public class Product {
	
	private int prodId;
	private String prodName;
	private int prodPrice;

}
               