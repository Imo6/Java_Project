package com.emart.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emart.entities.Category;
import com.emart.services.CategoryManager;


@RestController  
@CrossOrigin("http://localhost:3000")
public class CategoryController
{
	@Autowired
	CategoryManager manager;
	
	
//	 @GetMapping(value = "api/categories")
//	 public List<Category> showProducts1()
//	 {
//		  return manager.getCategories(); 
//		
//	 }
	
	 @GetMapping(value = "api/categoriesById/{cid}")
	 public Optional<Category> getPro(@PathVariable int cid)
	 {
		Optional<Category> c=manager.getCategory(cid);
		return c;
	 }
	 
	 @GetMapping(value = "api/Categories")
	 public List<Category> getCategories()
	 {
		return manager.getSelectedCat();
	 }
	 
	 
	 
	 @GetMapping(value = "api/subcategories/{c_Id}")
	 public List<Category> getSubCategories(@PathVariable int c_Id)
	 {
		return manager.getSubCategories(c_Id);
	 }
	 
	 @DeleteMapping(value = "api/categories/{cid}")
	 public void removepro(@PathVariable int cid)
	 {
		manager.delete(cid);
	 }
	 /*
	 @PutMapping(value = "api/categories/{cid}")
	 public void updatepro(@RequestBody Category category,@PathVariable int cid)
	 {
		System.out.println("inside updatepro of controller");
		manager.update(category,cid);
	 }
	 */
	 @PostMapping(value = "api/categories")
	 public void addpro(@RequestBody Category category)
	 {
		System.out.println("addpro called");
		manager.addCategory(category);
	 }
	 
}