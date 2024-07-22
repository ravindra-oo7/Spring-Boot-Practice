package com.telusko.springBootWebApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telusko.springBootWebApp.models.Product;

@Repository
public interface ProductRepo extends JpaRepository<Product, Integer>{

}
