package com.emart.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.entities.Category;
import com.emart.entities.Product;
import com.emart.services.CategoryManager;
import com.emart.services.ProductManager;

@RestController  
@CrossOrigin("http://localhost:3000")
public class ProductController
{
	@Autowired
	ProductManager manager;
	
	
	 @GetMapping(value = "api/products")
	 public List<Product> showProducts1()
	 {
		  return manager.getProducts(); 
		
	 }
	
	 @GetMapping(value = "api/productsById/{pid}")
	 public Optional<Product> getPro(@PathVariable int pid)
	 {
		Optional<Product> p=manager.getProduct(pid);
		return p;
	 }
	 
	 
	 @DeleteMapping(value = "api/products/{pid}")
	 public void removepro(@PathVariable int pid)
	 {
		manager.delete(pid);
	 }
	
	 @PostMapping(value = "api/products")
	 public void addpro(@RequestBody Product product)
	 {
		System.out.println("addpro called");
		manager.addProduct(product);
	 }
	 @GetMapping(value="api/productsByCat/{cat_Id}")
	 public List<Product> getProductByCat(@PathVariable int cat_Id)
	 {
		 return manager.getProductByCat(cat_Id);
	 }
}
